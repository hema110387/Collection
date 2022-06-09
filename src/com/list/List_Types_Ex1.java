package com.list;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;
public class List_Types_Ex1 {
public static void main(String[] args) {
	//Array List
	List <Integer> al =new ArrayList <>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(90);
	al.add(10);
	al.add(10);
	al.add(40);
	al.add(50);
	System.out.println(" ArrayList of al= "+al);
	int size = al.size();
	System.out.println("Length  of al is = "+size);
	System.out.println();
	
	// Linked List
	List<Integer>ll=new LinkedList <> ();
	ll.add(100);
	ll.add(200);
	ll.add(300);
	ll.add(400);
	ll.add(500);
	ll.add(600);
	ll.add(700);
	System.out.println(" LinkedList of ll= "+ll);
	int s = ll.size();
	System.out.println("Length  of ll is = "+s);
	System.out.println();
	
	// vectorlist
	List<Integer>vl=new Vector <> ();
	vl.add(105);
	vl.add(205);
	vl.add(305);
	vl.add(405);
	vl.add(505);
	vl.add(605);
	vl.add(705);
	vl.add(805);
	
	System.out.println(" VectorList of vl= "+vl);
	int st = vl.size();
	System.out.println("Length  of vl is = "+st);
	System.out.println();
	
	
	
	
}
}




