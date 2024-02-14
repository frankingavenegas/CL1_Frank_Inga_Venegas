package com.cibertec.HospitalManagementSystem.service;

import java.util.List;

import com.cibertec.HospitalManagementSystem.model.Patient;

public interface PatientService {
	
	public List<Patient> list();
	public Patient add(Patient p);
	public Patient update(Patient p);
	public void delete(int id);
	
}