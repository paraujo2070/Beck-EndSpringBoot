package br.com.pedroaraujo.PlanejamentoFinanceiro.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;
@Entity
@Table(name = "TB_CONJUGE")
public class Conjuge implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CONJUGE")
    private UUID idConjuge;
    @OneToOne
    @JoinColumn(name = "ID_CLIENTE")
    @Getter
    @Setter
    private Cliente cliente;
    @Getter
    @Setter
    @Column(name = "NOME_DO_CONJUGE")
    private String nomeDoConjuge;
    @Getter
    @Setter
    @Column(name = "DATA_NASCIMENTO_CONJUGE")
    private String dataDeNascimentoDoConjuge;
    @Getter
    @Setter
    @Column(name = "EXPECTATIVA_DE_VIDA_CONJUGE")
    private String expectativaDeVidaConjuge;



    public UUID getId() {
        return idConjuge;
    }
}
