package com.amal.jms.producer.model;

import org.springframework.stereotype.Component;

@Component
public class Vendor {
	private String vendorName;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String email;

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		if (vendorName == null || vendorName.isEmpty()) {
			vendorName = "vendorName";
		}
		this.vendorName = vendorName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName == null || firstName.isEmpty()) {
			firstName = "firstName";
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName == null || lastName.isEmpty()) {
			lastName = "lastName";
		}
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address == null || address.isEmpty()) {
			address = "address";
		}
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		if (city == null || city.isEmpty()) {
			city = "city";
		}
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		if (state == null || state.isEmpty()) {
			state = "state";
		}
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		if (zipCode == null || zipCode.isEmpty()) {
			zipCode = "zipCode";
		}
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.isEmpty()) {
			phoneNumber = "phoneNumber";
		}
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null || email.isEmpty()) {
			email = "email";
		}
		this.email = email;
	}

	@Override
	public String toString() {
		return "Vendor [vendorName=" + getVendorName() + ", firstName="
				+ getFirstName() + ", lastName=" + getLastName() + ", address="
				+ getAddress() + ", city=" + getCity() + ", state="
				+ getState() + ", zipCode=" + getZipCode() + ", phoneNumber="
				+ getPhoneNumber() + ", email=" + getEmail() + "]";
	}

}
