package com.coppel.nomina.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.nomina.dao.ConsultaRepository;
import com.coppel.nomina.models.Empleado;
import com.coppel.nomina.models.NominaRest;


@Service
public class ConsultaService {
	@Autowired
	ConsultaRepository consultarepositorio;
	
	public  NominaRest ObtieneNomina(String periodo) {
		NominaRest nominaperiodo = consultarepositorio.NominaMes(periodo);
		return nominaperiodo;
	}
	
	public  Empleado ObtieneNomina2(String periodo) {
		Empleado nominaperiodo = consultarepositorio.NominaMes2(periodo);
		return nominaperiodo;
	}
	
}
