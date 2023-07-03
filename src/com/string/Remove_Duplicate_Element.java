package com.string;

public class Remove_Duplicate_Element {

	public static void main(String[] args) {
		
		String s1="India is my country";
		int count;
		char ch[]=s1.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			
				count=1;
				
			for(int j=i+1; j<ch.length; j++) {
				
				if(ch[i]==ch[j] && ch[i]!=' ') {
					count++;
					ch[j]='0';
				}
		}
			if(count>1 && ch[i]!='0') {
				System.out.println(ch[i]);
			}

	}

	}

}
