import java.util.*;
class Right_angle
{
	public static void main(String args[])
	{
		int i,j,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.of rows= ");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println("*");
			}
			System.out.print(" ");
		}
	}
}