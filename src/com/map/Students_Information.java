package com.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Students_Information {
		public static void main(String[] args) {                     
			Scanner sc=new Scanner(System.in);
			for (int i = 0; i < 2; i++) {
				
			
			System.out.println("Enter the Student id :");
			int n1= sc.nextInt();
			String s1=sc.next();
			
			
			System.out.println("Enter the Student name :");           //stdId,stdName,stdPhone,address,dOB,eMail,gender
			int n2= sc.nextInt();
			String s2=sc.next();
			
			System.out.println("Enter the Student phone no :");
			int n3= sc.nextInt();
			String s3=sc.next();
			
			System.out.println("Enter the Student address :");
			int n4= sc.nextInt();
			String s4=sc.next();
			
			System.out.println("Enter Student DOB :");
			int n5= sc.nextInt();
			String s5=sc.next();
			
			
			
			System.out.println("Enter the Student Email-id :");
			int n6= sc.nextInt();
			String s6=sc.next();
			
			System.out.println("Enter the Student gender :");
			int n7= sc.nextInt();
			String s7=sc.next();
			
			
			Map<Integer,String> m1 =new LinkedHashMap();
			
			m1.put(n1,s1);
			m1.put(n2,s2);
			m1.put(n3,s3);		//add
			m1.put(n4,s4);
			m1.put(n5,s5);
			m1.put(n6,s6);
			m1.put(n7,s7);
			
			
			System.out.println(" Student details are = "+m1);
			System.out.println();
			
		}
		}



}

