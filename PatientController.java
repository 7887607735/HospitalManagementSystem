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

import com.HospitalManagementSystem.HospitalManagementSystem.Model.Patient;


@RestController
public class PatientController {
	
	@Autowired
	Patient p;
	ArrayList<Patient> a=new ArrayList<Patient>();
	
	public PatientController() {
		p.add(new Patient(1,"Sonali",18,788760));
		p.add(new Patient(2,"Rutuja",45,902201));
		p.add(new Patient(3,"Nikita",34,906754));
		p.add(new Patient(4,"Shraddha",22,841107));
		p.add(new Patient(5,"Wanve",55,749915));

		
	}
	
	
	@GetMapping("allPatient")
	public ArrayList<Patient> allPatient(){
		return a;

	}
	@GetMapping("singlePatient/{id}")
	public Patient singlePatient(@PathVariable int id) {
		Patient p=new Patient();
		for(Patient pt:a) {
			if(pt.id==id)
			p=pt;
		}
		System.out.println(p);
		return p;
	}
	
	@PostMapping("insertSinglePatientDetails")
	public ArrayList<Patient> insertSinglePatientDetails(@RequestBody Patient p){
		a.add(p);
		return a;
	}
	@PutMapping("UpdatePatientDetails")
	public ArrayList<Patient> UpdatePatientDetails(@RequestBody Patient p){
		a.add(p);
		return a;
	}
	@DeleteMapping("DeletePatientDetails")
	public ArrayList<Patient> DeletePatientDetails(@RequestBody Patient p){
		a.remove(p);
		return a;
	}
}
