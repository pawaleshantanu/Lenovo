package batchjan;

public class largest_valueinarray {

	public static void main(String[] args) {
		int ar[]= {1,12,232,356546,76,9283928,1234599090};
		int largest=ar[0];
		for(int i=0;i<=ar.length-1;i++) {
			if(ar[i]>largest) {
				largest=ar[i];
			}
		}System.out.println(largest);
	}

}
