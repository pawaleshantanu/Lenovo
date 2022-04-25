package batchjan;

public class String_study {

	public static void main(String[] args) {
		String s="ShanTanu";
		String st=new String("Shantanu");
		String t=new String("Shantanu");
		char CharectorAT3=s.charAt(3);
		System.out.println(s.equals(st));
		System.out.println(s.equalsIgnoreCase(st));
		System.out.println(s==st);
		System.out.println(st==t);
		System.out.println(st.equals(t));
		System.out.println(s.concat(st));
		String q=s.concat(st);
		for(int i=0;i<s.length();i++) {
			//System.out.println(s.charAt(i));
			System.out.println(s.charAt(i));}
		System.out.println(q.contains("tanu"));
		System.out.println(s.substring(4));
		System.out.println(s.replaceAll("Sh","nu" ));
		String[]arr=s.split("\\s");
		System.out.println(arr);
			
		}
	}


