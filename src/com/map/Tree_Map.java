package com.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
public class Tree_Map {

	
		public static void main(String[] args) {
				Map<String,Integer> m1=new TreeMap<>();
				
				System.out.println("TreeMap");       
				System.out.println();
				//put
				m1.put("!", 10);        
				m1.put("@", 20);
				m1.put("#", 30);
				m1.put("$", 40);
				m1.put("%", 50);
				m1.put("^", 60);
				m1.put("&", 10);
				m1.put("*", 50);
				m1.put("(", 40);
				System.out.println(m1);
				System.out.println();
				
				//print keys
				Set<String> key = m1.keySet();
				System.out.println(" m1 keys are="+key);
				System.out.println();
				
				//print values
				Collection<Integer> va= m1.values();
				System.out.println("m1 values are = "+va);
				System.out.println();
				
				  //Enhanced forloop
				for (Integer integer : va) {
					System.out.println(integer);
				}
				
				
				//for loop
				System.out.println();
				System.out.println("==========m1 Keys & values are :========");
				for(Entry<String, Integer> entry : m1.entrySet()) {
					System.out.println(entry.getKey());
					System.out.println(entry.getValue());
				}	
		}
		}					  		


