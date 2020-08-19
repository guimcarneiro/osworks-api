package com.guimcarneiro.osworks.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guimcarneiro.osworks.domain.exception.NegocioException;
import com.guimcarneiro.osworks.domain.model.Cliente;
import com.guimcarneiro.osworks.domain.repository.ClienteRepository;

@Service
public class CadastroClienteService {

	@Autowired
	public ClienteRepository clienteRepository;
	
	public Cliente salvar(Cliente cliente) {
		Cliente clienteExistente = clienteRepository.findByEmail(cliente.getEmail());
		
		if(clienteExistente != null && !clienteExistente.equals(cliente)) {
			throw new NegocioException("Já existe um cliente cadastrado com este e-mail.");
		}
		
		return clienteRepository.save(cliente);
	}
	
	public void excluir(Long clienteId) {
		clienteRepository.deleteById(clienteId);
	}
	
}
