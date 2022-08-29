package Jaxb.Jaxb;


	import java.io.File;
	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	import javax.xml.parsers.DocumentBuilder;
	import javax.xml.parsers.DocumentBuilderFactory;
	import javax.xml.parsers.ParserConfigurationException;

	import org.w3c.dom.Document;
	import org.w3c.dom.Element;
	import org.w3c.dom.Node;
	import org.w3c.dom.NodeList;
	import org.xml.sax.SAXException;

import clojure.java.io.file;

	public class XML_database {
	public static void main(String[] args) throws SQLException, SAXException, IOException, ParserConfigurationException{
	try {
	Class.forName("org.postgresql.Driver");
	Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Revanth", "postgres", "1556");
	Statement st=con.createStatement();


	DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
	Document doc = docBuilder.parse ("C:\\Users\\Admin\\eclipse-workspace\\Jaxb\\src\\main\\java\\Jaxb\\Jaxb\\data.xml");
	doc.getDocumentElement().normalize();
	System.out.println ("Root element of the doc is " + doc.getDocumentElement().getNodeName());
	System.out.println(doc);

	NodeList nodeList = doc.getElementsByTagName("employee2");
	System.out.println(nodeList);
	for (int itr = 0; itr < nodeList.getLength(); itr++)  
	{  
	Node node = nodeList.item(itr);  
	System.out.println("\nNode Name :" + node.getNodeName());  
	if (node.getNodeType() == Node.ELEMENT_NODE)  
	{  
	Element eElement = (Element) node;    
	String empid= eElement.getElementsByTagName("empid").item(0).getTextContent(); 
	String empname  = eElement.getElementsByTagName("empname").item(0).getTextContent();  
	String empsalary =  eElement.getElementsByTagName("empsalary").item(0).getTextContent(); 
	System.out.println(empid+" "+empname+" "+empsalary);
	int r=st.executeUpdate("insert into employee2(empid,empname,empsalary) values('"+empid+"','"+empname+"','"+empsalary+"')");
	}
	}
	System.out.println("Data is successfully inserted!");
	}
	catch (Exception e)  
	{  
	e.printStackTrace();  
	}
	}
	}

