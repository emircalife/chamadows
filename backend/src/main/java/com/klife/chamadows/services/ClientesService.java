package com.klife.chamadows.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.klife.chamadows.dto.ClientesDTO;
import com.klife.chamadows.entities.Clientes;
import com.klife.chamadows.repositories.ClientesRepository;

@Service
public class ClientesService {
	@Autowired
	private ClientesRepository clientesRepository;
	
	@Transactional(readOnly = true)
	public Page<ClientesDTO> findAll(Pageable pageable) {
		Page<Clientes> result = clientesRepository.findAll(pageable);
		Page<ClientesDTO> page = result.map(x -> new ClientesDTO(x));
		
		return page;
	}
	
	@Transactional(readOnly = true)
	public ClientesDTO findById(Long id) {
		Clientes result = clientesRepository.findById(id).get();
		ClientesDTO dto = new ClientesDTO(result);
		
		return dto;
	}
	
	@Transactional
	public ClientesDTO saveCliente(ClientesDTO dto) {
		Clientes clientes = clientesRepository.findById(dto.getId()).get();
		
		if(clientes == null) {
			clientes = new Clientes();
		}
		
		clientes.setTipoCliente(dto.getTipoCliente());
		clientes.setGestor(dto.getGestor());
		clientes.setLoja(dto.getLoja());
		clientes.setEndereco(dto.getEndereco());
		clientes.setNumero(dto.getNumero());
		clientes.setBairro(dto.getBairro());
		clientes.setCidade(dto.getCidade());
		clientes.setUF(dto.getUF());
		clientes.setFone(dto.getFone());
		clientes.setEmailPrincipal(dto.getEmailPrincipal());
		clientes.setEmailCopia1(dto.getEmailCopia1());
		clientes.setEmailCopia2(dto.getEmailCopia2());
		
		clientes = clientesRepository.saveAndFlush(clientes);
		
		return new ClientesDTO(clientes);
	}
	
	public void deleteCliente(ClientesDTO dto) {
		Clientes clientes = clientesRepository.findById(dto.getId()).get();
		
		if(clientes != null) {
			clientesRepository.deleteById(clientes.getId());
		}
	}
}