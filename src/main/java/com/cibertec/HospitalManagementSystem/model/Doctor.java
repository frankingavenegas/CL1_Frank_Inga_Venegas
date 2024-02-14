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
@Table(name = "doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorId;
	
	private String doctorFName;
    private String doctorLName;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id", referencedColumnName = "departmentId")
    private Department department;
    
    private String doctorPhoneNumber;
    
}