package batchjan;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class listtolinkedhashset {

	public static void main(String[] args) {
		ArrayList<String>s=new ArrayList<>();
		s.add("Geek");
		s.add("for");
		s.add("Geek");
		LinkedHashSet<String>l=new LinkedHashSet<>(s);
		for(String q:l) {
			System.out.print(q);
		}
		for(String t:s) {
			System.out.println(t);
		}
	}

}
