package com.prac.vo;

public class Employee {
	
	private String empNum;
	private String empName;
	private String dept;
	private String role;
	private int age;
	private long sal;
	
	public Employee(){
		
	}
	public Employee(String empNum, String empName, String dept, String role, int age, long sal){
		this.empNum = empNum;
		this.empName = empName;
		this.dept = dept;
		this.role = role;
		this.age = age;
		this.sal = sal;
	}
	public String getEmpNum() {
		return empNum;
	}
	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	

}
