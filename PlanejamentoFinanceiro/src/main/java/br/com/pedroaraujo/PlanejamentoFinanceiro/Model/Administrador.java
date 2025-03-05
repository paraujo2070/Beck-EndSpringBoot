package br.com.pedroaraujo.PlanejamentoFinanceiro.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_ADMINISTRADOR")
public class Administrador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_ADMINISTRADOR")
    private UUID idAdministrador;
    @Getter
    @Setter
    @Column(name = "SENHA")
    private String senha;

    public UUID getId() {
        return idAdministrador;
    }
}
