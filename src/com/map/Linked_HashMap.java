package com.map;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashMap;

public class Linked_HashMap {
	public static void main(String[] args) {
			Map<Integer,Integer> m1=new LinkedHashMap<>();
			
			System.out.println("LinkedHashMap");       
			System.out.println();
			//put
			m1.put(10, 10);
			m1.put(20, 20);
			m1.put(30, 30);
			m1.put(40, 40);
			m1.put(50, 50);
			m1.put(60, 60);
			m1.put(10, 10);
			m1.put(50, 50);
			m1.put(40, 40);
			System.out.println(m1);
			System.out.println();
			
			//print keys
			Set<Integer> ky = m1.keySet();
			System.out.println(" m1 keys are="+ky);
			System.out.println();
			
			//print values
			Collection<Integer> v= m1.values();
			System.out.println("m1 values are = "+v);
			
			  //Enhanced forloop
			for (Integer string : v) {
				System.out.println(string);
			}
			
			//forloop
			System.out.println();
			System.out.println("==========m1 Keys & values are :========");
			for(Entry<Integer, Integer> entry : m1.entrySet()) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}	
	}					  		
}