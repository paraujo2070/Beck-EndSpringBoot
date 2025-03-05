package br.com.pedroaraujo.PlanejamentoFinanceiro.Service;

import br.com.pedroaraujo.PlanejamentoFinanceiro.Model.Cliente;
import br.com.pedroaraujo.PlanejamentoFinanceiro.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class ClienteImpl implements ClienteServico{

    @Autowired(required = true)
    private ClienteRepository clienteRepository;

    @Override
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> listarTudo() {
        return List.of();
    }

    @Override
    public Optional<Cliente> listarPorId(UUID id) {
        return Optional.empty();
    }

    @Override
    public Cliente atualizar(Cliente cliente) {
        return null;
    }

    @Override
    public void deletar(UUID id) {

    }

    @Override
    public void logar(Cliente cliente) {

    }

    @Override
    public void sair(Cliente cliente) {

    }
}
