import java.util.Scanner;

class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		/*System.out.println("Given Number: ", num);*/
		
		if(num%2==0)
			System.out.println(+num +" is Even");
		else
			System.out.println (+num +" is Odd");
	}
}