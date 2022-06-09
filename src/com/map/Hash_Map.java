package com.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Hash_Map {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<>();
		
		System.out.println("hashMap");      
		System.out.println();
		//put
		m1.put(10, "java");
		m1.put(20, "sql");
		m1.put(30, "oops");
		m1.put(40, "Sql");
		m1.put(50, "oracle");
		m1.put(60, "DB");
		m1.put(10, "selenium");
		m1.put(50, "psql");															
		m1.put(40, "Hadoop");
		System.out.println(m1);
		System.out.println();
		
		//print keys
		Set<Integer> ky = m1.keySet();
		System.out.println(" m1 keys are="+ky);
		System.out.println();
		
		//print values
		Collection<String> values = m1.values();
		System.out.println("m1 values are = "+values);
		System.out.println();
		         //Enhanced forloop
		for (String string : values) {
			System.out.println(string);
		}
			// for_loop print keys& values
					System.out.println();
					System.out.println("==========m1 Keys & values are :========");
				for (Entry<Integer, String> entry : m1.entrySet()) {
				    System.out.println(entry.getKey());
				    System.out.println( entry.getValue());
				}
				
				
			
		
}
}