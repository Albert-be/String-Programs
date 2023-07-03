package com.string;

public class Remove_Duplicate_Character {

	public static void main(String[] args) {
		
		String s1="gotogym";
		int count=1;
		char ch[]=s1.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				
				if(ch[i]==ch[j] && ch[i]!=' ') {
					count++;
					ch[j]='0';
				}
		}
			if(count>1 && ch[i]!='0') {
				System.out.print(ch[i]+" ");
			}

	}
	}
}
