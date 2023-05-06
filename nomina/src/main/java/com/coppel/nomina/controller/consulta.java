package com.coppel.nomina.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class consulta {
	
	@RequestMapping("/")
	public String Funciona() {
		return "Si esta FUNCIONANDO EL SERVICIO";
	}
	

}
