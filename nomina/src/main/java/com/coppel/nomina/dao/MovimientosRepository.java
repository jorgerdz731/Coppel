package com.coppel.nomina.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coppel.nomina.models.Movimientos;

@Repository
public interface MovimientosRepository extends CrudRepository<Movimientos,Integer>{

}
