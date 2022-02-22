import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();


        if (num >= 0)
        {
            System.out.println(+num + " is Positive Number.");
        }
        else
        {
            System.out.println(+num + " is Negative Number.");
        }
    }
}
