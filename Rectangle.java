import java.util.*;
 class Rectangle {

	public static void main(String[] args) {
		int i,j,r,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.of rows= ");
		r=s.nextInt();
		System.out.println("Enter the no.of columns= ");
		c=s.nextInt();
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
