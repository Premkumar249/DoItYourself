public class SecMin {
    public static void main(String[] args)
    {
        int[] arr = { 30, 20, 25, 69, 75, 89, 100 };
        int n = arr.length;
        int temp = 0;


        for(int i = 0; i<n ; i++)
        {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Minimum Element is: "+arr[1]);
    }
}
