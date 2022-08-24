package com.kanerika.Practice1;
import java.util.Scanner;
public class Array {
int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,6,10};
Scanner sc =new Scanner(System.in);
System.out.println("Enter a Integer value : ");
Array in=new Array();

System.out.println(sc.nextInt());
System.out.println(a[0]);

    // declares an Array of integers.
    int[] arr;

    // allocating memory for 5 integers.
    arr = new int[5];

    // initialize the first elements of the array
    Scanner r=new Scanner(System.in);
    System.out.println("Enter Array Index [0] value : ");
    arr[0] = sc.nextInt();

    // initialize the second elements of the array
    arr[1] = 20;

    // so on...
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;

    // accessing the elements of the specified array
    for (int i = 0; i < arr.length; i++)
        System.out.println("Element at index " + i
                           + " : " + arr[i]);
}
	}
