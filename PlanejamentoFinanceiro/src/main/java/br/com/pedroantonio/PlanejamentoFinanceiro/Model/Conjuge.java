package br.com.pedroantonio.PlanejamentoFinanceiro.Model;

public class Conjuge extends Cliente {
    private Integer id;
    private Integer chaveEstrangeiraCliente;
    private String nomeDoConjuge;
    private String dataDeNascimentoDoConjuge;
    private String expectativaDeVidaConjuge;
    @Override
    public String getId() {
        return id.toString();
    }
}
