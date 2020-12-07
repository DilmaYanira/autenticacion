package com.autenticacion.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autenticacion.model.TarjetaCredito;
import com.autenticacion.service.TarjetaCreditoService;

@RestController
@RequestMapping("tarjeta")
public class TarjetaCreditoRest {
	
	@Autowired
	private TarjetaCreditoService tarjetaCredito;
	
	/**
	 * Servicio para regitrar una nueva tarjeta de credito
	 * @param tarjeta
	 */
    @PostMapping("/registrar")
	public void crearTarjetaCredito(@RequestBody TarjetaCredito tarjeta) {
		tarjetaCredito.guardar(tarjeta);
	}
    /**
     * Servicio para consultar todas las tarjetas de credito
     * @return
     */
    @GetMapping("/listar")
    public List<TarjetaCredito> listarTarjetas(){
    	return tarjetaCredito.listar();
    }
    /**
     * Servicio para actualizar los datos de una tarjeta de credito
     * @param tarjeta
     */
    
    @PutMapping("/editar")
	public void editarTarjetaCredito(@RequestBody TarjetaCredito tarjeta) {
		tarjetaCredito.editar(tarjeta);
	}
    
    /**
     * 	Servicio para eliminar una tarjeta de credito
     * @param id
     */
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") int id) {
    	tarjetaCredito.eliminar(id);
    }
  /**
   * Servicio para consultar tarjetas por numero de documento del cliente  
   * @param documento
   * @return
   */
    @GetMapping("/consultar/{documento}")
    public List<TarjetaCredito> consultar(@PathVariable("documento") String documento) {
    	return tarjetaCredito.consultar(documento);
    }
}
