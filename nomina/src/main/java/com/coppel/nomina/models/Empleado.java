package com.coppel.nomina.models;

import javax.persistence.*;


@Entity
@Table(name= "Empleado")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer num_empleado;
	private String nombre;
	private String rol;
	
	public Integer getNum_empleado() {
		return num_empleado;
	}
	public void setNum_empleado(Integer num_empleado) {
		this.num_empleado = num_empleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
}
