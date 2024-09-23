package com.basicprograms.loops;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<Integer,Character> m=new HashMap<>();
//		m.put(11, 'x');
//		m.put(2, 'y');
//		m.put(9, 'z');
//		m.putIfAbsent(15, 'a');
//		m.replace(9, 'z', 'k');
//		System.out.println(m);
		
//		Map<Integer,Character> m1=new LinkedHashMap<>();
//		m1.put(11, 'x');
//		m1.put(2, 'y');
//		m1.put(9, 'z');
//		System.out.println(m1);
//		Map<Integer,Character> m2=new TreeMap<>();
//		m2.put(11, 'x');
//		m2.put(2, 'y');
//		m2.put(9, 'z');
//		System.out.println(m2);
		
//		for(Entry<Integer, Character> temp:m.entrySet())
//		{
//			System.out.println(temp.getKey());
//		}
		
		
		Map<Integer,String> m=new HashMap<>();
		m.put(11, "india");
		m.put(2, "srilanka");
		m.put(9, "japan");
		m.put(4, "india");
		m.compute(2, (k,v)->v="java");
		m.computeIfPresent(9, (k,v)->v.toUpperCase());
		m.computeIfAbsent(8, k->"h");
		m.forEach(null);
		for(Entry<Integer,String> temp: m.entrySet())
		{
			if(temp.getValue().equals("india"))
			{
				System.out.println(temp.getKey());
			}
		}
		System.out.println(m);
	}

}
