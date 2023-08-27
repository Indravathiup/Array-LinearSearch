package com.kodnest.ArraySearch;

import java.util.Scanner;

public class ArraySumApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter elements in array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		ArraySum sum=new ArraySum();
		int res=sum.findsum(arr);
		System.out.println("sum of elements in array"+res);
	}

}
