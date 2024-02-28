package com.HospitalManagementSystem.HospitalManagementSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HospitalManagementSystem.HospitalManagementSystem.Repository.AppoinmentRepository;

@Service
public class AppoinmentService {
	
	@Autowired
	private AppoinmentRepository appoinmentRepository;

}
