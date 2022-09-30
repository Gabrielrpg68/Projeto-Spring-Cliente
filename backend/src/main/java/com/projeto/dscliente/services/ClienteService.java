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
	};
	
}
