package Task;

		import java.io.FileReader;
		import java.io.IOException;
		import java.util.Properties;
		public class Employee {
			@interface Empid{
				
			}
			@Empid{
				
			}
		// @Jsonproperty(key="id")
		private int empid;
		private String empname;
		private double empsal;

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileReader fr=new FileReader("C:\\Users\\Admin\\eclipse-workspace\\Task\\src\\Task\\Employee_Properties");
		Properties prop=new Properties();
		prop.load(fr);

		System.out.println(prop.getProperty("empid"));
		System.out.println(prop.getProperty("empname"));
		System.out.println(prop.getProperty("empsal"));

		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}

	}


