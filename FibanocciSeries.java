//Fibanocci series
import java.util.Scanner;
class FibanocciSeries
{
	public static void main(String[] args) 
	{
		int first_no = 0, second_no = 1, result;
		int count = 0;
		int user_no;
		System.out.println("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		user_no =scan.nextInt();
		
		for(int i = 0; i < user_no; i++)
		{
			result = first_no + second_no;
			count++;
			if(result > user_no)
			{
				break;
			}
			first_no = second_no;
			second_no = result;
			System.out.println(result);
		}
	}
}