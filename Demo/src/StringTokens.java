import java.util.Scanner;
public class StringTokens {

	public static void main(String args[])
    {
        // Custom input string
        String str = "geekss@for@geekss geee";
        String[] arrOfStr = str.split("@",9);
  
        for (String a : arrOfStr)
            System.out.println(a);
    }
}

