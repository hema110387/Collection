package com.list;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Retain_All {
		public static void main(String[] args) {
			List<Object> li  =new ArrayList <> ();
			       //add 
			li.add(10);
			li.add(20);
			li.add(30);
			li.add(90);
			li.add(10);
			li.add(10);
			li.add(40);
			li.add(50);
			System.out.println("=====Elements of li are========:");
			System.out.println(li);
			System.out.println();
			
			List<Object> li1  =new ArrayList <> ();
			li1.add(10);
			li1.add(20);
			li1.add(60);
			li1.add(50);
			li1.add(40);
			li1.add(70);
			li1.add(80);
			li1.add(90);
			System.out.println();
			System.out.println("==========Elements of li1 are :============");
			System.out.println(li1);
			System.out.println();
			
			
//			li.addAll(li1);
//			System.out.println(li);
//			System.out.println();
//			
			
//			li.retainAll(li1);
//			
//			System.out.println("retaining values ="+li);
			
			li.removeAll(li1);
			System.out.println("after removed li values are "+li);
			System.out.println();
			
}  
}
