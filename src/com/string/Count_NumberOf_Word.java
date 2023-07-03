package com.string;

public class Count_NumberOf_Word {

	public static void main(String[] args)
	{
	String s1="India is mu country L love my country";
	int count=0;
	String []ch=s1.split(" ");
	
	for(int i=0; i<ch.length; i++) {
		count++;
	}
	 	System.out.println(count);
	}

}
