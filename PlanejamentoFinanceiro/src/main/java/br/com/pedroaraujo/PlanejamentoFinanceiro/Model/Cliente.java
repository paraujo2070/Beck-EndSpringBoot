package br.com.pedroaraujo.PlanejamentoFinanceiro.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CLIENTE")
    private UUID idCliente;
    @Getter
    @Setter
    @Column(name = "SENHA")
    private String senha;
    @Getter
    @Setter
    @Column(name = "DATA_DE_NACIMENTO")
    private String dataDeNascimento;
    @Getter
    @Setter
    @Column(name = "ESTADO_CIVIL")
    private String estadoCivil;
    @Getter
    @Setter
    @Column(name = "ESPECTATIVA_DE_VIDA")
    private String espectativaDeVida;
    @Getter
    @Setter
    @Column(name = "FILHOS")
    private Boolean temFilho;
    @Getter
    @Setter
    @Column(name = "QTD_FILHOS")
    private Integer QTDFilho;
    @Getter
    @Setter
    @Column(name = "PROJETOS_DE_CURTO_PRAZO")
    private String projetosCurtoPrazo;
    @Getter
    @Setter
    @Column(name = "PROJETOS_MEDIO_PRAZO")
    private String projetosMedioPrazo;
    @Getter
    @Setter
    @Column(name = "PROJETOS_LONGO_PRAZO")
    private String projetoLongoPrazo;
    @Getter
    @Setter
    @Column(name = "IDADE_APOSENTADORIA")
    private Integer idadeAposentadoria;
    @Getter
    @Setter
    @Column(name = "QTD_MENSAL_QUER_APOSENTAR")
    private Integer QTDMensalPretendeAposentar;
    @Getter
    @Setter
    @Column(name = "QUAIS_BENS_AO_APOSENTAR_E_VALOR")
    private String quaisBensTerAoSeAposentarEValor;


    public UUID getId() {
        return idCliente;
    }
}
