package com.simplilearn.junitorg.bean;

public class Employee {

	//private data variables / properties
	private int empId;
	private String empName;
	private double salary;
	private Department dept;
	private String phoneNumber;
	
	// constructor
	public Employee(){}

	public Employee(int empId, String empName, double salary, Department dept, String phoneNumber) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
		this.phoneNumber = phoneNumber;
	}

	// getter and setter
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// override tostring
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", dept=" + dept
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
}
