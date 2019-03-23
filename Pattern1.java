import java.util.Scanner;
public class Pattern1
{
	public static void main(String[] args) 
	{
		
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	{
	    int m = 1;
	   
	    for(int i=1; i<=n-1; i++)
	    {
	    	
	        if(i!=2)
	        {
	        	for(int j=0; j<n; j++)
	        	{
	        		System.out.print(m);
	        		m++;
	        	}
	        	System.out.println();
	        }
	        else
	        {
	        	m = m+n;
	        	for(int j=0; j<n; j++)
	        	{
	        		System.out.print(m);
	        		m++;
	        	}
	        	System.out.println();
	        }
	    }
	    for(int i=n+1 ;i<=(n+n);i++)
	    {
	    	System.out.print(i);
	    }
	    System.out.println();
	}
}
}