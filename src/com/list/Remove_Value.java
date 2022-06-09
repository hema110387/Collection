package com.list;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.HashMap;
	public class Remove_Value {

	public static void main(String[] args) {
		List <Object>l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(10);
		l1.add(10);
		l1.add(50);
		l1.add(60);
		l1.add(70);
		System.out.println("L1  values are ="+l1);
		System.out.println();
		
//		Object remove = l1.remove(2);
//		System.out.println("value removed at index 2 ="+remove);
//		System.out.println();
//		System.out.println("after removed at index 2 , L1  values are ="+l1);
		
//
//		Object remove1 = l1.remove(10);
//		System.out.println("value removed at index 10 ="+remove1);
//		System.out.println();
//		System.out.println("after removed at index 10 , L1  values are ="+l1);
//		
		Object index = l1.lastIndexOf(10);
		System.out.println("last index value  of 10 ="+index);
		System.out.println();
		

		Object remove = l1.remove(7);
		System.out.println("last value  of 10 is removed");
		System.out.println();
		System.out.println("after removed last value of 10 , L1  values are ="+l1);
		
}
}