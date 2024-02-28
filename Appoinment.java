package com.HospitalManagementSystem.HospitalManagementSystem.Model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class Appoinment {
	@Id
	int id;
	private Patient  patient;
	private Doctor doctor;
	private LocalDateTime datetime;
	public Appoinment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appoinment(int id, Patient patient, Doctor doctor, LocalDateTime datetime) {
		super();
		this.id = id;
		this.patient = patient;
		this.doctor = doctor;
		this.datetime = datetime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "Appoinment [id=" + id + ", patient=" + patient + ", doctor=" + doctor + ", datetime=" + datetime + "]";
	}
	

	

}
