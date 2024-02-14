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
@Table(name = "department")
public class Department {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;	
	
	private String departmentName;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hospital_id", referencedColumnName = "hospitalId" )
    private Hospital hospital;
	
}