package com.kodnest.ArraySearch;

import java.util.Scanner;

public class ReplaceArrayApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the elements in array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("array elements before replacing negative numbers");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		ReplaceArray r=new ReplaceArray();
		int[]res=r.replaceNegative(arr);
		System.out.println("array elements after replace");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
	}

}
