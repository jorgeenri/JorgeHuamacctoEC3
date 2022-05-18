package com.example.service;

import java.util.List;

import com.example.dto.EspecialidadRequestDTO;
import com.example.dto.EspecialidadResponseDTO;


public interface EspecialidadService {
	
	public void guardarEspecialidad(EspecialidadRequestDTO especialidad);
	public void editarEspecialidad(EspecialidadRequestDTO especialidad);
	
	public void eliminarEspecialidad(Integer id);
	
	public List<EspecialidadResponseDTO> listarEspecialidad();
	public EspecialidadResponseDTO obtenerEspecialidadId(Integer id);
	
	

}
