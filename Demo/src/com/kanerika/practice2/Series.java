package com.kanerika.practice2;
import java.util.Scanner;
public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//(a+2^0*b),(a+2^0*b+2^1*b)...(a+2^0*b+2^1*b+2^n-1*b)
		int c,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of Queries :");
		int noQueries=sc.nextInt();
		for(int i=0;i<noQueries;i++) {
			System.out.println("Enter the value of 'a'");
			int a=sc.nextInt();
			System.out.println("Enter the value of 'b'");
			int b=sc.nextInt();
			System.out.println("Enter the value of 'n'");
			int n=sc.nextInt();
			for(int j=0;j<n;j++) {
				System.out.print(a+((int)Math.pow(2, j))*b);
				c=a+((int)Math.pow(2, j))*b;
				if(k<n) {
					
				}
				//c,c+2^1*b,...c+2^n-1*b
				System.out.print(c+((int)Math.pow(2, j)*b));
				System.out.print(',');
			}
		}
	}

}
