package batchjan;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no :");
	int no=s.nextInt();
	int rev=0;
	int org_no=no;
	while(no!=0) {
		rev=rev*10+no%10;//0+121/10
		no=no/10;
		
	}if (rev==org_no) {
		System.out.println("No. is palindrome no.");
	}else {
		System.out.println("No. is not palindrome");
	}System.out.println("Reverse no is "+rev);
	
			
			}
	
	


	}


