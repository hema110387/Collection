package com.set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Employee_Details {
public static void main(String[] args) {                     
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<10;i++) {
		
	System.out.println("Enter the Employee id :");
	int id = sc.nextInt();
	//System.out.println("Employee id ="+ id);
	
	System.out.println("Enter the Employee name :");
	String n = sc.next();
	//System.out.println("Employee name ="+ n);
	
	System.out.println("Enter the Employee phone no :");
	String pno = sc.next();
	//System.out.println("Employee Phone no  ="+ pno);
	
	System.out.println("Enter the Employee address :");
	String  ad = sc.next();
	//System.out.println("Employee address ="+ ad);
	
	
	System.out.println("Enter the Employee DOB :");
	String dob = sc.next();
	//System.out.println("Employee DOB ="+ dob);
	
	System.out.println("Enter the Employee date of Joining :");
	String doj = sc.next();
	//System.out.println("Employee DOJ ="+ doj);
	
	System.out.println("Enter the Employee Email-id :");
	String eid = sc.next();
	//System.out.println("Employee Email-id ="+ eid);
	
	System.out.println("Enter the Employee gender :");
	String gen = sc.next();
	//System.out.println("Employee id ="+ gen);
	
	System.out.println("Enter the Employee Salary :");
	int sal = sc.nextInt();
	//System.out.println("Employee Salary  ="+ sal);
	
	
	
	Set <Object>s1=new LinkedHashSet<>();
	
	s1.add(id);
	s1.add(n);
	s1.add(pno);
	s1.add(ad);		//add
	s1.add(dob);
	s1.add(doj);
	s1.add(eid);
	s1.add(gen);
	s1.add(sal);
		
	System.out.println(" Employee details are = "+s1);
	System.out.println();
	}
}
}
