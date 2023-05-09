package com.coppel.nomina.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Nominas")
public class NominaRest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = false, nullable = false)
	private Integer numero_empleado;
	private String nombre_empleado;
	private String periodo;
	private Integer cantidad_entregas;
	private String rol_nombre;
	private Integer hras_trabajadas;
	private double sueldo_nominal;
	private double bono_hras_trabajadas;
	private double bono_x_entrega_cliente;
	private double total_percepcion;
	private double vales_despensa;
	private double impuesto;
	private double impuesto_extra;
	private double sueldo_neto;
	
	public Integer getNumero_empleado() {
		return numero_empleado;
	}
	public void setNumero_empleado(Integer numero_empleado) {
		this.numero_empleado = numero_empleado;
	}
	public String getNombre_empleado() {
		return nombre_empleado;
	}
	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Integer getCantidad_entregas() {
		return cantidad_entregas;
	}
	public void setCantidad_entregas(Integer cantidad_entregas) {
		this.cantidad_entregas = cantidad_entregas;
	}
	public String getRol_nombre() {
		return rol_nombre;
	}
	public void setRol_nombre(String rol_nombre) {
		this.rol_nombre = rol_nombre;
	}
	public Integer getHras_trabajadas() {
		return hras_trabajadas;
	}
	public void setHras_trabajadas(Integer hras_trabajadas) {
		this.hras_trabajadas = hras_trabajadas;
	}
	public double getSueldo_nominal() {
		return sueldo_nominal;
	}
	public void setSueldo_nominal(double sueldo_nominal) {
		this.sueldo_nominal = sueldo_nominal;
	}
	public double getBono_hras_trabajadas() {
		return bono_hras_trabajadas;
	}
	public void setBono_hras_trabajadas(double bono_hras_trabajadas) {
		this.bono_hras_trabajadas = bono_hras_trabajadas;
	}
	public double getBono_x_entrega_cliente() {
		return bono_x_entrega_cliente;
	}
	public void setBono_x_entrega_cliente(double bono_x_entrega_cliente) {
		this.bono_x_entrega_cliente = bono_x_entrega_cliente;
	}
	public double getTotal_percepcion() {
		return total_percepcion;
	}
	public void setTotal_percepcion(double total_percepcion) {
		this.total_percepcion = total_percepcion;
	}
	public double getVales_despensa() {
		return vales_despensa;
	}
	public void setVales_despensa(double vales_despensa) {
		this.vales_despensa = vales_despensa;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	public double getImpuesto_extra() {
		return impuesto_extra;
	}
	public void setImpuesto_extra(double impuesto_extra) {
		this.impuesto_extra = impuesto_extra;
	}
	public double getSueldo_neto() {
		return sueldo_neto;
	}
	public void setSueldo_neto(double sueldo_neto) {
		this.sueldo_neto = sueldo_neto;
	}

	
	

}
