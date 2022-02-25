import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = str.length();
        String rev = "";
        
        for(int i=n-1; i>=0 ; --i)
        {
            rev = rev + str.charAt(i);
        }

        if(str.toUpperCase().equals(rev.toUpperCase()))
        {
            System.out.println(str + " is a Palindrome");
        }
        else
            System.out.println(str+ " is not a Palondrome");
    }
}
