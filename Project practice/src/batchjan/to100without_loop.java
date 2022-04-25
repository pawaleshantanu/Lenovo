package batchjan;

import java.util.Hashtable;

public class to100without_loop {

	public static void main(String[] args) {
		
	String str="sachin123";
	String d="";
	StringBuffer sb=new StringBuffer();
	int arr[]= {0,1,2,3,4,5,6,7,8,9};


for(int i=0;i<=str.length()-1;i++)
{if(!Character.isDigit(str.charAt(i))) {
	sb.append(str.charAt(i));
	}		
	}
	System.out.println(sb);
		}
}


		
	
		

	


