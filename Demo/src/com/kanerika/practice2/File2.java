package com.kanerika.practice2;


	import java.util.*;  
	import java.io.*;  
	public class File2 {  
	public static void main(String[] args)throws Exception{  
	    FileReader reader=new FileReader("Sum.properties");  
	      
	  Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("num2"));  
	    System.out.println(p.getProperty("num1"));  
	}  
	}  

