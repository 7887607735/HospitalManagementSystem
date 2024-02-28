package com.HospitalManagementSystem.HospitalManagementSystem.Model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
@Component
public class Doctor {
	
	@Id
	int id;
	String specialization;
	long contact;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int id, String specialization, long contact) {
		super();
		this.id = id;
		this.specialization = specialization;
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", specialization=" + specialization + ", contact=" + contact + "]";
	}
	
	}