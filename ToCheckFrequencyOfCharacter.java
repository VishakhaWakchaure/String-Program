package com.jsp.string;
//write java program to check frequency of character in given string
public class ToCheckFrequencyOfCharacter {
public static void toCheckFrequency(String str ) {
	int count[]=new int[128];
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='A' && ch<='Z') {
			count[ch-65]++;
		}else
			if(ch>='a' && ch<='z') {
				count[ch-97]++;
			}
	}
	//to print
	for(int i=0;i<count.length;i++) {
		if(count[i]!=0) {
			//we can take lower letter value or capital letter value (65+i) or (97+i) as user choice
			System.out.println((char)(65+i)+ " repates------> "+count[i]+ " times ");
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Java Programming";
toCheckFrequency(s);
	}

}
