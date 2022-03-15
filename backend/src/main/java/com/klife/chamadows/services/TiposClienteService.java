package com.klife.chamadows.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.klife.chamadows.dto.TiposClienteDTO;
import com.klife.chamadows.entities.TiposCliente;
import com.klife.chamadows.repositories.TiposClienteRepository;

@Service
public class TiposClienteService {
	@Autowired
	private TiposClienteRepository tiposClienteRepository;
	
	@Transactional(readOnly = true)
	public Page<TiposClienteDTO> findAll(Pageable pageable) {
		Page<TiposCliente> result = tiposClienteRepository.findAll(pageable);
		Page<TiposClienteDTO> page = result.map(x -> new TiposClienteDTO(x));
		
		return page;
	}
	
	@Transactional(readOnly = true)
	public TiposClienteDTO findById(Long id) {
		TiposCliente result = tiposClienteRepository.findById(id).get();
		TiposClienteDTO dto = new TiposClienteDTO(result);
		
		return dto;
	}
	
	@Transactional
	public TiposClienteDTO saveTipoCliente(TiposClienteDTO dto) {
		TiposCliente tiposCliente = tiposClienteRepository.findById(dto.getId()).get();
		
		if(tiposCliente == null) {
			tiposCliente = new TiposCliente();
		}
		
		tiposCliente.setTipoCliente(dto.getTipoCliente());
		tiposCliente = tiposClienteRepository.saveAndFlush(tiposCliente);
	
		return new TiposClienteDTO(tiposCliente);
	}
	
	public void deleteTipoCliente(TiposClienteDTO dto) {
		TiposCliente tiposCliente = tiposClienteRepository.findById(dto.getId()).get();
		
		if(tiposCliente != null) {
			tiposClienteRepository.deleteById(tiposCliente.getId());
		}
	}
}