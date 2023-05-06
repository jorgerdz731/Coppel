package com.coppel.nomina.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.nomina.dao.EmpleadoRepository;
import com.coppel.nomina.models.Empleado;

@Service
public class EmpleadoService {
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	public ArrayList<Empleado> obtenerEmpleado(){
		return (ArrayList<Empleado>) empleadoRepository.findAll(); 

	}
	
	public Empleado guardarEmpleado(Empleado num_empleado) {
		return empleadoRepository.save(num_empleado);
	}
	

}

