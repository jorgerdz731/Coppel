package com.coppel.nomina.models;

import javax.persistence.*;

@Entity
@Table(name = "Movimientos")
public class Movimientos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=false,nullable = false)
	private Integer num_empleado;
	private String mes_ano;
	private Integer cant_entrega;
	
	public Integer getNum_empleado() {
		return num_empleado;
	}
	public void setNum_empleado(Integer num_empleado) {
		this.num_empleado = num_empleado;
	}
	public String getMes_ano() {
		return mes_ano;
	}
	public void setMes_ano(String mes_ano) {
		this.mes_ano = mes_ano;
	}
	public Integer getCant_entrega() {
		return cant_entrega;
	}
	public void setCant_entrega(Integer cant_entrega) {
		this.cant_entrega = cant_entrega;
	}
	

}
