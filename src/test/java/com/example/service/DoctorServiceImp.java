package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Doctor;
import com.example.dto.DoctorResquestDTO;
import com.example.repository.DoctorRepositorio;
import com.idat.AbrilServicioI.dto.ProductoDTORequest;
import com.idat.AbrilServicioI.dto.ProductoDTOResponse;
import com.idat.AbrilServicioI.modelo.Productos;
import com.idat.AbrilServicioI.repositorio.ProductoRepositorio;

@Service
public class DoctorServiceImp {
	
	@Autowired
	public DoctorRepositorio repositorio;
	
	public void guardarDoctor(DoctorResquestDTO doctor) {
		
		Doctor p = new Doctor();
		p.setIdDoctor(doctor.getIdDoctor());
		p.setDoctor(doctor.getDoctor());
		p.setNumero(doctor.getNumero());
		
		repositorio.saveAll(p);
	}

	
	

	

}
