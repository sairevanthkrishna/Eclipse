package com.kanerika.practice;
class Employee2{
int employeeId;
String employeeName;
double salary;
int employeeId() {
	return employeeId;
}
String employeeName() {
	return employeeName;
}
double salary() {
	return salary;
}
}

public class EmployeeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------1st Employee------------");
		System.out.println();
Employee2 em1=new Employee2();
em1.employeeId=1023;
em1.employeeName="Revanth";
em1.salary=200000.00;
System.out.println("Employee Id : "+em1.employeeId());
System.out.println("Employee Name : "+em1.employeeName());
System.out.println("Employee Salary"+em1.salary());
System.out.println();
System.out.println("---------------2nd Employee---------");
System.out.println();
Employee2 em2=new Employee2();
em2.employeeId=1022;
em2.employeeName="Re";
em2.salary=21000.00;
System.out.println("Employee Id : "+em2.employeeId());
System.out.println("Employee Name : "+em2.employeeName());
System.out.println("Employee Salary"+em2.salary());
System.out.println();
System.out.println("------------3rd Employee--------------");
System.out.println();
Employee2 em3=new Employee2();
em3.employeeId=1024;
em3.employeeName="Ra";
em3.salary=22000.00;
System.out.println("Employee Id : "+em3.employeeId());
System.out.println("Employee Employee Name"+em3.employeeName());
System.out.println("Employee Salary"+em3.salary());
	}

 }

