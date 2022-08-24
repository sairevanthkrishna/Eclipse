
 class Employee1 {
	//Variable declaration and Initialization
	int employeeId;
	String employeeName;
	double salary;
	
	//Declare the method
	void employeeInfo() {
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Salary : "+salary);
	}
 }
      public class Employee{
public static void main(String []args) {
	System.out.println("---------------- 1st Employee Details-----------");
	Employee1 empInfo=new Employee1();
	empInfo.employeeId=1377;
	empInfo.employeeName="Revanth";
	empInfo.salary=20000.00;
	empInfo.employeeInfo();
	System.out.println();
	System.out.print("-------------- 2nd Employee --------------");
	Employee1 empInfo2=new Employee1();
	System.out.println();
	empInfo2.employeeId=1378;
	empInfo2.employeeName="Rav";
empInfo2.salary=20001.99;
empInfo2.employeeInfo();
System.out.println();
}
}


