package com.exception;

public class Exception_Simple {
public static void main(String[] args) {
		
		try {
			String s=null;
			System.out.println(s.length());
			
		}
		catch(NullPointerException e)
	       {
			e.printStackTrace();
	       }
		 finally
	       {
	          System.out.printf("5");
	       }
		System.out.println("java code");
}
}