package com.klife.chamadows.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klife.chamadows.dto.ClientesDTO;
import com.klife.chamadows.services.ClientesService;

@RestController
@RequestMapping(value = "/ciente")
public class ClientesController {
	@Autowired
	private ClientesService service;
	
	@PutMapping
	public ClientesDTO saveCliente(@RequestBody ClientesDTO dto){
		ClientesDTO clientesDTO = service.saveCliente(dto); 
		return clientesDTO;	
	}
	
	@DeleteMapping
	public void deleteCliente(@RequestBody ClientesDTO dto){
		service.deleteCliente(dto); 
	}
}
