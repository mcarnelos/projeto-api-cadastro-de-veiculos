package br.com.api.cadastro.veiculos.dto;

import java.io.Serializable;
import java.time.Instant;

import br.com.api.cadastro.veiculos.domain.Veiculos;

public class VeiculosDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String veiculo;
	private String marca;
	private Integer ano;
	private String descricao;
	private boolean vendido;
	private Instant created;
	private Instant updated;
	
	public VeiculosDTO() {
		
	}
	
	public VeiculosDTO(Veiculos obj) {
		id = obj.getId();
		veiculo = obj.getVeiculo();
		marca = obj.getMarca();
		ano = obj.getAno();
		descricao = obj.getDescricao();
		vendido = obj.isVendido();
		created = obj.getCreated();
		updated = obj.getUpdated();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public Instant getCreated() {
		return created;
	}

	public void setCreated(Instant created) {
		this.created = created;
	}

	public Instant getUpdated() {
		return updated;
	}

	public void setUpdated(Instant updated) {
		this.updated = updated;
	}
	
	
	
	
}
