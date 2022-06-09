package com.list;

import java.util.Set;
import java.util.TreeSet;

public class For_Loop_Treeset {
public static void main(String[] args) {
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
		
		for (Integer integer : s4) {
			System.out.println(integer);
		}
		
}
}
