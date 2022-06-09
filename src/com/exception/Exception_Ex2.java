package com.exception;

public class Exception_Ex2 {
		public static void Validate(int marks) throws Exception,Throwable {
			if(marks>=40) {
				System.out.println("PASS ");
			}
			else {
				throw new Exception("FAIL");
			}
		}
		public static void main(String[] args) throws Throwable {
			Validate(30);
			
		}
	
}
