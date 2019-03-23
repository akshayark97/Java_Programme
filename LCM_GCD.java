import java.util.Scanner;
class LCM_GCD
{
	public static void main(String[] args) 
	{
		int a, b, x, y, t, hcf, lcm;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two number: ");
		x = scan.nextInt();
		y = scan.nextInt();
		a = x;
		b = y;
		while(b != 0)
		{
			t = b;
			b = a % b;
			a = t;
			
		}
		hcf = a;
		lcm = (x * y) / hcf;
		System.out.println("hcf =" + hcf);
		System.out.println("lcm =" + lcm);
	}
}