 import java.util.*;

class Perfect_number {
	public static void main (String args[]) {
		int i,n,count=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number= ");
		n=s.nextInt();
		for(i=1;i<n;i++) {
			if(n%i==0) {
				count=count+i;
			}
		}
		if(n==count) {
			System.out.print("Perfect number");
		}
		else
		{
			System.out.print("Not a perfect number");
		}
	}
}
