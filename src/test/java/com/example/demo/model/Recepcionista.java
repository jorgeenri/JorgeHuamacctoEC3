package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;



@Table(name = "Recepcionista") 
@Entity
public class Recepcionista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRecepcionista;
	private String nombre;
	private String celular;
	
	@OneToMany(mappedBy = "Recepcionista")
	private List<Especialidad> especialidad =new ArrayList<Especialidad>();

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

	public List<Especialidad> getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(List<Especialidad> especialidad) {
		this.especialidad = especialidad;
	}
	
	

	
	

	
	
	
	
}
