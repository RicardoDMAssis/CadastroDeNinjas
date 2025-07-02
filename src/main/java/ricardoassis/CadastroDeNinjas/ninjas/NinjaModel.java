package ricardoassis.CadastroDeNinjas.ninjas;

import jakarta.persistence.*;
import ricardoassis.CadastroDeNinjas.missoes.MissoesModel;

import java.util.List;

// Transforma uma classe em uma entidade do banco de dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private int idade;

    private String email;

    // @ManyToOne um ninja para uma missao; 1 <-> 1
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign Key || chave estrangeira
    private MissoesModel missoes;


    public NinjaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
