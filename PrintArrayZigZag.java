import java.util.Scanner;
public class PrintArrayZigZag 
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the first array size");
	int n1 = scan.nextInt();
	int[] ar1 = new int[n1];
	System.out.println("Enter the second size");
	int n2 =scan.nextInt();
	int[] ar2 = new int[n2];
	
	int[] ar3 = new int[10];
	
	int t = 0;
	if(n1 > n2)
	{
		t = n1;
	}
	else
	{
		t = n2;
	}
	int j = 0;
	for(int i = 0; i < t; i++)
	{
		if(i < n1)
		{
			ar3[j] = ar1[i];
			j++;
		}
		if(i < n2)
		{
			ar3[j] = ar2[i];
			j++;
		}
	}
	}
}
