package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Set_types {
public static void main(String[] args) {
		//HashSet  //set1
	Set <Object>s2=new HashSet<>();
		
	s2.add(10);
	s2.add(20);
	s2.add(30);				//add
	s2.add(40);
	s2.add(50);
	s2.add(60);
	s2.add(70);
	s2.add(80);
	s2.add(90);
	s2.add(10);
	s2.add(20);
	System.out.println("(HashSet) set1 values are= "+s2);
	System.out.println();
					//set2
	Set <Object>s=new HashSet<>();
	
	s.add(10);
	s.add(20);
	s.add(30);				//add
	s.add(90);
	s.add(10);
	s.add(10);
	s.add(40);
	s.add(50);

	System.out.println("(HashSet) set2 values are= "+s);
	System.out.println();
	
//	s.addAll(s2);
//	System.out.println("after added values are"+s);
//    System.out.println();
	
	
		//LinkedHashSet
	Set <Object>s3=new LinkedHashSet<>();
	
	s3.add(10);
	s3.add(20);
	s3.add(30);				//add 10,20,30,40,50,60,70,80,90,10,20
	s3.add(40);
	s3.add(50);
	s3.add(60);
	s3.add(70);
	s3.add(80);
	s3.add(90);
	s3.add(10);
	s3.add(20);
	System.out.println("(LinkedHashSet) set1  values are= "+s3);
	System.out.println();
	
		//linked hashset  -- set2
Set <Object>ss3=new LinkedHashSet<>();
	
	ss3.add(105);
	ss3.add(205);
	ss3.add(305);				//add 10,20,30,40,50,60,70,80,90,10,20
	ss3.add(405);
	ss3.add(505);
	ss3.add(605);
	ss3.add(705);
	ss3.add(805);
	ss3.add(505);
	ss3.add(605);
	System.out.println("(LinkedHashSet) set2  values are= "+ss3);
	System.out.println();
	
	
//	s3.addAll(ss3);
//	System.out.println("after added set2 s3 values are = "+s3);
//	System.out.println();
		
	
	//Treeset
Set <Integer>s4=new TreeSet<>();
	
s4.add(10);
s4.add(20);
s4.add(30);				//add
s4.add(40);
s4.add(50);
s4.add(60);
s4.add(70);
s4.add(80);
s4.add(90);
s4.add(10);
s4.add(20);
	System.out.println("(Tree Set) s4 values are= "+s4);
	System.out.println();
	
	
	//tree set(set2)
	Set <Integer>ss4=new TreeSet<>();
	
	ss4.add(100);
	ss4.add(200);
	ss4.add(300);				//add
	ss4.add(400);
	ss4.add(500);
	ss4.add(600);
	ss4.add(700);
	ss4.add(800);
	ss4.add(900);
	ss4.add(100);
	ss4.add(200);
		System.out.println("(Tree Set) s4 values are= "+ss4);
		System.out.println();
		
		s4.addAll(ss4);
		System.out.println("after added s4 vales are = "+s4);
	
//	//get method
//	Class<? extends Set> class1 = s1.getClass();
//	System.out.println(class1);
//	Class<? extends Set> class2 = s2.getClass();
//	System.out.println(class2);
//	Class<? extends Set> class3 = s3.getClass();
//	System.out.println(class3);
}

//get


}