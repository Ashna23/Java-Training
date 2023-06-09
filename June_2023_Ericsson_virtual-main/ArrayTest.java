package com.ericsson.exceptions;

public class ArrayTest {
	public void m1(int[][] array)
	{
		
	}
	public static void main(String[] args) {
//		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
//
//		int a = arr[0][2];
//		System.out.println(a);
//		int b=arr[2][2];
//		System.out.println(b);
//		
		int a=23;
		String name="";
		String name1=new String("");

		int arr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		
		ArrayTest obj=new ArrayTest();
		obj.m1(arr);
		
		int arr1[][]=new  int[3][5];
		
				arr1[0][0]=1;
		
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 5; j++) //i=2,j=0
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
