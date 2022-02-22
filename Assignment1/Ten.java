import java.util.Scanner;

public class Ten {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rem = 0;

        while (num >0) {
            rem = num % 10;
            System.out.println(rem);
            num = num / 10;
            
        }
        
        
    }
}
