import java.util.*;

 class Remove_vowels 
{
	public static void main(String args[]) {
		Scanner r=new Scanner(System.in) ;
		int i,len=0;
		String s1;
		char c;
		System.out.print("Enter the string= ");
		s1=r.nextLine();
		len=s1.length();
		for(i=0;i<len;i++) 
		{
			c=s1.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				continue;
			}
	else
	{
		System.out.print(c);	
	}