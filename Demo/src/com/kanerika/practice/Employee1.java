package com.kanerika.practice;


class Employee1{
	public static void main(String []args) {
		Employee emp1 = new Employee();
		emp1.employeeId=1033;
		System.out.println(emp1.employeeId);
		
	}
}
public class Employee {
	// var initialization and declaration
	int employeeId;
	String employeeName;
	double salary;
	
	
	//method declaration
	
	int employeeIdInfo() {
		return employeeId;
	}
	
}
