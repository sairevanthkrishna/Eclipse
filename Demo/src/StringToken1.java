import java.util.Scanner;
public class StringToken1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String b[]=a.split("[ ,?]+");
System.out.println("The given Input is :"+a);
System.out.println("The length of the given String is :"+a.length());
for(int i=0;i<=b.length-1;i++) {
System.out.println(b[i]);
	}
	}
}
