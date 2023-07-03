package com.string;

public class Print_Single_Word {

	public static void main(String[] args) {
		
		String s1="India is my country";
		String[] s2=s1.split(" ");
		for(int i=0; i<s2.length; i++) {
			System.out.println(s2[i]);
		}

	}

}
