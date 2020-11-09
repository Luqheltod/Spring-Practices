package com.BootNewbyes.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

	private UUID id;
	private final Integer age;
	private final String firstname;
	private final String lastname;
	private final String course;
	
	public Student(@JsonProperty("id") UUID id, 
			@JsonProperty("age")Integer age, 
			@JsonProperty("firstname")String firstname,
			@JsonProperty("lastname")String lastname, 
			@JsonProperty("course")String course) {
		
		this.id = id;
		this.age = age;
		this.firstname = firstname;
		this.lastname = lastname;
		this.course = course;
	}

	public UUID getId() {
		return id;
	}
	
	

	public void setId(UUID id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getCourse() {
		return course;
	}
	
	
}
