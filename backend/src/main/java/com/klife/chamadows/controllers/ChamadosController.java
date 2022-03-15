package com.klife.chamadows.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klife.chamadows.dto.ChamadosDTO;
import com.klife.chamadows.services.ChamadosService;

@RestController
@RequestMapping(value = "/chamados")
public class ChamadosController {
	@Autowired
	private ChamadosService chamadosService;
	
	@PutMapping
	public ChamadosDTO saveChamado(@RequestBody ChamadosDTO dto){
		ChamadosDTO chamadosDTO = chamadosService.saveChamado(dto); 
		return chamadosDTO;	
	}
	
	@DeleteMapping
	public void deleteChamado(@RequestBody ChamadosDTO dto){
		chamadosService.deleteChamado(dto); 
	}
}