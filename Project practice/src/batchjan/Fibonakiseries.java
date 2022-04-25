package batchjan;

public class Fibonakiseries {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		int next=0;
		int count=10;
		for(int i=0;i<=count-1;i++) {
			System.out.println(first);
			next=first+second;
		first=second;
		second=next;
			
			
		}
		
	}

}
