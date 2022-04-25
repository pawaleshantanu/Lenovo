package batchjan;

public class Maven {

	public static void main(String[] args) {
		String s="aaabbbccc";
		
		for(char i='a';i<='z';i++) {
			int c=0;
			for(int j=0;j<=s.length()-1;j++) {
			if(i==s.charAt(j)) {
				c++;
			}	
			
				
			}if(c!=0)
				System.out.print(i+""+c);
		}

	}

}
