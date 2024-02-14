package com.cibertec.HospitalManagementSystem.projections;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"patientId", "patientFName", "patientLName", "totalPrescriptionCost"})
public interface TotalPrescriptionCostProjection {
	public Integer getPatientId();
	public String getPatientFName();
	public String getPatientLName();	
	public Double getTotalPrescriptionCost();
}