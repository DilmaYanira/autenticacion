package com.autenticacion.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autenticacion.dao.ClienteDao;
import com.autenticacion.model.Cliente;
import com.autenticacion.service.ClienteService;


@RestController
@RequestMapping("cliente")
public class ClienteRest {
	
	@Autowired
	private ClienteDao clienteDao;
	@Autowired
	private ClienteService clienteService;

	@PostMapping("/guardar")
	public void guardar(@RequestBody Cliente cliente) {
		clienteService.guardar(cliente);
	}
	
	@GetMapping("/listar")
	public List<Cliente> listar(){
		return clienteService.listar();
	}
}
