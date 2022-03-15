package com.klife.chamadows.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tiposCliente")
public class TiposCliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipoCliente;
	
	public TiposCliente() {
	}
	
	public TiposCliente(Long id, String tipoCliente) {
		this.id = id;
		this.tipoCliente = tipoCliente;
	}

	public Long getId() {
		return id;
	}

	public void setTId(Long id) {
		this.id = id;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
}

