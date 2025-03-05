package br.com.pedroaraujo.PlanejamentoFinanceiro.Repository;

import br.com.pedroaraujo.PlanejamentoFinanceiro.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
}
