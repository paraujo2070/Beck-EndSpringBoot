package br.com.pedroaraujo.PlanejamentoFinanceiro.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;
@Entity
@Table(name = "TB_PROFISSAO")
public class Profissao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PROFISSAO")
    private UUID idProfissao;
    @OneToOne
    @JoinColumn(name = "ID_CLIENTE")
    @Getter
    @Setter
    private Cliente cliente;
    @Getter
    @Setter
    @Column(name = "PROFISSAO_ATUAL")
    private String profissaoAtual;
    @Getter
    @Setter
    @Column(name = "REMUNERACAO_LIQUIDA_ATUAL")
    private String remuneracaoLiquidaAtual;
    @Getter
    @Setter
    @Column(name = "OUTRAS_FONTES_DE_RENDA")
    private String outrasFontesDeRenda;
    @Getter
    @Setter
    @Column(name = "INSS_PREVISTO_NA_POSENTADORIA")
    private Boolean INSSPrevistoNaAposentadoria;

    public UUID getId() {
        return idProfissao;
    }
}
