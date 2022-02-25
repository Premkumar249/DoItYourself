import java.util.Scanner;

public class MZS {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements: ");
        for(int i = 0; i<n;i++)
        {
            arr[i] = scan.nextInt();
        }

        int c = n - 1;
        for (int i = n - 1; i >= 0; i--)
        {
            if (arr[i] != 0) {
                arr[c] = arr[i];
                c--;
            }
        }
        while (c >= 0)
        {
            arr[c] = 0;
            c--;
        }
        
        System.out.println("After Moving Zero to Last:");
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
