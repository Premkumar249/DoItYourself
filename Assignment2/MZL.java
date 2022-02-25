import java.util.Scanner;

public class MZL {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        int c = 0; //initialise a value as 0 for comparing

        //iterate the array elements one by one
        for (int i = 0; i < n; i++)
        {
            if (arr[i] != 0) {
                arr[c] = arr[i];    //if it is not zero move to the left side of the array.
                c++;
            }
        }
        while (c < n)
        {
            arr[c] = 0; //move all zeros to right
            c++;
        }
        
        System.out.println("After Moving Zero to Last:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
