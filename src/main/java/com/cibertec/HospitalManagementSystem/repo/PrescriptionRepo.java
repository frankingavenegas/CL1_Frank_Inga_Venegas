package com.cibertec.HospitalManagementSystem.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.HospitalManagementSystem.model.Prescription;
import com.cibertec.HospitalManagementSystem.projections.TotalPrescriptionCostProjection;

public interface PrescriptionRepo extends JpaRepository<Prescription, Integer>{
	
	@Query("SELECT "
	        + "p.patient.patientId as patientId, "
	        + "p.patient.patientFName as patientFName, "
	        + "p.patient.patientLName as patientLName, "
	        + "SUM(p.prescriptionCost) as totalPrescriptionCost "
	        + "FROM Prescription p "
	        + "GROUP BY p.patient")
	    List<TotalPrescriptionCostProjection> findTotalPrescriptionCostByPatient();

}
