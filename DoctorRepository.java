package com.HospitalManagementSystem.HospitalManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HospitalManagementSystem.HospitalManagementSystem.Model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
