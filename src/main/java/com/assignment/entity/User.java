package com.assignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	 @NotEmpty(message = "Username is required")
	private String name;

	 @NotEmpty(message = "Phone number is required")
	 @Pattern(regexp = "^\\d{10}$", message = "Please enter a valid 10-digit phone number")
	private String mobileNo;

	private String email;
	
	@NotEmpty(message = "Password is required")
   // @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]+)$", message = "Password should contain letters and numbers only")
	private String password;

	private String role;

	 @NotEmpty(message = "Date of Birth is required")
	private String dob; // Date of birth

	 @NotEmpty(message = "Address is required")
	private String address;
	

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobileNo=" + mobileNo + ", email=" + email + ", password="
				+ password + ", role=" + role + ", dob=" + dob + ", address=" + address + "]";
	}

	

}
