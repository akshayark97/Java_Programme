//Progrmme to find prime number
import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int n;
		int count = 0;
		n = scan.nextInt();
		for(int i = 1; i <= n; i++)
		{
		   if(n%i == 0) 	
		   {
			  count++; 
		   }
		}
		if(count == 2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
}