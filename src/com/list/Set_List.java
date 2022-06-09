package com.list;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.HashMap;
	public class Set_List {
	public static void main(String[] args) {
		List <Object>l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(10);
		l1.add(10);
		l1.add(50);
		l1.add(60);
		System.out.println("L1  values are ="+l1);
		System.out.println();
		
		Object set = l1.set(2, 50);
		System.out.println("Value 50 is added");
	
		System.out.println("After addded the  value 50 at index 2 ,  l1  values are : =   "+l1);
		System.out.println();
		
		

		Object set1 = l1.set(8, 70);
		System.out.println("Value 70 is added");
		
		System.out.println("After addded the  value 70 at the end ,  l1  values are : =   "+l1);
		System.out.println();
		
		Object set2 = l1.set(7, 80);
		System.out.println("Value 80 is added");
		
		System.out.println("After addded the  value 80 at index 7,  l1  values are : =   "+l1);
		System.out.println();
		
		int lind = l1.lastIndexOf(10);
		System.out.println("last index of 10 is ="+lind);
		Object set3 = l1.set(lind, 100);
		
		System.out.println("After addded the  value 100 at last index value of 10 ,  l1  values are : =   "+l1);
		System.out.println();
}
}