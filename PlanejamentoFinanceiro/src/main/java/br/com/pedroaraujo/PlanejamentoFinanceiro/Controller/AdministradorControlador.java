package br.com.pedroaraujo.PlanejamentoFinanceiro.Controller;


import br.com.pedroaraujo.PlanejamentoFinanceiro.Model.Administrador;
import br.com.pedroaraujo.PlanejamentoFinanceiro.Model.Cliente;
import br.com.pedroaraujo.PlanejamentoFinanceiro.Service.AdministradorServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("/administrador")
public class AdministradorControlador {

    @Autowired(required=true)
    private AdministradorServico administradorServico;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Administrador>> listarPorId (@PathVariable UUID id){
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(administradorServico.listarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Administrador> criar (@RequestBody Administrador administrador){
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(administradorServico.salvar(administrador));
    }

    @PutMapping
    public ResponseEntity<Administrador> atualizar (@RequestBody Administrador administrador){
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(administradorServico.atualizar(administrador));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar (@PathVariable UUID id){
        administradorServico.deletar(id);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).build();
    }


}
