package com.kanerika.practice2;
import java.util.Scanner;
public class StringStratToEnd {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}
