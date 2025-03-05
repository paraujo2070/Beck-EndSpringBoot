package br.com.pedroaraujo.PlanejamentoFinanceiro.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;
@Entity
@Table(name = "TB_FINANCEIRO")
public class Financeiro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_FINANCEIRO")
    private UUID idFinanceiro;
    @OneToOne
    @JoinColumn(name = "ID_CLIENTE")
    @Getter
    @Setter
    private Cliente cliente;
    @Getter
    @Setter
    @Column(name = "CAPACIDADE_POUPAR_ATUAL")
    private Integer capacidadeDePouparHoje;
    @Getter
    @Setter
    @Column(name = "ESTIMATIVA_DE_DESPESA_MENSAL")
    private Integer estimativaDeDespesaMensal;
    @Getter
    @Setter
    @Column(name = "TIPO_DECLARACAO_IRPF")
    private String tipoDeclaracaoIRPF;
    @Getter
    @Setter
    @Column(name = "BENS_IMOVEIS")
    private String bensImoveis;
    @Getter
    @Setter
    @Column(name = "BENS_MOVEIS")
    private String bensMoveis;
    @Getter
    @Setter
    @Column(name = "EMPRESTIMOS_E_DIVIDAS")
    private String emprestimosEDividas;
    @Getter
    @Setter
    @Column(name = "APLICACOES_FINANCEIRAS_E_DIVIDAS")
    private String AplicaçõesFinanceirasEDividas;

    public UUID getId() {
        return idFinanceiro;
    }
}
