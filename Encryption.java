import java.util.Scanner;
public class Encryption 
{
  public static void main(String[] args) 
  {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the text");
	String s = scan.nextLine();
	System.out.println("Enter the key");
	int k = scan.nextInt();
	scan.close();
	String temp = "";
	for(int i = 0; i < s.length(); i++)
	{
		if(s.charAt(i) >= 65 && s.charAt(i) <= (90 - k))
		{
			temp += (char)(s.charAt(i) + k);
		}
		else
		{
			temp += (char)(65 + k - (90-s.charAt(i))-1);
		}
	}
	System.out.println(temp);
  }
}
