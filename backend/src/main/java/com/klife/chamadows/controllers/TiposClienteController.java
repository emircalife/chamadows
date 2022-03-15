package com.klife.chamadows.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klife.chamadows.dto.TiposClienteDTO;
import com.klife.chamadows.services.TiposClienteService;

@RestController
@RequestMapping(value = "/tiposCliente")
public class TiposClienteController {
	@Autowired
	private TiposClienteService service;
	
	@PutMapping
	public TiposClienteDTO saveTipoCliente(@RequestBody TiposClienteDTO dto){
		TiposClienteDTO tiposClienteDTO = service.saveTipoCliente(dto); 
		return tiposClienteDTO;	
	}
	
	@DeleteMapping
	public void deleteTipoCliente(@RequestBody TiposClienteDTO dto){
		service.deleteTipoCliente(dto); 
	}
}
