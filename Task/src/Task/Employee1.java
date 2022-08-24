package Task;

public class Employee1 {
	
		
	  	
	    private int EmployeeSalary;
	      
	    @ChangeValue(value="Name")
	    private String EmployeeName;
	    
	    private int EmployeeId;

	    
	    
		public Employee1(int employeeSalary, String employeeName, int employeeId) {
	
			EmployeeSalary = employeeSalary;
			EmployeeName = employeeName;
			EmployeeId = employeeId;
		}

		public int getEmployeeSalary() {
			return EmployeeSalary;
		}

		public void setEmployeeSalary(int employeeSalary) {
			EmployeeSalary = employeeSalary;
		}

		public String getEmployeeName() {
			return EmployeeName;
		}

		public void setEmployeeName(String employeeName) {
			EmployeeName = employeeName;
		}

		public int getEmployeeId() {
			return EmployeeId;
		}
}
