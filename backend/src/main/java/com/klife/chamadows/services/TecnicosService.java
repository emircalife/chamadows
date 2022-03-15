package com.klife.chamadows.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.klife.chamadows.dto.TecnicosDTO;
import com.klife.chamadows.entities.Tecnicos;
import com.klife.chamadows.repositories.TecnicosRepository;

@Service
public class TecnicosService {
	@Autowired
	private TecnicosRepository tecnicosRepository;
	
	@Transactional(readOnly = true)
	public Page<TecnicosDTO> findAll(Pageable pageable) {
		Page<Tecnicos> result = tecnicosRepository.findAll(pageable);
		Page<TecnicosDTO> page = result.map(x -> new TecnicosDTO(x));
		
		return page;
	}
	
	@Transactional(readOnly = true)
	public TecnicosDTO findById(Long id) {
		Tecnicos result = tecnicosRepository.findById(id).get();
		TecnicosDTO dto = new TecnicosDTO(result);
		
		return dto;
	}
	
	@Transactional
	public TecnicosDTO saveTecnico(TecnicosDTO dto) {
		Tecnicos tecnicos = tecnicosRepository.findById(dto.getId()).get();
		
		if(tecnicos == null) {
			tecnicos = new Tecnicos();
		}

		tecnicos.setNomeTecnico(dto.getNomeTecnico());
		tecnicos = tecnicosRepository.saveAndFlush(tecnicos);
		
		return new TecnicosDTO(tecnicos);
	}
	
	public void deleteTecnico(TecnicosDTO dto) {
		Tecnicos tecnicos = tecnicosRepository.findById(dto.getId()).get();
		
		if(tecnicos != null) {
			tecnicosRepository.deleteById(tecnicos.getId());
		}
	}
}