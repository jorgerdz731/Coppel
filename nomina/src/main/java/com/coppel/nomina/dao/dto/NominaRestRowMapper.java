package com.coppel.nomina.dao.dto;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.coppel.nomina.models.NominaRest;

public class NominaRestRowMapper implements RowMapper<NominaRest> {
	@Override
	public NominaRest mapRow(ResultSet rs, int rowNum) throws SQLException {  
		NominaRest nominamap = new NominaRest();
		nominamap.setNombre_empleado(rs.getString("nombre_empleado"));
		nominamap.setNumero_empleado(rs.getInt("numero_empleado"));

		nominamap.setBono_hras_trabajadas(rs.getDouble("bono_hras_trabajadas"));
		nominamap.setCantidad_entregas(rs.getInt("cantidad_entregas"));
		nominamap.setImpuesto(rs.getDouble("impuesto"));
		nominamap.setImpuesto_extra(rs.getDouble("impuesto_Extra"));

		nominamap.setPeriodo(rs.getString("periodo"));
		nominamap.setSueldo_neto(rs.getDouble("sueldo_neto"));
		nominamap.setSueldo_nominal(rs.getDouble("total_percepcion"));
		nominamap.setVales_despensa(rs.getDouble("vales_despensa"));
	
	
		return nominamap;
	}
}


/*	Integer numero_empleado;
String nombre_empleado;
String periodo;
Integer cantidad_entregas;
String rol_nombre;
Integer hras_trabajadas;
double sueldo_nominal;
double bono_hras_trabajadas;
double bono_x_entrega_cliente;
double total_percepcion;
double vales_despensa;
double impuesto;
double impuesto_extra;
double sueldo_neto;
*/