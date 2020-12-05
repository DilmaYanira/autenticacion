package com.autenticacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.autenticacion.model.Cliente;


@Controller
public interface ClienteDao extends JpaRepository<Cliente, Integer>{

	
}
