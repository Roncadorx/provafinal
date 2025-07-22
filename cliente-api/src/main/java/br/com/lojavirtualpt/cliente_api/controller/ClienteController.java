package br.com.lojavirtualpt.cliente_api.controller;

import br.com.lojavirtualpt.cliente_api.model.Cliente;
import br.com.lojavirtualpt.cliente_api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repo;

    @GetMapping
    public List<Cliente> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        return repo.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable String id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        return repo.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable String id) {
        repo.deleteById(id);
    }
}
