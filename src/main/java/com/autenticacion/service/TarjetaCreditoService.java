package com.autenticacion.service;

import java.util.List;
import java.util.Optional;

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
	
	
	public TarjetaCredito editar(TarjetaCredito tarjeta) {
		return  tarjetaCreditoDao.save(tarjeta);
	 
		 
	}
	public void eliminar(int id) {
		 tarjetaCreditoDao.deleteById(id);
	}
	
	public List<TarjetaCredito> consultar(String documento){
		return tarjetaCreditoDao.findByClienteNumeroDocumento(documento);
		
	}
	
	
	
	
}
