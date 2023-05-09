package com.coppel.nomina.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coppel.nomina.models.Empleado;
import com.coppel.nomina.models.NominaRest;
import com.coppel.nomina.services.ConsultaService;

@RestController
@RequestMapping("/nomina")
public class consulta {
	
	/**
	public String Funciona() {
		return "Si esta FUNCIONANDO EL SERVICIO";
	}
	**/
	@Autowired
	ConsultaService consultaservicio;

	@GetMapping(path = {"/{mes_ano}"})
	public NominaRest  NominaMes(@PathVariable("mes_ano") String mes_ano) {
		NominaRest nominadatos = consultaservicio.ObtieneNomina(mes_ano);
		return nominadatos;
	}
	@GetMapping(path = {"/2"})
	//public Empleado  NominaMes2(@PathVariable("mes_ano") String mes_ano) {
	public Empleado  NominaMes2() {
		String mes_ano = "01-2023";
		Empleado nominadatos = consultaservicio.ObtieneNomina2(mes_ano);
		return nominadatos;
	}

}
