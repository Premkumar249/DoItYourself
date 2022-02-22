import java.util.Scanner;

public class ArithOp {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        while (b>0)
        {
            a++;
            b--;
        }
        System.out.println(a);
    }
}
