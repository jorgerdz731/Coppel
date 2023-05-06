package com.coppel.nomina.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coppel.nomina.models.Empleado;
import com.coppel.nomina.services.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
	@Autowired
	EmpleadoService empleadoService;
	
	@GetMapping()
	public ArrayList<Empleado> obtenerEmpleados(){
		return empleadoService.obtenerEmpleado();
	}

	@PostMapping()
	public Empleado guardarEmpleado(@RequestBody Empleado num_empleado) {
		return this.empleadoService.guardarEmpleado(num_empleado);
	}
}
