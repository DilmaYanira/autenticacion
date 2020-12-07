package com.autenticacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.autenticacion.dao.ClienteDao;
import com.autenticacion.model.Cliente;


@Service
public class ClienteService {

	@Autowired
	private ClienteDao clienteDao;
	
	public void guardar(Cliente cliente) {
		clienteDao.save(cliente);
	}
	
	public List<Cliente> listar(){
		return clienteDao.findAll();
	}
	
	public void editar(Cliente cliente) {
		clienteDao.save(cliente);
	}
	
}
