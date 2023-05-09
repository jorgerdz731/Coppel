package com.coppel.nomina.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coppel.nomina.models.NominaRest;

@Repository
public interface NominaRestRepository  extends CrudRepository<NominaRest,Integer>{

}
