package br.com.lojavirtualpt.agendamento_api.service;

import br.com.lojavirtualpt.agendamento_api.model.Agendamento;
import br.com.lojavirtualpt.agendamento_api.repository.AgendamentoRespository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRespository repo;

    @CircuitBreaker(name = "clienteService", fallbackMethod = "fallbackListar")
    public List<Agendamento> listar() {
        return repo.findAll(); // Simulação de chamada remota
    }

    public List<Agendamento> fallbackListar(Throwable t) {
        return Collections.emptyList();
    }

    public Agendamento salvar(Agendamento ag) {
        return repo.save(ag);
    }

    public void deletar(String id) {
        repo.deleteById(id);
    }
}
