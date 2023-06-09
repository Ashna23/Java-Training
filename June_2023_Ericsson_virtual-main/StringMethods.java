package com.ericsson.stringex;

public class StringMethods {

	public static void main(String[] args) {
//		String orgName = new String("ericsson");//heap-->SCP
//		System.out.println(orgName.concat(" india"));
//		System.out.println(orgName);
		
		String orgName = "ericsson";//imuttable
		String orgName1 = "ericsson";
		
		System.out.println(orgName.equals(orgName1));//true
		System.out.println(orgName.equalsIgnoreCase(orgName1));//true
		System.out.println(orgName==orgName1);//true
		System.out.println(orgName.compareTo(orgName1));//0
		System.out.println(orgName.compareToIgnoreCase(orgName1));//0

			
		
		String orgName2 = new String("ericsson");
		String orgName3 = new String("ericsson");
		
		
		System.out.println(orgName2.equals(orgName3));//true
		System.out.println(orgName2==orgName3);//false

		
		System.out.println("ericsson".compareTo("adicsson"));
		
		
		//returns -ve if obj1 has to come before obj2
		//returns +ve if obj1 has to come after obj2
		// returns 0 if both objects are same 
		
		
		
		StringBuffer sb=new StringBuffer("india");
		sb.append(" hyderabad");
		System.out.println(sb);
		
		
		

	}

}
