package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class List_Index {
	public static void main(String[] args) {
		
		List <Object>l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		System.out.println("Li values are ="+l1);
		System.out.println();
		
		int i = l1.indexOf(10);
		System.out.println("Index of 10 is ="+i);
		System.out.println();
		
		int lind = l1.lastIndexOf(10);
		System.out.println("Last Index of 10 is = "+lind);
		System.out.println();
		
		
		int ind= l1.indexOf(50);
		System.out.println("Index of 50 is ="+ind);
		System.out.println();
		
		int inde= l1.indexOf(70);
		System.out.println("Index of 70 is ="+inde);
		
		
		
		
	}
}
