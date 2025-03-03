package br.com.pedroantonio.PlanejamentoFinanceiro.Model;

public class Financeiro extends Cliente {
    private Integer id;
    private Integer chaveEstrangeiraCliente;
    private Integer capacidadeDePouparHoje;
    private Integer estimativaDeDespesaMensal;
    private String tipoDeclaracaoIRPF;
    private String bensImoveis;
    private String bensMoveis;
    private String emprestimosEDividas;
    private String AplicaçõesFinanceirasEDividas;

    @Override
    public String getId() {
        return id.toString();
    }
}
