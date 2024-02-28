package com.HospitalManagementSystem.HospitalManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HospitalManagementSystem.HospitalManagementSystem.Model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

}
