package com.aplicacion.mongo.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Computadores")
public class Computador {
	
	@Id
	private int num_Computador;
	private int piso;
	private boolean estado;
	public Computador() {
		super();
		}
	public Computador(int num_Computador, int piso, boolean estado) {
		super();
		this.num_Computador = num_Computador;
		this.piso = piso;
		this.estado = estado;
	}
	public int getNum_Computador() {
		return num_Computador;
	}
	public void setNum_Computador(int num_Computador) {
		this.num_Computador = num_Computador;
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
}
