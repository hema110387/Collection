package com.list;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class get_List {
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
	System.out.println("L1  values are ="+l1);
	System.out.println();
	
				//get 
	
	Object object = l1.get(4);
	System.out.println("value at index 4 is = "+object);
	System.out.println();
	
	Object obj = l1.get(2);
	System.out.println("value at index 2 is = "+obj);
	System.out.println();
	
	Object obj1 = l1.get(7);
	System.out.println("value at index 7 is = "+obj1);
	
}
}
