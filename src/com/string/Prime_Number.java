package com.string;

public class Prime_Number {

	public static void main(String[] args) {
		int num=24; 
		int count = 0;
		
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				count++;
			}
		}
			if(count==0) {
				System.out.println("Prime number represent");
			}
			else {
				System.out.println("Not Prime number represent");
			}
		}
	}


