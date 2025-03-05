package br.com.pedroaraujo.PlanejamentoFinanceiro.Controller;

import br.com.pedroaraujo.PlanejamentoFinanceiro.Model.Cliente;
import br.com.pedroaraujo.PlanejamentoFinanceiro.Service.ClienteServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/clientes")
public class ClienteControlador {

    @Autowired(required=true)
    private ClienteServico clienteServico;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Cliente>> listarPorId (@PathVariable UUID id){
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(clienteServico.listarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> criar (@RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(clienteServico.salvar(cliente));
    }

    @PutMapping
    public ResponseEntity<Cliente> atualizar (@RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(clienteServico.atualizar(cliente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar (@PathVariable UUID id){
        clienteServico.deletar(id);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).build();
    }



}
