package com.kodnest.ArraySearch;

import java.util.Scanner;

public class LinearSearchModel3App {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the elements in array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter target to search an element");
		int target=scan.nextInt();
		boolean res=LinearSearchModel3.isPresent(target,arr);
		if(res==true)
		{
			System.out.println("target is indeed present in array");
		}
		else
		{
			System.out.println("target is indeed not present in array ");
			
		
		}
	}
	}

