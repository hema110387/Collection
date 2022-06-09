package com.map;


import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;;

public class Employee_Information {
public static void main(String[] args) {                     
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<2;i++) {
		
	System.out.println("Enter the Employee id :");
	int n = sc.nextInt();
	String nn1 = sc.next();
	
	
	System.out.println("Enter the Employee name :");
	int n1 = sc.nextInt();
	String s1 = sc.next();
	
	
	System.out.println("Enter the Employee phone no :");
	int n2 = sc.nextInt();
	String s2 = sc.next();
	
	
	System.out.println("Enter the Employee address :");
	int n3 = sc.nextInt();
	String s3 = sc.next();
	
	
	
	System.out.println("Enter the Employee DOB :");
	int n4 = sc.nextInt();
	String s4 = sc.next();
	
	
	System.out.println("Enter the Employee date of Joining :");
	int n5 = sc.nextInt();
	String s5 = sc.next();
	
	
	System.out.println("Enter the Employee Email-id :");
	int n6 = sc.nextInt();
	String s6 = sc.next();
	
	
	System.out.println("Enter the Employee gender :");
	int n7 = sc.nextInt();
	String s7 = sc.next();
	
	System.out.println("Enter the Employee Salary :");
	int n8 = sc.nextInt();
	String nn8 = sc.next();
	
	
		Map<Integer,String> m1=new LinkedHashMap<>();
	
	m1.put(n,nn1);
	m1.put(n1,s1);
	m1.put(n2,s2);
	m1.put(n3,s3);		//add
	m1.put(n4,s4);
	m1.put(n5,s5);
	m1.put(n6,s6);
	m1.put(n7,s7);
	m1.put(n8,nn8);
	
//	for(Entry<Integer, String> set : m1.entrySet()) {
//		System.out.println(set.getKey());
//		System.out.println(set.getValue());
//	}
	System.out.println(" Employee details are = "+m1);
	System.out.println();
	}
}

}


