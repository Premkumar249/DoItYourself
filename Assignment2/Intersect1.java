import java.util.Scanner;

public class Intersect1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array1: ");
        int n1 = scan.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter the Elements of Array1: ");
        for (int i = 0; i < n1; i++)
        {
            arr1[i] = scan.nextInt();
        }

        System.out.println("Enter the size of the array2: ");
        int n2 = scan.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the Elements of Array1: ");
        for (int j = 0; j < n2; j++)
        {
            arr2[j] = scan.nextInt();
        }
        
        System.out.println("Intersection of two arrays");
        for(int i = 0; i<n1; i++)
        {
            for(int j = 0; j<n2;j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.print(arr2[j]+ " ");
                }
            }
        }
    }
}
