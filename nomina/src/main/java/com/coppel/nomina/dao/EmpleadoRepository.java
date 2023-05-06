package com.coppel.nomina.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coppel.nomina.models.Empleado;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado,Integer>{

}
