package com.jsp.string;
//write java program to count the word 
public class CountWord {
public static int countWord(String str) {
	int count=1;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ' && str.charAt(i+1)!=' ' ) {
			count++;
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hii good morning";
System.out.println(countWord(s));
	}

}
