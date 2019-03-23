import java.util.Scanner;
public class MergeTwoArray1 
{
	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	
	System.out.println("enter the first array size");
	int n1 = scan.nextInt();
	int[] ar1 = new int[n1];
	System.out.println("Enter the second size");
	int n2 =scan.nextInt();
	int[] ar2 = new int[n2];
	
	int[] ar3 = new int[n1 + n2];
	int j = 0;
	
	for(int i = 0; i < ar1.length; i++)
	{
		ar3[j] = ar1[i];
		j++;
	}
	
   for(int i = 0; i < ar2.length; i++)
   {
	   ar3[j] = ar2[i];
	   j++;
   }
  
   System.out.println(ar3[j]);
}
	
}
