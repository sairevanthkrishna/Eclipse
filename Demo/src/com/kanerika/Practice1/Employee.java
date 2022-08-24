package com.kanerika.Practice1;
class Operations{
	void add(double a,double b){
		double z;
		z=a+b;
		System.out.println("Addition of Two Numbers are : "+z); 
	}
		void sub(double a,double b) {
			double z=a-b;
			System.out.println("Substration of Two Nubers : "+z);
		}	
		void mul(double a,double b) {
			double z=a*b;
			System.out.println("Multiplication of Two Numbers : "+z);
		}
		void div(double a,double b) {
			double z=a/b;
			System.out.println("Division of Two Numbers : "+z);
		}
		void rem(double a,double b) {
			double z=a%b;
			System.out.println("Reminder of Two Numbers : "+z);
		}
	}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Operations ad=new Operations();
		ad.add(2,3);
		ad.sub(2.0, 3.0);
		ad.mul(2.0, 3.0);
		ad.div(4.0, 2.0);
		ad.rem(2.0, 3.0);
	}
}
