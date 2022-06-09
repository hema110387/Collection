package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class For_Loop_Set {
public static void main(String[] args) {
Set <Object>ss3=new LinkedHashSet<>();
	
	ss3.add(105);
	ss3.add(205);
	ss3.add(305);				//add 10,20,30,40,50,60,70,80,90,10,20
	ss3.add(405);
	ss3.add(505);
	ss3.add(605);
	ss3.add(705);
	ss3.add(805);
	ss3.add(505);
	ss3.add(605);
	System.out.println("(LinkedHashSet) set2  values are= "+ss3);
	System.out.println();
	
	for (Object obj : ss3) {
		System.out.println(obj);
	}
}
}
