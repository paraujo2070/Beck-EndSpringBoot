package br.com.pedroaraujo.PlanejamentoFinanceiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br.com.pedroaraujo.PlanejamentoFinanceiro.Model")
public class PlanejamentoFinanceiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanejamentoFinanceiroApplication.class, args);
	}

}
