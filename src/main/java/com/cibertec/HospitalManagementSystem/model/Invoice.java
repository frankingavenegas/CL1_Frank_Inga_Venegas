package com.cibertec.HospitalManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "invoice")
public class Invoice {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int invoiceNum;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id", referencedColumnName = "patientId")
    
    private Patient patient;
    private String serviceDescription;
    private double cost;
    private double total;
    
}