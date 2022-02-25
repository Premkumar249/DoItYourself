import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the ELements: ");

        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        int sum1 = 0;
        for (int i = 1; i < n; i++) {
            if(arr[i]-arr[i-1]==2)
            System.out.println("Missing Number is: " + (arr[i]-1));
        }
        
    }
}