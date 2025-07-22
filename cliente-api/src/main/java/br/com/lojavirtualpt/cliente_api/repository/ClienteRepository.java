package br.com.lojavirtualpt.cliente_api.repository;

// Update the import below to match the actual package of Cliente in your project
import br.com.lojavirtualpt.cliente_api.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
