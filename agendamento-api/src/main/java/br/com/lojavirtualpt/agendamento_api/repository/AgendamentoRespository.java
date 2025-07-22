package br.com.lojavirtualpt.agendamento_api.repository;

// Update the import below to the correct package path for Agendamento
import br.com.lojavirtualpt.agendamento_api.model.Agendamento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgendamentoRespository extends MongoRepository<Agendamento, String> {
}
