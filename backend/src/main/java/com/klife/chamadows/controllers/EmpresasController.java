package com.klife.chamadows.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klife.chamadows.dto.EmpresasDTO;
import com.klife.chamadows.services.EmpresasService;

@RestController
@RequestMapping(value = "/empresa")
public class EmpresasController {
	@Autowired
	private EmpresasService service;
	
	@PutMapping
	public EmpresasDTO saveEmpresa(@RequestBody EmpresasDTO dto){
		EmpresasDTO empresaDTO = service.saveEmpresa(dto); 
		return empresaDTO;	
	}
	
	@DeleteMapping
	public void deleteEmpresa(@RequestBody EmpresasDTO dto){
		service.deleteEmpresa(dto); 
	}
}
