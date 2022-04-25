package batchjan;

public class no_of_zerosfromString {

	public static void main(String[] args) {
int count0 = 0;
int count1 = 0;
String s="10101010010101010100000101010100101010";
for(int i=0;i<=s.length()-1;i++) {
	if(s.charAt(i)=='0') {
		count0++;
		
		
	}
	
	}
for(int j=0;j<=s.length()-1;j++) {
	if(s.charAt(j)=='1') {
		count1++;	
		}}
System.out.println("No. of 0 from string are "+count0);
System.out.println("No. of 1 from string are "+count1);	}

}
