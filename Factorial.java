import java.util.Scanner;
public class Factorial 
{
    public static void main(String[] args)
    {
    	int n, fact = 1;
    	System.out.println("Enter the value of n");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		
		for(int i = 1; i <= n; i++)
		{
			fact = fact * i;
		}
		System.out.println("The factorial of "+ n +" is " + fact);
	}
}
