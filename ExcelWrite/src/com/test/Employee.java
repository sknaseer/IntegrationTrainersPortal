package com.test;

public class Employee {

	private String empName;
	
	private String empAge;
	private String empID;
	
	public Employee(String empName, String empAge, String empID) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empID = empID;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAge() {
		return empAge;
	}
	public void setEmpAge(String empAge) {
		this.empAge = empAge;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	
}
