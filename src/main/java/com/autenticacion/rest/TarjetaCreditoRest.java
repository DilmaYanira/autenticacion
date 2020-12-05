package com.autenticacion.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autenticacion.model.TarjetaCredito;
import com.autenticacion.service.TarjetaCreditoService;

@RestController
@RequestMapping("tarjeta")
public class TarjetaCreditoRest {
	
	@Autowired
	private TarjetaCreditoService tarjetaCredito;
	
    @PostMapping(path = "/guardar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void crearTrjetaCredito(TarjetaCredito tarjeta) {
		tarjetaCredito.guardar(tarjeta);
	}
    @GetMapping("/listar")
    public List<TarjetaCredito> listarTarjetas(){
    	return tarjetaCredito.listar();
    }
}
