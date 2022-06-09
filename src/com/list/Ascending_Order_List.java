package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ascending_Order_List {

	public static void main(String[] args) {
		List <Integer> l1=new ArrayList <> ();
		l1.add(10);
		l1.add(20);
		l1.add(80);
		l1.add(40);
		l1.add(60);
		l1.add(100);
		System.out.println("l1 values are= "+l1);
		System.out.println();
		Collections.sort(l1);
		System.out.println("Ascending order of l1 values are = "+l1);
		System.out.println();
		System.out.println("Descending Order of l1 values are = ");
		Collections.sort(l1,Collections.reverseOrder());
		
		for (Integer num : l1) {
			System.out.println(num);
		}
		
		System.out.println();
		List <Integer> l2=new ArrayList <> ();
		l2.add(105);
		l2.add(205);
		l2.add(80);
		l2.add(410);
		l2.add(60);
		l2.add(100);
		System.out.println("l2 values are= "+l2);
		System.out.println();
		l2.remove(2);
		System.out.println("after removed at index 2, l2 values are = "+l2);
		System.out.println();
		l2.clear();
		System.out.println("after cleared the l2 values ="+l2);
	}
}
