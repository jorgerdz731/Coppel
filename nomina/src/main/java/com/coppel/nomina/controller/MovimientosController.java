package com.coppel.nomina.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.coppel.nomina.models.Movimientos;
import com.coppel.nomina.services.MovimientosService;

@RestController
@RequestMapping("/movimiento")
public class MovimientosController {

		@Autowired
		MovimientosService movimientosService;
		
		@GetMapping()
		public ArrayList<Movimientos> obtenerMovimientos(){
			return movimientosService.obtieneMovimientos();
		}
		
}
