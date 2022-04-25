package batchjan;

import java.util.Hashtable;

public class Hashset {

	public static void main(String[] args) {
		
String ar[]= {"Shantanu","Shantanu","Om","Om","Sagar"};
for(int i=0;i<=ar.length-1;i++) {
	for(int j=i+1;j<=ar.length-1;j++) {
		if(ar[i]==ar[j]) {
			System.out.print(ar[i]+",");
		}
	}	
}

	
	}

}
