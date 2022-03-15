package com.klife.chamadows.dto;

import com.klife.chamadows.entities.Clientes;
import com.klife.chamadows.entities.TiposCliente;

public class ClientesDTO {
	private Long id;
	private TiposCliente tipoCliente;
	private String gestor;
	private String loja;
	private String endereco;
	private String numero;
	private String bairro;
	private String cidade;
	private String UF;
	private String fone;
	private String emailPrincipal;
	private String emailCopia1;
	private String emailCopia2;
	
	public ClientesDTO() {
	}

	

	public ClientesDTO(Long id, TiposCliente tipoCliente, String gestor, String loja, String endereco, String numero,
			String bairro, String cidade, String uF, String fone, String emailPrincipal, String emailCopia1,
			String emailCopia2) {
		this.id = id;
		this.tipoCliente = tipoCliente;
		this.gestor = gestor;
		this.loja = loja;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.UF = uF;
		this.fone = fone;
		this.emailPrincipal = emailPrincipal;
		this.emailCopia1 = emailCopia1;
		this.emailCopia2 = emailCopia2;
	}

	public ClientesDTO(Clientes clientes) {
		id = clientes.getId();
		tipoCliente = clientes.getTipoCliente();
		gestor = clientes.getGestor();
		loja = clientes.getLoja();
		endereco = clientes.getEndereco();
		numero = clientes.getNumero();
		bairro = clientes.getBairro();
		cidade = clientes.getCidade();
		UF = clientes.getUF();
		fone = clientes.getFone();
		emailPrincipal = clientes.getEmailPrincipal();
		emailCopia1 = clientes.getEmailCopia1();
		emailCopia2 = clientes.getEmailCopia2();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TiposCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TiposCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getGestor() {
		return gestor;
	}

	public void setGestor(String gestor) {
		this.gestor = gestor;
	}

	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmailPrincipal() {
		return emailPrincipal;
	}

	public void setEmailPrincipal(String emailPrincipal) {
		this.emailPrincipal = emailPrincipal;
	}

	public String getEmailCopia1() {
		return emailCopia1;
	}

	public void setEmailCopia1(String emailCopia1) {
		this.emailCopia1 = emailCopia1;
	}

	public String getEmailCopia2() {
		return emailCopia2;
	}

	public void setEmailCopia2(String emailCopia2) {
		this.emailCopia2 = emailCopia2;
	}
}
