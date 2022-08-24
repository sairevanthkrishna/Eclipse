package com.kanerika.practice;



class Other{
	protected int a;
	public int getInt() {
		return a;
	}
	public void setInt(int b) {
		this.a=b;
		System.out.println(b);
	}
}
	public class Main1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Other in=new Other();
System.out.println(in.getInt());
	in.setInt(37);
	System.out.println(in.getInt());
}
	}
