package com.klife.chamadows.dto;

import com.klife.chamadows.entities.TiposCliente;

public class TiposClienteDTO {
	private Long id;
	private String tipoCliente;
	
	public TiposClienteDTO() {
	}

	public TiposClienteDTO(Long id, String tipoCliente) {
		super();
		this.id = id;
		this.tipoCliente = tipoCliente;
	}

	public TiposClienteDTO(TiposCliente tiposCliente) {
		id = tiposCliente.getId();
		tipoCliente = tiposCliente.getTipoCliente();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
}
