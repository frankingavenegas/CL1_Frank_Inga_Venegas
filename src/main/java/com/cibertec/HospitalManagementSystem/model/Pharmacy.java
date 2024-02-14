package com.cibertec.HospitalManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pharmacy")
public class Pharmacy {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pharmacyId;
	
    private String pharmacyName;
    private String pharmacyAddress;
    private String pharmacyPhoneNumber; 
    
}