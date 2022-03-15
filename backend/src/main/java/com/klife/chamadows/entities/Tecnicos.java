package com.klife.chamadows.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tecnicos")
public class Tecnicos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeTecnico;
	
	public Tecnicos() {
	}
	
	public Tecnicos(Long id, String nomeTecnico) {
		this.id = id;
		this.nomeTecnico = nomeTecnico;
	}

	public Long getId() {
		return id;
	}

	public void setTId(Long id) {
		this.id = id;
	}

	public String getNomeTecnico() {
		return nomeTecnico;
	}

	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
	}
}
