import java.util.Scanner;

public class SumofAllDigit {
        public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rem = 0;
        int sum = 0;
        while (num >0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        
        System.out.println(sum);
    }
}

