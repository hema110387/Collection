package com.exception;

public class Exception_Handle {

	public static void main(String[] args) {
		
		try {
			String s=null;
			System.out.println(s.length());
			System.out.println("java code");
		}
		
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		 catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("FINALLY BLOCK");
		}
	
		
	}
}
