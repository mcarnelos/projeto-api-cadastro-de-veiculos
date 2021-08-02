package br.com.api.cadastro.veiculos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.api.cadastro.veiculos.domain.Veiculos;

@Repository
public interface VeiculosRepository extends MongoRepository<Veiculos, String>{
		
}
