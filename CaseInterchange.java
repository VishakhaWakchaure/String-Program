package com.jsp.string;

public class CaseInterchange {
	public static String caseInterchanged(String str) {
		///step1: convert string to char array
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&& ch[i]<='Z') {
				ch[i]=(char) (ch[i]+32);
			}else 
				if(ch[i]>='a'&& ch[i]<='z'){
					ch[i]=(char) (ch[i]-32);	
			}
		}
		String newSentence =new String(ch);
		return newSentence;
		
	}
public static void main(String[] args) {
	String s="Hii GOOd Morning All";
	System.out.println (caseInterchanged(s));
}
}
