package com.coppel.nomina.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.coppel.nomina.dao.dto.NominaRestRowMapper;
import com.coppel.nomina.dao.dto.empleadorowmapper;

import com.coppel.nomina.models.Empleado;
import com.coppel.nomina.models.NominaRest;

@Repository
public class ConsultaRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public NominaRest NominaMes(String mes_ano) {
		String Sql = "";
		Sql = Sql +" SELECT MOV.MES_ANO AS PERIODO, MOV.NUM_EMPLEADO AS NUMERO_EMPLEADO, EMP.NOMBRE AS NOMBRE_EMPLEADO, BEN.ROL_NOMBRE, MOV.CANT_ENTREGA AS CANTIDAD_ENTREGAS,(8*6*4) AS HRAS_TRABAJADAS, "; 
		Sql = Sql +" ((8*6*4)* BEN.CANTIDAD_HORA) AS SUELDO_NOMINAL ,";
		Sql = Sql +" ((8*6*4) * BEN.BONO) AS BONO_HRAS_TRABAJADAS, MOV.CANT_ENTREGA * BEN.BONO_X_ENTREGA AS BONO_X_ENTREGA_CLIENTE, ";
		Sql = Sql +"  ((8*6*4)* BEN.CANTIDAD_HORA) + ((8*6*4) * BEN.BONO) + (MOV.CANT_ENTREGA * BEN.BONO_X_ENTREGA ) AS TOTAL_PERCEPCION, ";
		Sql = Sql +" (((8*6*4)* BEN.CANTIDAD_HORA) + ((8*6*4) * BEN.BONO) + (MOV.CANT_ENTREGA * BEN.BONO_X_ENTREGA ))* (RET.ISR_PORCENTAJE/100) AS IMPUESTO, "; 
		Sql = Sql +" CASE   WHEN (((8*6*4)* BEN.CANTIDAD_HORA) + ((8*6*4) * BEN.BONO) + (MOV.CANT_ENTREGA * BEN.BONO_X_ENTREGA )) >= RET.RANGO_EXTRA  THEN ";
		Sql = Sql +" (((8*6*4)* BEN.CANTIDAD_HORA) + ((8*6*4) * BEN.BONO) + (MOV.CANT_ENTREGA * BEN.BONO_X_ENTREGA )) *(RET.ISR_EXTRA_PORCENTAJE/100) ELSE 0 END "; 
		Sql = Sql +"  AS IMPUESTO_EXTRA,";

		Sql = Sql +" ( (((8*6*4)* BEN.CANTIDAD_HORA) + ((8*6*4) * BEN.BONO) + (MOV.CANT_ENTREGA * BEN.BONO_X_ENTREGA )) ) - ";
		Sql = Sql +" ( (((8*6*4)* BEN.CANTIDAD_HORA) + ((8*6*4) * BEN.BONO) + (MOV.CANT_ENTREGA * BEN.BONO_X_ENTREGA )) * (RET.ISR_PORCENTAJE/100)) - ";
		Sql = Sql +" (CASE   WHEN (((8*6*4)* BEN.CANTIDAD_HORA) + ((8*6*4) * BEN.BONO) + (MOV.CANT_ENTREGA * BEN.BONO_X_ENTREGA )) >= RET.RANGO_EXTRA  THEN "; 
		Sql = Sql +" (((8*6*4)* BEN.CANTIDAD_HORA) + ((8*6*4) * BEN.BONO) + (MOV.CANT_ENTREGA * BEN.BONO_X_ENTREGA )) *(RET.ISR_EXTRA_PORCENTAJE/100) ELSE 0 END ) ";
		Sql = Sql +"  AS SUELDO_NETO, ";
		Sql = Sql +"   (((8*6*4)* BEN.CANTIDAD_HORA) + ((8*6*4) * BEN.BONO) + (MOV.CANT_ENTREGA * BEN.BONO_X_ENTREGA )) * (BEN.PORCENTAJE_VALES /100) AS VALES_DESPENSA ";
		 
		Sql = Sql +" FROM MOVIMIENTOS        MOV ";
		Sql = Sql +" LEFT JOIN EMPLEADO      EMP ON  EMP.NUM_EMPLEADO = MOV.NUM_EMPLEADO";
		Sql = Sql +" LEFT JOIN CAT_BENEFICIO BEN ON  BEN.ROL = EMP.ROL ";
		Sql = Sql +" LEFT JOIN CAT_RETENCION RET ON  RET.ISR_PORCENTAJE <> 0";
		Sql = Sql +" WHERE MOV.MES_ANO = '"+mes_ano+"'";
		//Sql = Sql +" WHERE MOV.MES_ANO = '01-2023'";
		
		NominaRest nomina = new NominaRest();
		List<NominaRest> lst = jdbcTemplate.query(Sql, new NominaRestRowMapper() );
		nomina = lst.get(0);
	
	
		return nomina;
	}
	
	public Empleado NominaMes2(String mes_ano) {
		Empleado nomina = new Empleado();
		List<Empleado> lst = jdbcTemplate.query("Select NOMBRE from empleado ", new empleadorowmapper() );
		nomina = lst.get(1);
		return nomina;
	}

}
