package com.aplicacion.mongo.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Tablets")
public class Tablet {
	@Id
	private int num_Tablets;
	private int piso;
	private boolean estado;
	public Tablet() {
		super();
		
	}
	public int getNum_Tablets() {
		return num_Tablets;
	}
	public void setNum_Tablets(int num_Tablets) {
		this.num_Tablets = num_Tablets;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Tablet(int num_Tablets, int piso, boolean estado) {
		super();
		this.num_Tablets = num_Tablets;
		this.piso = piso;
		this.estado = estado;
	}
}
