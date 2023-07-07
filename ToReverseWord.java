package com.jsp.string;
//write a java to reverse/interchange each word for a string
public class ToReverseWord {
public static void toReverseWordString(String str) {
	String s[]=str.split(" ");
	for(int i=s.length-1;i>=0;i--) {
		System.out.print(s[i]+" ");
		
	}
}
	public static void main(String[] args) {
		String s="Java Programming setion";
		toReverseWordString(s);
	}

}
