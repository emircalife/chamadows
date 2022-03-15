package com.klife.chamadows.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klife.chamadows.dto.TecnicosDTO;
import com.klife.chamadows.services.TecnicosService;

@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicosController {
	@Autowired
	private TecnicosService service;
	
	@PutMapping
	public TecnicosDTO saveTecnico(@RequestBody TecnicosDTO dto){
		TecnicosDTO tecnicosDTO = service.saveTecnico(dto); 
		return tecnicosDTO;	
	}
	
	@DeleteMapping
	public void deleteTecnico(@RequestBody TecnicosDTO dto){
		service.deleteTecnico(dto); 
	}
}
