package com.string;

public class Fabnosis_Series {

	public static void main(String[] args) {
		int a=0,  b=1, c ;
		
		while(a+b<100) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
