package com.ericsson.collections;

import java.util.TreeSet;

//1)both homogeneous data/similar data and heterogeneous/disimilar data is allowed
//2)collections are not fixed in size  or growable in nature   al,vector 
//3)lots utility methods
//Set:
//=====
//1)duplicates are not allowed
//2)insertion order is not preserved
public class SetEx {

	public static void main(String[] args) {
		TreeSet<String> hs = new TreeSet<String>();//16 ,hashmap
		hs.add("suresh");
		hs.add("mahesh");
		hs.add("rajesh");
		hs.add("somesh");
		hs.add("hitesh");
		hs.add("naresh");
		hs.add("mahesh");
		System.out.println(hs);//Comparable,Comparator,Map,con
	}

}
