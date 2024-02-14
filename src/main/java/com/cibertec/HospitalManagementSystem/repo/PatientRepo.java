package com.cibertec.HospitalManagementSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.HospitalManagementSystem.model.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer>{	

}
