import java.util.*;
class Grade {

	public static void main(String[] args) {
		int a,b,c,d,avg=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st marks= ");
		a=s.nextInt();
		System.out.println("Enter the 2nd marks= ");
		b=s.nextInt();
		System.out.println("Enter the 3rd marks= ");
		c=s.nextInt();
		System.out.println("Enter the 4th marks= ");
		d=s.nextInt();
		avg=(a+b+c+d)/4;
		System.out.println("Aggregate is "+avg);
		if(avg>=75) {
			System.out.println("Grade is distinction pass");
		}
		else if(avg>=60 && avg<75) {
			System.out.println("Student passed in first division");
		}
		else if(avg>=50 && avg<60) {
			System.out.println("Student passed in second division");
		}
		else if(avg>40 && avg<50) {
			System.out.println("Student passed in third division");
		}
		else {
		System.out.println("Failed in exam");
		}
	}

}