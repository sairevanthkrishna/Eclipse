package Jaxb.Jaxb;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import clojure.reflect.TypeReference;
import jsondata.jsondata.jsongetterand;

public class Json_To_Java {

	
		public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException, SQLException,
		IllegalArgumentException, IllegalAccessException {
		String url = "jdbc:postgresql://localhost:5432/Revanth";
		String user = "postgres";
		String pass = "1556";
		ObjectMapper maper = new ObjectMapper();
		File jsonfile = new File("C:\\Users\\Admin\\git\\Eclipse\\Jaxb\\src\\main\\java\\Jaxb\\Jaxb\\jsondata.json");
		List<jsongetterand> employeelist = maper.readValue(jsonfile, new TypeReference<List<jsongetterand>>() { });
		         System.out.println(employeelist);
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection(url, user, pass);
		String query ="INSERT INTO employeedetails(\n" + " id,name,position)\n" + "values(?, ?, ?)\n" ;
		PreparedStatement pstmt = conn.prepareStatement(query);


		for (jsongetterand employee1 : employeelist) {
		int i = 1;
		Class<?> test = employee1.getClass();
		Field[] field = test.getDeclaredFields();
		for (Field filed : field) {
		filed.setAccessible(true);
		if (filed.getType() == int.class) {
		pstmt.setInt(i, filed.getInt(employee1));
		i++;
		} else {
		pstmt.setString(i, filed.get(employee1).toString());
		i++;
		}
		}
		pstmt.execute();
		}
		}
		
		
		
		
		
		
		
		
		

	}


