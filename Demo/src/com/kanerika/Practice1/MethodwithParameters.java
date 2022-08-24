package com.kanerika.Practice1;

 class ToCall {
	void employeeInfo(int employeeId, String employeeName, double salary) {
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Salary"+salary);
	}
 }
public class MethodwithParameters{
	public static void main(String []args) {
		
	
ToCall obj=new ToCall();
obj.employeeInfo(1,"Revanth",20000.00);
System.out.println("----------------");
obj.employeeInfo(2,"Re",20001.00);
System.out.println("----------------");
obj.employeeInfo(3,"th",20003.00);
}
}



