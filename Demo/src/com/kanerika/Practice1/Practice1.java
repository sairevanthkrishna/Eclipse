package com.kanerika.Practice1;

public class Practice1 {

	int x=10;
	int y=20;
	int z;
	public void add(){
		
		z=x+y;
		System.out.println("added Number is : "+z);
	}
	public void sub() {
		z=x-y;
		System.out.println("Substracted Number is : "+z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Practice1 ad=new Practice1();
		ad.add();
		Practice1 sb=new Practice1();
		sb.sub();
	}

}

