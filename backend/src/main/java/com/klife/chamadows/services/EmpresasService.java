package com.klife.chamadows.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.klife.chamadows.dto.EmpresasDTO;
import com.klife.chamadows.entities.Empresas;
import com.klife.chamadows.repositories.EmpresasRepository;

@Service
public class EmpresasService {
	@Autowired
	private EmpresasRepository empresasRepository;
	
	@Transactional(readOnly = true)
	public Page<EmpresasDTO> findAll(Pageable pageable) {
		Page<Empresas> result = empresasRepository.findAll(pageable);
		Page<EmpresasDTO> page = result.map(x -> new EmpresasDTO(x));
		
		return page;
	}
	
	@Transactional(readOnly = true)
	public EmpresasDTO findById(Long id) {
		Empresas result = empresasRepository.findById(id).get();
		EmpresasDTO dto = new EmpresasDTO(result);
		
		return dto;
	}
	
	@Transactional
	public EmpresasDTO saveEmpresa(EmpresasDTO dto) {
		Empresas empresas = empresasRepository.findById(dto.getId()).get();
		
		if(empresas == null) {
			empresas = new Empresas();
		}
		
		empresas.setNomeEmpresa(dto.getNomeEmpresa());
		empresas.setEmail(dto.getEmail());
		empresas.setFone1(dto.getFone1());
		empresas.setFone2(dto.getFone2());
		empresas.setFone3(dto.getFone3());
		empresas.setFone4(dto.getFone4());
		
		empresas = empresasRepository.saveAndFlush(empresas);
			
		return new EmpresasDTO(empresas);
	}
	
	public void deleteEmpresa(EmpresasDTO dto) {
		Empresas empresas = empresasRepository.findById(dto.getId()).get();
		
		if(empresas != null) {
			empresasRepository.deleteById(empresas.getId());
		}
	}
}