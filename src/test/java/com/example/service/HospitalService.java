package com.example.service;

import java.util.List;


import com.example.dto.HospitalRequestDTO;
import com.example.dto.HospitalResponseDTO;

public interface HospitalService {
	
	
	public void guardarHospital(HospitalRequestDTO hospital);
	public void editarHospital(HospitalRequestDTO hospital);
	
	public void eliminarHospital(Integer id);
	
	public List<HospitalResponseDTO> listarEspecialidad();
	public HospitalResponseDTO obtenerHospitalId(Integer id);

}
