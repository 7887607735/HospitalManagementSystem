package com.HospitalManagementSystem.HospitalManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HospitalManagementSystem.HospitalManagementSystem.Model.Appoinment;

public interface AppoinmentRepository extends JpaRepository <Appoinment, Long> {

}
