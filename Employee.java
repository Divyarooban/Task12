package com.example.hr;

public class Employee {
	private String name;
	private int id;
	private double salary;
	
	public Employee() {
		this.name=name;
		this.id=id;
		this.salary=salary;
		}
	public String getname() {
		return name;

	}
	public void setname(String name) {
		this.name=name;
	}
	public int getid() {
		return id;
	
	}
	public void setid(int id) {
		this.id=id;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double sal) {
		this.salary=sal;
	}
	public void printName() {
		System.out.println("Employee name:" +this.name);
	}
	public void printSalary() {
		System.out.println("Salary:" +this.salary);
	}
}
