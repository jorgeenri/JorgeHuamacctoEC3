package com.example.dto;

public class EspecialidadRequestDTO {
	private int idEspecialidad;
	private String especialidad;
	private String diasAtiende;
	
	public int getidEspecialidad() {
		return idEspecialidad;
		
		
		
	}
	public int getIdEspecialidad() {
		return idEspecialidad;
	}
	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getDiasAtiende() {
		return diasAtiende;
	}
	public void setDiasAtiende(String diasAtiende) {
		this.diasAtiende = diasAtiende;
	}
	
}
