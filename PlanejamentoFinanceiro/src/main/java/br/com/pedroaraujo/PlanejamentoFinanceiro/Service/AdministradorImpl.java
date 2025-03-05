package br.com.pedroaraujo.PlanejamentoFinanceiro.Service;

import br.com.pedroaraujo.PlanejamentoFinanceiro.Model.Administrador;
import br.com.pedroaraujo.PlanejamentoFinanceiro.Repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
@Service
public class AdministradorImpl implements AdministradorServico {
    @Autowired(required=true)
    private AdministradorRepository administradorRepository;

    @Override
    public Administrador salvar(Administrador administrador) {
        return null;
    }

    @Override
    public Optional<Administrador> listarPorId(UUID id) {
        return Optional.empty();
    }

    @Override
    public Administrador atualizar(Administrador administrador) {
        return null;
    }

    @Override
    public void deletar(UUID id) {

    }

    @Override
    public void logar(Administrador administrador) {

    }

    @Override
    public void sair(Administrador administrador) {

    }
}
