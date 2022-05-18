package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Doctor;

public interface DoctorRepositorio extends JpaRepository<Doctor, Integer> {

}
