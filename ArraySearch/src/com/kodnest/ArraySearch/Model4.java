package com.kodnest.ArraySearch;

import java.util.Scanner;

public class Model4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of array");
		int arr1[]=new int[scan.nextInt()];
		
		System.out.println("enter elements in first array");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("enter the elements in array 2");
		int arr2[]=new int[scan.nextInt()];
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		System.out.println("array 1 contents are ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.println(arr1[i]+" ");
		}
		System.out.println("array 2 contents are");
		{
			for(int i=0;i<=arr2.length-1;i++)
			{
				System.out.println(arr2[i]+" ");
			}
		}
		}
			}
		
	