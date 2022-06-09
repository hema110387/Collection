package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Map_Types {

	public static void main(String[] args) {
		Map<Integer,String> m1=new Hashtable<>();
		
		System.out.println("hashTable");
		System.out.println();
		//put
		m1.put(120,"kalai");
		m1.put(50, "hema");
		m1.put(40, "saru");
		//m1.put(90, null);
		m1.put(50, "latha");
		//m1.put(40, null);
		m1.put(110, "kavin");
		m1.put(80, "kalai");
		System.out.println(m1);
		System.out.println();
		
		//size
		int s= m1.size();
		System.out.println("size of m1 ="+s);
		System.out.println();
		
		//get
		String str= m1.get(110);
		System.out.println(str);
		System.out.println();
		
		//keyset
		Set<Integer> keyset = m1.keySet();
		System.out.println(keyset);
		System.out.println();
		
		//values
		Collection<String> values = m1.values();
		System.out.println(values);
		System.out.println();
		
		//containskey
		boolean ck = m1.containsKey(50);
		System.out.println(ck);
		System.out.println();
		
		//containsValue
		boolean cv = m1.containsValue("kavi");
		System.out.println(cv);
		System.out.println();
		
		//Entryset
		Set<Entry<Integer, String>> enset = m1.entrySet();
		System.out.println(enset);
		System.out.println();
		
	} 
}

