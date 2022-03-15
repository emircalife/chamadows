package com.klife.chamadows.dto;

import java.sql.Time;
import java.util.Date;

import com.klife.chamadows.entities.Chamados;
import com.klife.chamadows.entities.Clientes;
import com.klife.chamadows.entities.Tecnicos;

public class ChamadosDTO {
	private Long id;
	private Date dataChamado;
	private Clientes cliente;
	private String motivoSolicitacao;
	private String problemaEncontrado;
	private String providenciaTecnica;
	private Time horaChegada;
	private Time horaSaida;
	private Date dataAtendimento;
	private Tecnicos tecnico;
	
	public ChamadosDTO() {
	}

	public ChamadosDTO(Long id, Date dataChamado, Clientes cliente, String motivoSolicitacao, String problemaEncontrado,
			String providenciaTecnica, Time horaChegada, Time horaSaida, Date dataAtendimento, Tecnicos tecnico) {
		super();
		this.id = id;
		this.dataChamado = dataChamado;
		this.cliente = cliente;
		this.motivoSolicitacao = motivoSolicitacao;
		this.problemaEncontrado = problemaEncontrado;
		this.providenciaTecnica = providenciaTecnica;
		this.horaChegada = horaChegada;
		this.horaSaida = horaSaida;
		this.dataAtendimento = dataAtendimento;
		this.tecnico = tecnico;
	}
	
	public ChamadosDTO(Chamados chamados) {
		id = chamados.getId();
		dataChamado = chamados.getDataChamado();
		cliente = chamados.getCliente();
		motivoSolicitacao = chamados.getMotivoSolicitacao();
		problemaEncontrado = chamados.getProblemaEncontrado();
		providenciaTecnica = chamados.getProvidenciaTecnica();
		horaChegada = chamados.getHoraChegada();
		horaSaida = chamados.getHoraSaida();
		dataAtendimento = chamados.getDataAtendimento();
		tecnico = chamados.getTecnico();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataChamado() {
		return dataChamado;
	}

	public void setDataChamado(Date dataChamado) {
		this.dataChamado = dataChamado;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public String getMotivoSolicitacao() {
		return motivoSolicitacao;
	}

	public void setMotivoSolicitacao(String motivoSolicitacao) {
		this.motivoSolicitacao = motivoSolicitacao;
	}

	public String getProblemaEncontrado() {
		return problemaEncontrado;
	}

	public void setProblemaEncontrado(String problemaEncontrado) {
		this.problemaEncontrado = problemaEncontrado;
	}

	public String getProvidenciaTecnica() {
		return providenciaTecnica;
	}

	public void setProvidenciaTecnica(String providenciaTecnica) {
		this.providenciaTecnica = providenciaTecnica;
	}

	public Time getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(Time horaChegada) {
		this.horaChegada = horaChegada;
	}

	public Time getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(Time horaSaida) {
		this.horaSaida = horaSaida;
	}

	public Date getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	public Tecnicos getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnicos tecnico) {
		this.tecnico = tecnico;
	}
}
