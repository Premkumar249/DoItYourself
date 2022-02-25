import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
        int i=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" Elements of Arrays");
        for( i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.println("Reverse of an array is: ");
        for(i = n-1; i >=0 ; i--)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
