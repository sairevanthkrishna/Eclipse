package Task;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


@interface empid
{
	int empid();
	String empname();
	int empsalary();
	int empage();
	
}


public class Task {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		
		FileReader fr=new FileReader("employee.txt");
		Properties p=new Properties();
		p.load(fr);
		
		System.out.println(Integer.parseInt(p.getProperty("empid"))); 
		System.out.println((p.getProperty("empname"))); 
		System.out.println(Integer.parseInt(p.getProperty("empsalary"))); 
		System.out.println(Integer.parseInt(p.getProperty("empage"))); 
		
	
		

	}

}
