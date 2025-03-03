package br.com.pedroantonio.PlanejamentoFinanceiro.Model;

import org.stringtemplate.v4.ST;

public abstract class Pessoa extends Entidade {
    private Integer id;
    private String nomeCompleto;
    private String email;

    @Override
    public abstract String getId();
}
