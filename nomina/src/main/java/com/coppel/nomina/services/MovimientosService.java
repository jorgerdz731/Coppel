package com.coppel.nomina.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.nomina.dao.MovimientosRepository;
import com.coppel.nomina.models.Movimientos;

@Service
public class MovimientosService {

	@Autowired
	MovimientosRepository movimientosRepository;
	
	public ArrayList<Movimientos> obtieneMovimientos(){
		return (ArrayList<Movimientos>) movimientosRepository.findAll();
	}
	
	
	
	
	

}
