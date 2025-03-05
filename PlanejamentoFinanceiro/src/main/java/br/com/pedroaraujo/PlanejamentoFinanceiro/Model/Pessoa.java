package br.com.pedroaraujo.PlanejamentoFinanceiro.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;
@Entity
@Table(name = "TB_PESSOA")
public abstract class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PESSOA")
    private UUID idPessoa;
    @Getter
    @Setter
    @Column(name = "NOME_COMPLETO")
    private String nomeCompleto;
    @Getter
    @Setter
    @Column(name = "EMAIL")
    private String email;


    public UUID getId() {
        return idPessoa;
    }
}
