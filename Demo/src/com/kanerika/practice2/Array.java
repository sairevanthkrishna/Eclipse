package com.kanerika.practice2;
import java.util.Scanner;
public class Array {

	public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the Size of the Array");
int a=s.nextInt();
int b[]=new int[a];
System.out.println("Enter the values");
for(int i=0;i<a;i++) {
	b[i]=s.nextInt();
}
for(int j=0;j<b.length;j++) {
	System.out.println("Entered values are : ");
	System.out.println(b[j]+" ");
}
System.out.println();
for(int i=0;i<b.length;i++) {
	if(b[i]==0) {
		b[i]=1;
	}
	else if(b[i]==1){
		b[i]=0;
	}
	else
	{
		b[i]=b[i];
	}
	System.out.println(b[i]+" ");
}
	}

}
