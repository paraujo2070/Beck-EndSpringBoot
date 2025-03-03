package br.com.pedroantonio.PlanejamentoFinanceiro.Model;

public class Cliente extends Pessoa {
    private Integer id;
    private String senha;
    private String dataDeNascimento;
    private String estadoCivil;
    private String espectativaDeVida;
    private Boolean temFilho;
    private Integer QTDFilho;
    private String projetosCurtoPrazo;
    private String projetosMedioPrazo;
    private String projetoLongoPrazo;
    private Integer idadeAposentadoria;
    private Integer QTDMensalPretendeAposentar;
    private String quaisBensTerAoSeAposentarEValor;

    @Override
    public String getId() {
        return id.toString();
    }
}
