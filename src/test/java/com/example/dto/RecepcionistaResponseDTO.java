package com.example.dto;

public class RecepcionistaResponseDTO {
	private int idRecepcionista;
	private String nombre;
	private String celular;
	private int idEspecialista;
	public int getidRecepcionista(){
		return idRecepcionista;
	}
	public int getIdRecepcionista() {
		return idRecepcionista;
	}
	public void setIdRecepcionista(int idRecepcionista) {
		this.idRecepcionista = idRecepcionista;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public int getIdEspecialista() {
		return idEspecialista;
	}
	public void setIdEspecialista(int idEspecialista) {
		this.idEspecialista = idEspecialista;
	}

}
