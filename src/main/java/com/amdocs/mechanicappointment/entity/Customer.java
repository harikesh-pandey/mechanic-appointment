package com.amdocs.mechanicappointment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int userId;
	@Column
	@NotBlank
	private String name;
	@Column
	@NotBlank
	private String address;
	@Column
	@NotBlank
	private String contactNo;
	
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", name=" + name + ", address=" + address + ", contactNo=" + contactNo
				+ "]";
	}
	public int getUserId() { return userId; }
	public void setUserId(int userId) { this.userId = userId; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }
	public String getContactNo() { return contactNo; }
	public void setContactNo(String contactNo) { this.contactNo = contactNo; }
	
	public Customer() {
		super();
	}
	
	public Customer(int userId, String name, String address, String contactNo) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
	}
	
}
