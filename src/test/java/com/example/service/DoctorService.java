package com.example.service;

import java.util.List;

import com.example.dto.DoctorResponseDTO;
import com.example.dto.DoctorResquestDTO;


public interface DoctorService {
	
	
	public void guardarDoctor(DoctorResquestDTO doctor);
	public void editarDoctor(DoctorResquestDTO doctor);
	
	public void eliminarDoctor(Integer id);
	
	public List<DoctorResponseDTO> listarDoctor();
	public DoctorResponseDTO obtenerDoctorId(Integer id);

}
