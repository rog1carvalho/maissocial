package tca.maissocial.dominio.jovem;

public record DadosAutenticacao(String email, String senha) {
    public DadosAutenticacao(Jovem jovem) {
        this (jovem.getEmail(), jovem.getSenha());
    }
}
