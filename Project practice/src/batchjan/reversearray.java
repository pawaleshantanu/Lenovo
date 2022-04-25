package batchjan;

public class reversearray {

	public static void main(String[] args) {
		String str="In an interview";
		StringBuilder str1=new StringBuilder();
		str1.append(str);
		System.out.println(str1);
		str1.reverse();
	System.out.println(str1);

System.out.print(str1.subSequence(13, 15));
System.out.print(str1.subSequence(9, 13));
System.out.print(str1.substring(0, 10));

	}

}
