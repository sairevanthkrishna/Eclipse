package com.kanerika.practice;
class Method{

protected String name;

public String getName() {
	return this.name;
	
}
public  void setName(String name) {
	this.name=name;
}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method in=new Method();
in.setName("Revanth");
System.out.println(in.getName());

	}

}
