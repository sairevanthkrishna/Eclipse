package com.kanerika.practice;
class Super{
	void display(){
		System.out.println("This is Super Class Display");
	}
	void display(int a,int b) {
		System.out.println("Two Integers value are : "+a+","+b);
	}
	void display(int a) {
		System.out.println("Single Integer value is : "+a);
	}
}
class Sub{
	void display() {
		System.out.println("This is sub class display");
	}
}
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Super sup=new Super();
sup.display();
sup.display(10);
Sub sub=new Sub();
sub.display();
	}

}
