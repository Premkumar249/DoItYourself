import java.util.Scanner;

public class LCM {
    public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int o = scan.nextInt();
            int gcd = 1;

        for(int i = 1;i<=n && i<=o;i++)
        {
            if (n % i == 0 && o % i == 0) {
                gcd = i;
            }

        }

        int LCM = (n * o) / gcd;
        System.out.println("LCM of "+n+" & "+o+ " is "+LCM);
        }
}
