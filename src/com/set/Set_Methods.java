package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Methods {
	public static void main(String[] args) {
		
		Set <Object>s1=new HashSet<>();
	
	s1.add(10);
	s1.add(20);
	s1.add(null);
	s1.add(80);				//add
	s1.add("saru");
	System.out.println("s1 values are= "+s1);
	System.out.println();
	
	//size()
	int i = s1.size();
	System.out.println("size of set s1 is = "+i);
	System.out.println();
	
	//get 
	Class<? extends Set> c1= s1.getClass();
	System.out.println(c1);
	System.out.println();
	
	//contains
	boolean con = s1.contains(null);
	System.out.println("s1 contains  given value = "+con);
	System.out.println();
	
Set <Object>s2=new LinkedHashSet<>();
	
	s2.add(220);
	s2.add(250);
	s2.add(null);
	s2.add(110);			
	s2.add('s');
	s2.add(10);
	System.out.println("s2 values are= "+s2);
	System.out.println();
				//addAll
	
//	boolean add = s1.addAll(s2);
//	System.out.println("s1 is added to s2 = " +add);
//	System.out.println();
//	System.out.println("After s1 is added with s2 , s1 values are = "+s1);
//	System.out.println();
	
	//retainAll
//	boolean retain = s1.retainAll(s2);
//	System.out.println(retain);
//	System.out.println("after retaining s1 values "+s1);
//	System.out.println();
	
	//removeAll
//	boolean remove= s1.removeAll(s2);
//	System.out.println("Common values of s1 and s2 is removed= "+remove);
//	System.out.println();
//	System.out.println("after removed s1 values are = "+s1);
	
	
	         //remove 
	boolean r = s1.remove(80);
	System.out.println("value 80 is removed = "+r);
	System.out.println();
	System.out.println("after removed s1 values = "+s1);
	System.out.println();
}}