package com.HospitalManagementSystem.HospitalManagementSystem.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HospitalManagementSystem.HospitalManagementSystem.Model.Doctor;

@RestController
public class DoctorController {
	
	@Autowired
	Doctor d;
	ArrayList<Doctor> a=new ArrayList<Doctor>();
	
	
}
