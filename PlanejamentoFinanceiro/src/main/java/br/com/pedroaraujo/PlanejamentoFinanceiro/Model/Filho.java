package br.com.pedroaraujo.PlanejamentoFinanceiro.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;
@Entity
@Table(name = "TB_FILHO")
public class Filho implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_FILHO")
    private UUID idFilho;
    @OneToOne
    @JoinColumn(name = "ID_CLIENTE")
    @Getter
    @Setter
    private Cliente cliente;
    @Getter
    @Setter
    @Column(name = "IDADE")
    private String dataDeNacimento;

    public UUID getId() {
        return idFilho;
    }
}
