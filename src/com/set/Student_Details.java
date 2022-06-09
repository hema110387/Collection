package com.set;

	import java.util.LinkedHashSet;
	import java.util.Scanner;
	import java.util.Set;
	
	public class Student_Details {
	public static void main(String[] args) {                     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student id :");
		int sid = sc.nextInt();
		
		
		System.out.println("Enter the Student name :");           //stdId,stdName,stdPhone,address,dOB,eMail,gender
		String sn = sc.next();
		
		System.out.println("Enter the Student phone no :");
		String spno = sc.next();
		
		System.out.println("Enter the Student address :");
		String  sad = sc.next();
		
		
		System.out.println("Enter Student DOB :");
		String sdob = sc.next();
		
		
		
		System.out.println("Enter the Student Email-id :");
		String seid = sc.next();
		
		System.out.println("Enter the Student gender :");
		String sgen = sc.next();
		
		
		Set <Object>s1=new LinkedHashSet<>();
		
		s1.add(sid);
		s1.add(sn);
		s1.add(spno);
		s1.add(sad);		//add
		s1.add(sdob);
		s1.add(seid);
		s1.add(sgen);
		
		
		System.out.println(" Student details are = "+s1);
		System.out.println();
		
	}
	}


