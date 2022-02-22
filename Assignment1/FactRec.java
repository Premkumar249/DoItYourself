import java.util.Scanner;

public class FactRec {
    static int rec(int num)
    {
        if (num == 0)
            return 1;
        else
            return (num * rec(num - 1));
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Factorial is: " + rec(num));
    }
}
