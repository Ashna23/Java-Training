package com.ericsson.collections;

import java.util.Stack;

public class ListEx1 {
	public static void main(String[] args) {
		Stack<String> al = new Stack<String>();// 10 -->(cc*3/2)+1  //fifo-->queue,Stack-->FILO
		al.add("suresh");
		al.add("mahesh");
		al.add("rajesh");
		al.add("somesh");
		al.add("hitesh");
		al.add("naresh");
		al.add("mahesh");
		System.out.println(al);
		
		System.out.println(al.peek());
	}
}
