package com.klife.chamadows.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.klife.chamadows.dto.ChamadosDTO;
import com.klife.chamadows.entities.Chamados;
import com.klife.chamadows.repositories.ChamadosRepository;

@Service
public class ChamadosService {
	@Autowired
	private ChamadosRepository chamadosRepository;
	
	@Transactional(readOnly = true)
	public Page<ChamadosDTO> findAll(Pageable pageable) {
		Page<Chamados> result = chamadosRepository.findAll(pageable);
		Page<ChamadosDTO> page = result.map(x -> new ChamadosDTO(x));
		
		return page;
	}
	
	@Transactional(readOnly = true)
	public ChamadosDTO findById(Long id) {
		Chamados result = chamadosRepository.findById(id).get();
		ChamadosDTO dto = new ChamadosDTO(result);
		
		return dto;
	}
	
	@Transactional
	public ChamadosDTO saveChamado(ChamadosDTO dto) {
		Chamados chamados = chamadosRepository.findById(dto.getId()).get();
		
		if(chamados == null) {
			chamados = new Chamados();
		}
		
		chamados.setDataChamado(dto.getDataChamado());
		chamados.setCliente(dto.getCliente());
		chamados.setMotivoSolicitacao(dto.getMotivoSolicitacao());
		chamados.setProblemaEncontrado(dto.getProblemaEncontrado());
		chamados.setProvidenciaTecnica(dto.getProvidenciaTecnica());
		chamados.setHoraChegada(dto.getHoraChegada());
		chamados.setHoraSaida(dto.getHoraSaida());
		chamados.setDataAtendimento(dto.getDataAtendimento());
		chamados.setTecnico(dto.getTecnico());
					
		chamados = chamadosRepository.saveAndFlush(chamados);
		
		return new ChamadosDTO(chamados);
	}
	
	public void deleteChamado(ChamadosDTO dto) {
		Chamados chamados = chamadosRepository.findById(dto.getId()).get();
		
		if(chamados != null) {
			chamadosRepository.deleteById(chamados.getId());
		}
	}
}