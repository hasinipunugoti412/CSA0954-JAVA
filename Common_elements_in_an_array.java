import.java.util.*;
class Common_elements_in_an_array{

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements in 1st array=");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter elements in 2nd array=");
		for(int i=0;i<=b.length-1;i++) {
			b[i]=sc.nextInt();
		}
		int len=b.length;
		for(int i=0;i<len;i++)
		{
		 for(int j=i+1;j<len;j++)
		 {
		 if(b[i]==b[j])
		 {
		 for(int k=j;k<len-1;k++)
		 {
		 b[k]=b[k+1];
		 }
		 j--;
		 len--;
		 }
		 }
		}
		System.out.print("common elements in both the arrays are=");
		for(int i=0;i<a.length;i++)
		{
		 for(int j=0;j<len;j++)
		 {
		 if(a[i]==b[j]) {
		 System.out.print(" "+a[i]);
		 }
		 }
		}
	}
}