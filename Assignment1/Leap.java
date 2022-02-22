import java.util.Scanner;

public class Leap {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if((year%4==0 && year%100!=0) || year%400==0)
        {
            System.out.println(year + " is Leap Year");
        }
        else
        {
            System.out.println(year +" is Not a Leap Year");
        }
    }
}
