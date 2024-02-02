 class Leap_year {
			public static void main(String args[]) {
				Scanner s=new Scanner(System.in);
				int y;
				System.out.print("Enter the year= ");;
				y=s.nextInt();
				if(y%4==0) {
					System.out.print("Leap year");
				}
				else
				{
					System.out.print("Non leap year");
				}
		}
}
