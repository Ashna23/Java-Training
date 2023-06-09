package com.ericsson.collections;

import java.util.HashMap;

public class ConcurrentHashMapEx1 
{
public static void main(String[] args) 
{	
	HashMap cm=new HashMap();//ConcurrentMap
	cm.put(10, "suresh");
	cm.put(20,"naresh");
	cm.put(30,"harsih");
	//cm.put(20,"prachi");
	System.out.println(cm);
	
	cm.putIfAbsent(20,"ramesh");
	
	System.out.println(cm);
	
	cm.remove(30, "somesh");
	cm.replace(10,"suresh", "gopi");
	
	
	System.out.println(cm);
}
}
