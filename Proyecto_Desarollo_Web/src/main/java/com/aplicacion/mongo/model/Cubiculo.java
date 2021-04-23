package com.aplicacion.mongo.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cubiculos")
public class Cubiculo {
	
	@Id
	private int num_Cubiculo;
	private String tipo_Cubiculo;
	private int piso;
	private boolean estado;
	public Cubiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cubiculo(int num_Cubiculo, String tipo_Cubiculo, int piso, boolean estado) {
		super();
		this.num_Cubiculo = num_Cubiculo;
		this.tipo_Cubiculo = tipo_Cubiculo;
		this.piso = piso;
		this.estado = estado;
	}
	public int getNum_Cubiculo() {
		return num_Cubiculo;
	}
	public void setNum_Cubiculo(int num_Cubiculo) {
		this.num_Cubiculo = num_Cubiculo;
	}
	public String getTipo_Cubiculo() {
		return tipo_Cubiculo;
	}
	public void setTipo_Cubiculo(String tipo_Cubiculo) {
		this.tipo_Cubiculo = tipo_Cubiculo;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	

}
