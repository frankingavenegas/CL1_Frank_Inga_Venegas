package com.cibertec.HospitalManagementSystem.service;

import java.util.List;

import com.cibertec.HospitalManagementSystem.model.Pharmacy;

public interface PharmacyService {
	
	public List<Pharmacy> list();
	public Pharmacy add(Pharmacy p);
	public Pharmacy update(Pharmacy p);
	public void delete(int id);
	
}