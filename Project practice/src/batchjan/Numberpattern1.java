package batchjan;

public class Numberpattern1 {

	public static void t1(int n) {
		 int i, j,num; 
		    
	        for(i=0; i<n; i++) // outer loop for rows
	        { 
	            num=1; 
	            for(j=0; j<=i; j++) // inner loop for rows
	            { 
	                // printing num with a space  
	                System.out.print(num+ " "); 
	    
	                //incrementing value of num 
	                num++; 
	            } 
	    
	            // ending line after each row 
	            System.out.println(); 
	        } int num1;
	        for(int k=5;k>=0;k--)
	        {num1=5;
	        for(int l=5;l<=k;l--)
	        {
	       
	        
	        System.out.print(num1+"");
	        num1--;
	        }}
	    } 
		public static void main(String[]args) {
			int n=5;
		t1(5);
					
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}


