package com.string;

public class Swap_String 
{
	public static void main(String[] args) {
		
	String s1="Moon";
	String s2="earth";
	
	System.out.println("before swap :"+ s1 +" "+ s2);
	
	s1=s1+s2;
	s2=s1.substring(0, s1.length()-s2.length());
	s1=s1.substring(s2.length());
	
	System.out.println("After swap :"+ s1 +" "+ s2);
	
	}
}
