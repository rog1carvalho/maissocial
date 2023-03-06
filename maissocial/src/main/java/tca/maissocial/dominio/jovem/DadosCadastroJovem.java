package tca.maissocial.dominio.jovem;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import tca.maissocial.dominio.endereco.DadosEndereco;

public record DadosCadastroJovem(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String senha,
        @NotBlank
        String telefone,
        @Min(14)
        @Max(24)
        @Pattern(regexp = "\\d{2}")
        String idade,
        @NotBlank @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}")
        String cpf,
        @NotNull
        Curso curso,
        @NotNull @Valid
        DadosEndereco endereco) {
}
