package com.kodnest.ArraySearch;

import java.util.Scanner;

public class LinearSearchModel2App {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter length of array");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
			
		}			
		System.out.println("enter the index of key");
		int key=scan.nextInt();
		int result=LinearsearchModel2.LinearSearch(arr,key);
			
		
		

		if(result>=0)
		{
			System.out.println("key found");
		}
		else
		{
			System.out.println("key not found");
		}
	}

}
