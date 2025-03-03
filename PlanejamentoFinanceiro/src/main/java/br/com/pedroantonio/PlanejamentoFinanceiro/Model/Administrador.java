package br.com.pedroantonio.PlanejamentoFinanceiro.Model;

public class Administrador extends Pessoa{
    private Integer id;
    private String senha;

    @Override
    public String getId() {
        return id.toString();
    }
}
