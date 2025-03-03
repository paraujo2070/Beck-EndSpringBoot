package br.com.pedroantonio.PlanejamentoFinanceiro.Model;

public class Filho extends Cliente{
    private Integer id;
    private Integer chaveEstrangeiraCliente;
    private String nome;
    private String idade;

    @Override
    public String getId() {
        return id.toString();
    }
}
