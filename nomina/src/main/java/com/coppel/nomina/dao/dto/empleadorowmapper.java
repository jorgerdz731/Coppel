package com.coppel.nomina.dao.dto;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.coppel.nomina.models.Empleado;


public class empleadorowmapper implements RowMapper<Empleado>{
	@Override
	public Empleado mapRow(ResultSet rs, int rowNum) throws SQLException {  
		Empleado nominamap = new Empleado();
		nominamap.setNombre(rs.getString("nombre"));
		return nominamap;
	}
	
	
}
