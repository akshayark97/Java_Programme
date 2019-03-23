import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		String t = "";
		t+=n;
		String t1 = "";
		for(int i = t.length()-1; i >= 0; i--)
		{
			t1 += t.charAt(i);
		}
		if(t1.equals(t))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
}