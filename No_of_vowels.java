import java.util.*;
 class No_of_vowels {
	public static void main(String args[]) {
		int vowels=0,i,len;
		char c;
		String s1;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the string= ");
		s1=s.nextLine();
		len=s1.length();
		for(i=0;i<len;i++) {
			c=s1.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				vowels++;
				}
			}
		System.out.print("The no.of vowels= "+vowels);		
	}
}
