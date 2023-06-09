package com.ericsson.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> emps = new HashMap<Integer, String>();
		emps.put(123, "suresh");//entry
		emps.put(555, "naresh");
		emps.put(333, "kiran");
		emps.put(778, "rajesh");
		emps.put(222, "hitesh");
		emps.put(1234, "somesh");
		emps.put(123, "sai");

		System.out.println(emps);
//
//		Set<Integer> set = emps.keySet();
//
//		Iterator<Integer> itr = set.iterator();
//		
//		
//		while(itr.hasNext())
//		{
//			int key=itr.next();
//			System.out.println(key+" "+emps.get(key));
//		}

		Set<Entry<Integer, String>> set = emps.entrySet();

		Iterator<Entry<Integer, String>> itr = set.iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		
		
		
		
		
//		emps.remove(1234);
//		System.out.println(emps);
//		System.out.println(emps.get(123));
//		System.out.println(emps.containsKey("sandeep"));
//		
//		HashMap<Integer, String> emps1 = new HashMap<Integer, String>();
//		emps1.put(999, "mukesh");
//		emps1.put(454, "phani");
//		System.out.println(emps1);
//		emps1.putAll(emps);
//		System.out.println(emps1);

	}
}
