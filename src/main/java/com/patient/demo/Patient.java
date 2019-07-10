package com.patient.demo;

public class Patient {
	private String name;
	private String address;
	private String phone;
	private String email;
	private String PostalCode;
	public Patient(String name, String address, String phone, String email, String postalCode) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.PostalCode = postalCode;
	}


	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String i) {
		this.phone = i;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
}