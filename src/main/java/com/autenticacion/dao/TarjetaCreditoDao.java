package com.autenticacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.autenticacion.model.TarjetaCredito;
@Controller
public interface TarjetaCreditoDao extends JpaRepository<TarjetaCredito,Integer>{

}
