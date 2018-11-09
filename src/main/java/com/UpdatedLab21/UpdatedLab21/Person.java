package com.UpdatedLab21.UpdatedLab21;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String firstName;
	private String lastName;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	@Override
	public String toString() {
		return "Hello " + firstName + " " + lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
