package tca.maissocial.dominio.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Endereco {
    private String rua;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.rua = dados.rua();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if (dados.rua()!=null){
            this.rua=dados.rua();
        }
        if (dados.bairro()!=null){
            this.bairro=dados.bairro();
        }
        if (dados.cep()!=null){
            this.rua=dados.cep();
        }
        if (dados.uf()!=null){
            this.rua=dados.uf();
        }
        if (dados.cidade()!=null){
            this.rua=dados.cidade();
        }
        if (dados.numero()!=null){
            this.rua=dados.numero();
        }
        if (dados.complemento()!=null){
            this.complemento=dados.complemento();
        }
    }
}
