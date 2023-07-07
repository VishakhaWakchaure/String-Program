package com.jsp.string;
//write a java program to sum number from string
public class PullOutNumber {
	public static String sumFromString(String str) {
		int sum=0; 
		String num="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				num=num+str.charAt(i);
			}
		}
		int number=Integer.parseInt(num);
		while(number>0) {
			sum=sum+number%10;
			number/=10;
		}
		return num;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="jhewrhrd12344errrS";
System.out.println(sumFromString(s));
	}

}

