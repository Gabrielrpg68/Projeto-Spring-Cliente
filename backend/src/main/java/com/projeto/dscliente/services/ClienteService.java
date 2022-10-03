package com.projeto.dscliente.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.dscliente.entities.Cliente;
import com.projeto.dscliente.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository repository;
	
	@Transactional
	public Page<Cliente> findAll(PageRequest page){
		return repository.findAll(page);
	}
	
	@Transactional
	public Optional<Cliente> findById(Long id) {
		return repository.findById(id);
	}
	
	
	public Cliente insert(Cliente cliente) {
		Cliente cli = new Cliente();
		cli.setName(cliente.getName());
		cli.setCpf(cliente.getCpf());
		cli.setIncome(cliente.getIncome());
		cli.setBirthDate(cliente.getBirthDate());
		cli.setChildren(cliente.getChildren());
		cli = repository.save(cli);
		return cli;
	}

	@Transactional
	public Cliente update(Long id, Cliente cliente) {
		
		Cliente cli = repository.getOne(id);
		cli.setName(cliente.getName());
		cli.setCpf(cliente.getCpf());
		cli.setIncome(cliente.getIncome());
		cli.setBirthDate(cliente.getBirthDate());
		cli.setChildren(cliente.getChildren());
		return repository.save(cli);
		
	}

	public void delete(Long id) {
		repository.deleteById(id);
	};
	
}
