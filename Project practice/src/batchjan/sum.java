package batchjan;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		String s=new Scanner(System.in).next();
		String r="";
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
			
		}if(s.equalsIgnoreCase(r)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not ");
		}
		
}
}