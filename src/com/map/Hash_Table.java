package com.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.Hashtable;;

public class Hash_Table {

	public static void main(String[] args) {
		Map<String,String> m1=new Hashtable<>();
		
		System.out.println("hashtable");         
		System.out.println();
		//put
		m1.put("vel", "Selenium");
		m1.put("Ganesh", "framework");
		m1.put("Dinesh", "oracle");
		m1.put("Vengat", "corejava");
		m1.put("subash", "jira");
		
		System.out.println(m1);
		System.out.println();
		
		//print keys
		Set<String> keySet = m1.keySet();
		System.out.println(" m1 keys are="+keySet);
		System.out.println();
		
		//print values
		Collection<String> values = m1.values();
		System.out.println("m1 values are = "+values);
		System.out.println();
		
		  //Enhanced forloop
				for (String string : values) {
					System.out.println(string);
				}
				
				//for loop
				System.out.println();
				System.out.println("==========m1 Keys & values are :========");
				for(Entry<String,String> entry :m1.entrySet()) {
					System.out.println(entry.getKey());
					System.out.println(entry.getValue());
				
				}
}
}