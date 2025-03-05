package br.com.pedroaraujo.PlanejamentoFinanceiro.Service;

import br.com.pedroaraujo.PlanejamentoFinanceiro.Model.Cliente;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClienteServico {
     Cliente salvar(Cliente cliente);
     List<Cliente> listarTudo();
     Optional<Cliente> listarPorId(UUID id);
     Cliente atualizar (Cliente cliente);
     void deletar(UUID id);
     void logar(Cliente cliente);
     void sair (Cliente cliente);
}
