import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr=new int[5];
Scanner sc =new Scanner(System.in);
System.out.println("Enter the Value : ");
arr[0]=sc.nextInt();
arr[1]=sc.nextInt();
arr[2]=sc.nextInt();
arr[3]=sc.nextInt();
arr[4]=sc.nextInt();
for(int i=0;i<arr.length;i++)
System.out.println(arr[i]);
/*for(int i=arr[0];i<arr.length;i++) {
	System.out.println(i);
}*/
System.out.print(arr.length);
	}
}


