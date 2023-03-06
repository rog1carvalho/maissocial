package tca.maissocial.dominio.jovem;

import tca.maissocial.dominio.endereco.Endereco;

public record DadosDetalhamentoJovem(Long id, String nome, String email, String senha, String telefone, String idade, String cpf, Curso curso, Endereco endereco) {
    public DadosDetalhamentoJovem (Jovem jovem){
        this (jovem.getId(), jovem.getNome(), jovem.getEmail(), jovem.getSenha(), jovem.getTelefone(), jovem.getIdade(), jovem.getCpf(), jovem.getCurso(), jovem.getEndereco());
    }
}
