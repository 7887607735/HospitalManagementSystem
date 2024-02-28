package com.HospitalManagementSystem.HospitalManagementSystem.Controller;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HospitalManagementSystem.HospitalManagementSystem.Model.Appoinment;
import com.HospitalManagementSystem.HospitalManagementSystem.Model.Doctor;
import com.HospitalManagementSystem.HospitalManagementSystem.Model.Patient;

@RestController
public class AppoinmentController {
	
	@GetMapping("getAppoinmentwithDoctorswithPatientId")
	public String getAppoinmentwithDoctorswithPatientId(@RequestBody Patient id) {
		ArrayList<Appoinment> a=new ArrayList<Appoinment>();
		if(a==null || a.size()==0) {
			return "Appoinment Not Available";
			
		} else { 
			return "Appoinment Fetched";
		}
	}
	@GetMapping("getAppoinmentwithDoctorswithDoctorId")
		public String getAppoinmentwithDoctorswithDoctorId(@RequestBody Doctor id) {
			ArrayList<Appoinment> a=new ArrayList<Appoinment>();
			if(a==null || a.size()==0) {
				return "Appoinment Not Available";
				
			} else { 
				return "Appoinment Fetched";
			}
		
	}

}
