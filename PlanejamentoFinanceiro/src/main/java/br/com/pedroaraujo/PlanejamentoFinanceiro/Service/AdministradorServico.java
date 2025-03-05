package br.com.pedroaraujo.PlanejamentoFinanceiro.Service;

import br.com.pedroaraujo.PlanejamentoFinanceiro.Model.Administrador;
import br.com.pedroaraujo.PlanejamentoFinanceiro.Model.Cliente;

import java.util.Optional;
import java.util.UUID;

public interface AdministradorServico {
    Administrador salvar(Administrador administrador);
    Optional<Administrador> listarPorId(UUID id);
    Administrador atualizar (Administrador administrador);
    void deletar(UUID id);
    void logar(Administrador administrador);
    void sair (Administrador administrador);
}
