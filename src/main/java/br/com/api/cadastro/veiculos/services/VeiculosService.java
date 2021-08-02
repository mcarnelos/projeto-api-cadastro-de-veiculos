package br.com.api.cadastro.veiculos.services;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.cadastro.veiculos.domain.Veiculos;
import br.com.api.cadastro.veiculos.dto.VeiculosDTO;
import br.com.api.cadastro.veiculos.repository.VeiculosRepository;
import br.com.api.cadastro.veiculos.services.exception.ObjectNotFoundException;

@Service
public class VeiculosService {
	
	@Autowired
	private VeiculosRepository repo;

	//Retorna todos os dados do veiculo
	public List<Veiculos> findAll() {
		return repo.findAll();
	}
	
	//Retorna os dados do veiculo por id
	public Veiculos findById(String id) {
		Optional<Veiculos> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
	
	//Insere novo veiculo
	public Veiculos insert(Veiculos obj) {
		obj.setVeiculo(obj.getVeiculo());
		obj.setMarca(obj.getMarca());
		obj.setAno(obj.getAno());
		obj.setDescricao(obj.getDescricao());
		obj.setVendido(obj.isVendido());
		obj.setCreated(Instant.now());
		obj.setUpdated(obj.getUpdated());
		return repo.insert(obj);
	}
	
	//Deleta veiculo
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	//Atualiza o veiculo
	public Veiculos update(Veiculos obj) {
		Veiculos newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
		}
	
	
	//Insere os dados no obj
	private void updateData(Veiculos newObj, Veiculos obj) {
		newObj.setVeiculo(obj.getVeiculo());
		newObj.setMarca(obj.getMarca());
		newObj.setAno(obj.getAno());
		newObj.setDescricao(obj.getDescricao());
		newObj.setVendido(obj.isVendido());
		newObj.setCreated(obj.getCreated());
		newObj.setUpdated(Instant.now());
		
		}

	
	public Veiculos fromDTO(VeiculosDTO objDto) {
		return new Veiculos(objDto.getId(), objDto.getVeiculo(), objDto.getMarca(), objDto.getAno(), objDto.getDescricao(), 
				objDto.isVendido(), objDto.getCreated(), objDto.getUpdated());
	}
	
	
	
}
