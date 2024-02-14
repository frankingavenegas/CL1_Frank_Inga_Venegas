package com.cibertec.HospitalManagementSystem.service;

import java.util.List;

import com.cibertec.HospitalManagementSystem.model.Prescription;
import com.cibertec.HospitalManagementSystem.projections.TotalPrescriptionCostProjection;

public interface PrescriptionService {
	
	public List<Prescription> list();
	public Prescription add(Prescription p);
	public Prescription update(Prescription p);
	public void delete(int id);
	
	List<TotalPrescriptionCostProjection> calculateTotalPrescriptionCostByPatient();
	
}