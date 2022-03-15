package com.klife.chamadows.dto;

import com.klife.chamadows.entities.Tecnicos;

public class TecnicosDTO {
	private Long id;
	private String nomeTecnico;
	
	public TecnicosDTO() {
	}

	public TecnicosDTO(Long id, String nomeTecnico) {
		this.id = id;
		this.nomeTecnico = nomeTecnico;
	}

	public TecnicosDTO(Tecnicos tecnicos) {
		id = tecnicos.getId();
		nomeTecnico = tecnicos.getNomeTecnico();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeTecnico() {
		return nomeTecnico;
	}

	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
	}
}