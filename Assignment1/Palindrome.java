import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int n = num;
        int rem, rev = 0;

        while(n!=0)
        {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        
        if(rev==num)
        {
            System.out.println(rev + " is the Palindrome of " + num);
        }
        else
        System.out.println(rev + " is not the Palindrome of " + num);
    }
}
