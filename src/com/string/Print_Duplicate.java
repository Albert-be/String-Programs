package com.string;

import java.util.HashSet;

public class Print_Duplicate {

	public static void main(String[] args) {
		
		 String str = "aaaghbbh";
		 char [] a=str.toCharArray();
		 for(int i=0; i<a.length; i++) {
			 for(int j=i+1; j<a.length; j++) {
				 if(a[i]==a[j]) {
					 System.out.print(a[i]+ " ");
					 break;
				 }
			 }
		 }
		
	}

}
