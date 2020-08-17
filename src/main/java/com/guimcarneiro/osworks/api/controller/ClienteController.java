package com.guimcarneiro.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guimcarneiro.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setEmail("aaa@email.com");
		cliente1.setTelefone("999999999");
		cliente1.setNome("John A. Doe");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setEmail("bbb@email.com");
		cliente2.setTelefone("111111111");
		cliente2.setNome("Joanna Doe");
		
		return Arrays.asList(cliente1, cliente2);
	}
	
}
