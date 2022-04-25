package batchjan;

import java.util.LinkedHashSet;
import java.util.Set;

public class logical1 {

	

	public static void main(String[] args) {

	String	S= "my Name Is Dipali";
	//Dipali is my name
	System.out.print(S.substring(11,17));
System.out.print(S.substring(7,11));
System.out.print(S.substring(0, 3));
System.out.print(S.substring(3,7));
char d=S.charAt(0);

int rcount = 0;
for(int i=0;i<=S.length()-1;i++) {
	if(S.charAt(0)==S.charAt(i)) {
		
	rcount++;
		
	}
	
}System.out.println("    "
		+ "repeated charector is"+rcount);
	
	
	}
}

