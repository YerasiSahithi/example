package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")

public class Customer {
    @Id

    private int customerid;
    private String customername;
	  private String password;
	  private String email;
	  private int phone;
	  private String address;
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", password=" + password
				+ ", email=" + email + ", phone=" + phone + ", address=" + address + "]";
	}
	public Customer(int customerid, String customername, String password, String email, int phone, String address) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
