package com.simplilearn.junitorg.bean;

public class Department {

	//private data properties
	private int deptId;
	private String deptName;
	
	
	// constructor
	public Department() {}
	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	// getter and setter methods
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	// override tostring
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
}
