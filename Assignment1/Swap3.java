import java.util.Scanner;

public class Swap3 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();


        a = a ^ b;
        System.out.println("a= "+a);
        b = a ^ b;
        System.out.println("b= "+b);
        a = a ^ b;
        System.out.println("a= "+a);
        System.out.println("After Swapping a = " +a+ " & b = " +b);
    }
}
