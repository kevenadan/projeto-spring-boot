package br.com.vendasapplication.service;

import org.springframework.stereotype.Service;

import br.com.vendasapplication.model.Cliente;
import br.com.vendasapplication.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public void salvarCliente(Cliente cliente) {
		this.validarCliente(cliente);
		clienteRepository.persistir(cliente);
	}
	
	public void validarCliente(Cliente cliente) {
		// Aplica validações
	}
}
