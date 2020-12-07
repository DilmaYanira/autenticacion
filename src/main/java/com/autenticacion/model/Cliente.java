package com.autenticacion.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
	
	    @Id
	    @GeneratedValue
		private int id;
	    private String nombre;
	    private String apellido;
	    private String tipoDocumento;
	    private String numeroDocumento;
	    /*@OneToMany
	    private List<TarjetaCredito> tarjetas;
	    */
	    
	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getTipoDocumento() {
			return tipoDocumento;
		}
		public void setTipoDocumento(String tipoDocumento) {
			this.tipoDocumento = tipoDocumento;
		}
		public String getNumeroDocumento() {
			return numeroDocumento;
		}
		public void setNumeroDocumento(String numeroDocumento) {
			this.numeroDocumento = numeroDocumento;
		}
		
		/*
		public List<TarjetaCredito> getTarjetas() {
			return tarjetas;
		}
		public void setTarjetas(List<TarjetaCredito> tarjetas) {
			this.tarjetas = tarjetas;
		}*/
	    
	}

