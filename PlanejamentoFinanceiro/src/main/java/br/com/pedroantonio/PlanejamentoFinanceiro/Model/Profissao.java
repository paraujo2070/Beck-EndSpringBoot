package br.com.pedroantonio.PlanejamentoFinanceiro.Model;

public class Profissao extends Cliente {
    private Integer id;
    private Integer chaveEstrangeiraCliente;
    private String profissaoAtual;
    private String remuneracaoLiquidaAtual;
    private String outrasFontesDeRenda;
    private Boolean INSSPrevistoNaAposentadoria;

    @Override
    public String getId() {
        return id.toString();
    }
}
