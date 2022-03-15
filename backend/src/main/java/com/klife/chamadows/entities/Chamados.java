package com.klife.chamadows.entities;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_chamados")
public class Chamados {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dataChamado;
	@ManyToOne(optional = true)
	@JoinColumn(name = "cliente_id", referencedColumnName = "id", nullable = true)
	private Clientes cliente;
	private String motivoSolicitacao;
	private String problemaEncontrado;
	private String providenciaTecnica;
	private Time horaChegada;
	private Time horaSaida;
	private Date dataAtendimento;
	@ManyToOne(optional = true)
	@JoinColumn(name = "tecnico_id", referencedColumnName = "id", nullable = true)
	private Tecnicos tecnico;
	
	public Chamados() {
	}

	public Chamados(Long id, Date dataChamado, Clientes cliente, String motivoSolicitacao, String problemaEncontrado,
			String providenciaTecnica, Time horaChegada, Time horaSaida, Date dataAtendimento, Tecnicos tecnico) {
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
