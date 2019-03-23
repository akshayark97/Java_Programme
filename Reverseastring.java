import java.util.Scanner;
public class Reverseastring 
{
   public static void main(String[] args)
   {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the string: ");
	  String s = scan.nextLine();
	  int count = 0;
	  
	  for(int i = 0; i < s.length()-1; i++)
	  {
		 if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ') 
		 {
			 count++;
		 }
	  }
	  String[] ar = new String[count+1];
	  int j = 0;
	  String temp = "";
	  for(int i = 0; i < s.length(); i++)
	  {
		  if(s.charAt(i) != ' ')
		  {
			  temp += s.charAt(i);
		  }
		  else if(s.charAt(i) == ' ')
		  {
			ar[j] = temp;
			j++;
			temp = "";
		  }
	  }
	  ar[j] = temp;
	  temp = "";
 
	  for(int i = 0; i < ar.length; i++)
	  {
		  temp += nonsense(ar[i]) + " ";
	  }
	  System.out.println(temp);
   }
	  static String nonsense(String s)
	  {
		  int sum = 0;
		  String temp = "";
		  for(int i = 0; i < s.length(); i++)
		  {
			 if(s.charAt(i) >= 48 && s.charAt(i) <= 57) 
			 {
				sum += s.charAt(i) - 48; 
			 }
			 else
			 {
				 temp += s.charAt(i);
			 }
		  }
		  temp += sum;
		  return temp;
	  }
   }
   

