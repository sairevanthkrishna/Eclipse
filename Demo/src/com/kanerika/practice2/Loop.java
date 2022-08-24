package com.kanerika.practice2;

public class Loop {
public static void main(String []args) {
	String address ="Hyderabad,Delhi,India";
	if(address.endsWith("India")){
		if(address.contains("Noida")){
		System.out.println("The City is Noida.");
		}
		else if(address.contains("Hyderabad")){
			System.out.println("The City is Hyderabad.");
	}
		else {
			System.out.println(address.split(",")[0]);
		}
}
	else {
		System.out.println("The City is not Present.");
	}
}

}
