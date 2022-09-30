package com.projeto.dscliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.dscliente.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	
	
}
