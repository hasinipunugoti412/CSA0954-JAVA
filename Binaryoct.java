import java.util.*;
public class Binaryoct {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int dec=15; 
		String bin=Integer.toBinaryString(dec); 
		String oct=Integer.toOctalString(dec); 
		System.out.println("Binary number = "+bin); 
		System.out.print("octal number = "+oct); 
	}
}
