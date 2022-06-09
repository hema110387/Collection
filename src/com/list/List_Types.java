-`																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										-package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class List_Types {

	public static void main(String[] args) {
		List<Object> li  =new ArrayList <> ();
		       //add 
		li.add(10);
		li.add('e');
		li.add(10.98);
		li.add("Saru");
		li.add(100);
		li.add(25);
		System.out.println("=====Elements of li are========:");
		System.out.println(li);
		System.out.println();
		
		//size
		int size = li.size();
		System.out.println(" => size is = "+size);
		
		//get
		Object object = li.get(5);
		System.out.println(" => value at 5 th index  = "+object);
	
		//set
		li.set(2, 99.789);
		System.out.println(" => updated value of index 2 is ="+li);
		
		//indexof
		int i = li.indexOf(100);
		System.out.println(" => index value of 100 is = "+i);
		
		//contains
		boolean con = li.contains(255);
		System.out.println(" => is list contains 255 =  "+con);
		
		List<Object> li1  =new ArrayList <> ();
		li1.add(100);
		li1.add(28);
		li1.add(100.89);
		li1.add(25);
		li1.add(267);
		li1.add("Saru");
		System.out.println();
		System.out.println("==========Elements of li1 are :============");
		System.out.println(li1);
		
		
		//addAll
//		li.addAll(li1);
//		System.out.println("li1 and li2 Elements are  = "+li);
//		
		//retainAll
//		System.out.println();
//		li.retainAll(li1);
//		System.out.println("retaining Values are = "+ li);
		
		//removeAll
		System.out.println();
		li.removeAll(li1);
		System.out.println("After removing common values ,remaining values are = "+li);
	
		}
}
 