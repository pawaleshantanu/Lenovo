package batchjan;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
int j;


for(j=1;j<=100;j++) {int count=0;
	for(i=1;i<=j;i++) {

if (j%i==0) {
	count=count+1;
}	
	}		
		
if (count==2) {
	
	System.out.println( "is a prime no." +j);
}}	
	

	
	
	
	

	
}
	
	
	
	
	}


