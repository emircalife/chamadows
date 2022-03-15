package com.klife.chamadows.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_empresas")
public class Empresas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeEmpresa;
	private String email;
	private String fone1;
	private String fone2;
	private String fone3;
	private String fone4;
	
	public Empresas() {
	}
	
	public Empresas(Long id, String nomeEmpresa, String email, String fone1, String fone2, String fone3, String fone4) {
		this.id = id;
		this.nomeEmpresa = nomeEmpresa;
		this.email = email;
		this.fone1 = fone1;
		this.fone2 = fone2;
		this.fone3 = fone3;
		this.fone4 = fone4;
	}

	public Long getId() {
		return id;
	}

	public void setTId(Long id) {
		this.id = id;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone1() {
		return fone1;
	}

	public void setFone1(String fone1) {
		this.fone1 = fone1;
	}

	public String getFone2() {
		return fone2;
	}

	public void setFone2(String fone2) {
		this.fone2 = fone2;
	}

	public String getFone3() {
		return fone3;
	}

	public void setFone3(String fone3) {
		this.fone3 = fone3;
	}

	public String getFone4() {
		return fone4;
	}

	public void setFone4(String fone4) {
		this.fone4 = fone4;
	}
}
