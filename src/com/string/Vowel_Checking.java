package com.string;

public class Vowel_Checking {

	public static void main(String[] args) {
		
		String s1="India is my country";
		
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' ||
					s1.charAt(i)=='u' ) {
				System.out.println(s1.charAt(i));
				
			}
		}

	}

}
