package com.claim2;

public class Person {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	private Address address;
	private String fullName;
	
	public Person() {}
	
	public Person(String firstName, String middleName, String lastName, String phoneNumber, Address address, String fullName) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.fullName = fullName;
		
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return this.middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	
    }
	
	public Address getAddress() {
		return this.address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getFullName() {
		return this.getFirstName() + this.getMiddleName() + this.getLastName();
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	@Override
	public String toString() {
		return "First Name: "  + this.firstName + ", Middle Name: " + this.middleName + ", Last Name: " + this.lastName + ", Phone Number: " + this.phoneNumber + this.address;
	}


}


