package batchjan;

import java.util.HashMap;
import java.util.Map;

public class multiple_occurance_of_chr {

	public static void main(String[] args) {
		String s="aaaabbabbbbbcccdddd";
		//Creating a HashMap containing char as a key
		//and occurance as a value
HashMap<Character, Integer>charCountMap=new HashMap<Character,Integer>();
//Converting given string to array
char[]ar=s.toCharArray();
//Checking for each charector of array
for(char c:ar) {
	if(charCountMap.containsKey(c)) {
//if char is present in map increment count by 1 
		charCountMap.put(c, charCountMap.get(c)+1);
	}else {//If charector is not present in map putting  this char to map
		//with 1 its value
charCountMap.put(c, 1);		
	}
	//Printing count map
}for(Map.Entry entry :charCountMap.entrySet()) {
	System.out.print(entry.getKey()+""+entry.getValue());
}

	}

}
