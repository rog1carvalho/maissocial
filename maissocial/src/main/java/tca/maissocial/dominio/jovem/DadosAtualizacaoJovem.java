package tca.maissocial.dominio.jovem;

import jakarta.validation.constraints.NotNull;
import tca.maissocial.dominio.endereco.DadosEndereco;

public record DadosAtualizacaoJovem(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco,
        String email,
        String senha,
        Curso curso){
}

