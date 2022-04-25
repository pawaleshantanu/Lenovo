package batchjan;

public class logical {

	public static void main(String[] args) {
		
		//String swapping
		String s="Sheetal Seenar";
		System.out.println(s.replace("ee", "i"));
		
		
		//No. swapping without using third variable
		int x=12;
		int y=13;
	x=x+y;//x=12+13=25
	y=x-y;//y=25-13=12
	x=x-y;//x=25-12=13
	
		System.out.println(x+","+y);
		
		
	}

}
