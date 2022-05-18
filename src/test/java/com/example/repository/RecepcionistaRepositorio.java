package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Recepcionista;

@Repository
public interface RecepcionistaRepositorio extends JpaRepository<Recepcionista, Integer> {

}
