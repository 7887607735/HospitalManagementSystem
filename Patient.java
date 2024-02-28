package com.HospitalManagementSystem.HospitalManagementSystem.Model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class Patient {
	@Id
	public int id;
	String name;
	int age;
	long contact;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int id, String name, int age, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", contact=" + contact + "]";
	}
	public void add(Patient patient) {
		// TODO Auto-generated method stub
		
	}
	
	
	}
	
	
	

