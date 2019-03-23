class Pattern4
{
public static void main(String[] args) 
{
int i,j,k=1;
for(i=1;i<=4;i++)
{
for(j=1;j<=2*i-1;j++)
{
if(j%2==0)
{
System.out.print("*");
}
else
{
System.out.print(k);
k++;
}
}
System.out.println();
}
}
}