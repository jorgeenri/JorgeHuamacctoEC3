package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Hospital;

public interface HospitalRepositorio extends JpaRepository<Hospital, Integer> {

}
