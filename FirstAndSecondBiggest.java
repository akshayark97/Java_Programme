import java.util.Scanner;
public class FirstAndSecondBiggest 
{
   public static void main(String[] args) 
   {
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Enter the size of an array");
	 int n = scan.nextInt();
	 int[] ar = new int[n];
	 System.out.println("Enter the element");
	 for(int i = 0; i < ar.length; i++)
	 {
		 ar[i] = scan.nextInt();
	 }
	 int fbig = 0;
	 int sbig = 0;
	 scan.close();
	 for(int i = 0; i < ar.length; i++)
	 {
		 if(ar[i] > fbig)
		 {
			 sbig = fbig;
		     fbig = ar[i];
		 }
		 else if(ar[i] > sbig)
		 {
			 sbig = ar[i];
		 }
	 }
	 System.out.println("First biggest is " +fbig);
	 System.out.println("Second biggest is " +sbig);
   }
}
