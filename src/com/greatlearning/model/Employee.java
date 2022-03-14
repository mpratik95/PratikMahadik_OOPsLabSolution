package com.greatlearning.model;

public class Employee {
	
	public String fname,lname;
	public Employee(String fname , String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}

}
