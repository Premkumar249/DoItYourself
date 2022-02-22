import java.util.Scanner;

public class Smallest {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        int sum = a + b + c;

        for(int i = 0; i<=sum;i++)
        {
            a--;
            b--;
            c--;

            if(a==0)
            {
                System.out.println("a is smallest number");
                break;
            }
            else if(b==0)
            {
                System.out.println("b is smallest number");
                break;
            }
            else if(c==0)
            {
                System.out.println("c is smallest number");
                break;
            }
        }



    }
}
