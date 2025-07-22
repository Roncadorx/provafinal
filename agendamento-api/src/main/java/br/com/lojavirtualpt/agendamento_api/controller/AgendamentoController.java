package br.com.lojavirtualpt.agendamento_api.controller;

import br.com.lojavirtualpt.agendamento_api.model.Agendamento;
import br.com.lojavirtualpt.agendamento_api.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService service;

    @GetMapping
    public List<Agendamento> listar() {
        return service.listar();
    }

    @PostMapping
    public Agendamento cadastrar(@RequestBody Agendamento ag) {
        return service.salvar(ag);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable String id) {
        service.deletar(id);
    }
}
