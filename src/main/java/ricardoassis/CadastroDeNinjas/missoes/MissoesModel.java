package ricardoassis.CadastroDeNinjas.missoes;

import jakarta.persistence.*;
import ricardoassis.CadastroDeNinjas.ninjas.NinjaModel;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;

    private String dificuldadeMissao;

    // @OneToMany uma missao pode ter varios ninjas 1 <-> Many
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getDificuldadeMissao() {
        return dificuldadeMissao;
    }

    public void setDificuldadeMissao(String dificuldadeMissao) {
        this.dificuldadeMissao = dificuldadeMissao;
    }

    public List<NinjaModel> getNinjas() {
        return ninjas;
    }

    public void setNinjas(List<NinjaModel> ninjas) {
        this.ninjas = ninjas;
    }
}
