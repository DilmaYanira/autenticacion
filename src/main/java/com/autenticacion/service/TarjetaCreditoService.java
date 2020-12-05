package com.autenticacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autenticacion.dao.TarjetaCreditoDao;
import com.autenticacion.model.TarjetaCredito;

@Service
public class TarjetaCreditoService {

	@Autowired
	private TarjetaCreditoDao tarjetaCreditoDao;
	
	
	public void guardar(TarjetaCredito tarjeta) {
		tarjetaCreditoDao.save(tarjeta);
		
	}
	
	public List<TarjetaCredito> listar(){
		return tarjetaCreditoDao.findAll();
	}
	
	
	
	
	
}
