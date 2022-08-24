package Task;

import java.io.IOException;

//import java.lang.reflect.Field;
public class Main {
public static void main(String args[]) throws IOException,Exception{
		
		Employee1 employee = new Employee1(23800,"Revanth",1);
		Test test=new Test();
		String s=test.convert(employee);
		
		System.out.println(s);
		System.out.println(employee.getEmployeeId() + " " + employee.getEmployeeName() + " " + employee.getEmployeeSalary());
		
	}
}
