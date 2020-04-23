package com.claim2;

public class Address {
	
	private String streetNumber;
	private String city;
	private String zip;
	private String state;

public Address() {}

public Address(String streetNumber, String city, String zip, String state) {
	
	this.streetNumber = streetNumber;
	this.city = city;
	this.zip = zip;
	this.state = state;
 }

public String getStreetNumber() {
	return this.streetNumber;
}

public void setStreetNumber(String streetNumber) {
	this.streetNumber = streetNumber;
}

public String getCity() {
	return this.city;
}

public void setCity(String city) {
	this.city = city;
}

public String getZip() {
	return this.zip;
}

public void setZip(String length) {
	this.zip = length;
}

public String getState() {
	return this.state;
}

public void setState(String state) {
	this.state = state;
}

@Override
public String toString() {
	return "Street Number: " + this.streetNumber + ", city: " + this.city + ", state: " + this.state + ", zip: " + this.zip;
 
	
}

}
