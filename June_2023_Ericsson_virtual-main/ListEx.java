package com.ericsson.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//1)both homogeneous data/similar data and heterogeneous/disimilar data is allowed
//2)collections are not fixed in size  or growable in nature   AL,vector 
//3)lots utility methods
//List:
//=====
//1)duplicates are allowed
//2)insertion order preserved
public class ListEx {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();// 10 -->(cc*3/2)+1
		al.add("suresh");
		al.add("mahesh");
		al.add("rajesh");
		al.add("somesh");
		al.add("hitesh");
		al.add("naresh");
		al.add("mahesh");
		System.out.println(al);
		al.add(2, "ericsson");
		System.out.println(al);
		System.out.println(al.get(3));
		// al.set(1, "india");
		System.out.println(al.indexOf("mahesh"));
		System.out.println(al.lastIndexOf("mahesh"));

		Iterator<String> names = al.iterator();

		while (names.hasNext()) {
			String name = names.next();
			if (name.startsWith("s"))
				System.out.println(name.toUpperCase());
		}

//ListIterator<String> names=al.listIterator();
//		
//		while(names.hasNext())
//		{
//			String name=names.next();
//				System.out.println(name);
//		}
//		System.out.println("***************");
//		
//		while (names.hasPrevious()) {
//			String string = (String) names.previous();
//			System.out.println(string);
//		}
//		
//		

//		Object objarr[] = al.toArray();
//
//		for (Object obj : objarr) {
//			System.out.println(obj);
//		}
//		System.out.println(al.size());
//		System.out.println(al.contains("mahesh"));
//		al.remove("mahesh");
//		System.out.println(al.contains("mahesh"));
//		System.out.println(al);
//
//		ArrayList<String> al1 = new ArrayList<String>();
//
//		al1.add("sandeep");
//		al1.add("kiran");
//		System.out.println(al1);
//		System.out.println(al1.containsAll(al));
//		al1.addAll(1,al);
//		System.out.println(al1);
//		System.out.println(al1.containsAll(al));
//		//al1.removeAll(al);
//		//al1.retainAll(al)
//		al1.clear();
//		System.out.println(al1);
//		
//		System.out.println(al1.isEmpty());

	}

}
