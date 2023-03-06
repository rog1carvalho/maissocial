package tca.maissocial.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import tca.maissocial.dominio.jovem.*;

@RestController
@RequestMapping("jovens")
public class JovemController {
    @Autowired
    private JovemRepository repository;
    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroJovem dados, UriComponentsBuilder uriBuilder){
        var jovem = new Jovem(dados);
        repository.save(new Jovem(dados));
        var uri = uriBuilder.path("/jovens/{id}").buildAndExpand(jovem.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoJovem(jovem));
    }
    @GetMapping
    public ResponseEntity<Page<DadosFiltroJovem>>filtro (@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
       var page = repository.findAll(paginacao).map(DadosFiltroJovem::new);
       return ResponseEntity.ok(page);
    }
    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizacaoJovem dados){
        var jovem = repository.getReferenceById(dados.id());
        jovem.atualizarInformacoes(dados);
        return ResponseEntity.ok(new DadosDetalhamentoJovem(jovem));
    }
    @GetMapping("/{id}")
    public ResponseEntity detalhar (@PathVariable Long id){
        var jovem = repository.getReferenceById(id);
        return ResponseEntity.ok(new DadosDetalhamentoJovem(jovem));
    }
}
