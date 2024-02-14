package com.cibertec.HospitalManagementSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.HospitalManagementSystem.model.Prescription;
import com.cibertec.HospitalManagementSystem.projections.TotalPrescriptionCostProjection;
import com.cibertec.HospitalManagementSystem.repo.PrescriptionRepo;
import com.cibertec.HospitalManagementSystem.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService{
	
	@Autowired
	PrescriptionRepo prescriptionRepo;

	@Override
	public List<Prescription> list() {
		return prescriptionRepo.findAll();
	}

	@Override
	public Prescription add(Prescription p) {
		return prescriptionRepo.save(p);
	}

	@Override
	public Prescription update(Prescription p) {
		return prescriptionRepo.save(p);
	}

	@Override
	public void delete(int id) {
		prescriptionRepo.deleteById(id);		
	}

	@Override
	public List<TotalPrescriptionCostProjection> calculateTotalPrescriptionCostByPatient() {
		return prescriptionRepo.findTotalPrescriptionCostByPatient();
	}
	
}