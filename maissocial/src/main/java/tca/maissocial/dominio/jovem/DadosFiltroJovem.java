package tca.maissocial.dominio.jovem;

public record DadosFiltroJovem(Long id,String nome, String email, String idade,String cpf, String bairro, Curso curso) {
    public DadosFiltroJovem (Jovem jovem){
        this(jovem.getId(), jovem.getNome(), jovem.getEmail(), jovem.getIdade(), jovem.getCpf(), jovem.getEndereco().getBairro(), jovem.getCurso());
    }
}
