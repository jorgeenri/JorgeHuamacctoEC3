package com.example.service;

import java.util.List;


import com.example.dto.RecepcionistaRequestDTO;

public interface RecepcionistaService {
	
	public void guardarRecepcionista(RecepcionistaRequestDTO recepcionista);
	public void editarRecepcionistal(RecepcionistaRequestDTO recepcionista);
	
	public void eliminarRecepcionistal(Integer id);
	
	public List<RecepcionistaRequestDTO> listarRecepcionistal();
	public RecepcionistaRequestDTO obtenerRecepcionistallId(Integer id);
	
	
	


}
