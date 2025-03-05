package br.com.pedroaraujo.PlanejamentoFinanceiro.Repository;

import br.com.pedroaraujo.PlanejamentoFinanceiro.Model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdministradorRepository extends JpaRepository<Administrador, UUID> {
}
