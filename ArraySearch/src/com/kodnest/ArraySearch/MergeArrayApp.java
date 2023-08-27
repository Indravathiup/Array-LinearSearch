package com.kodnest.ArraySearch;

import java.util.Scanner;

public class MergeArrayApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first array length");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("enter elements in first array");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("enter the second array elments");
		int arr2[]=new int[scan.nextInt()];
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		System.out.println("array 1 elements");
			for(int x:arr1)
			{
				System.out.println(x+" ");
			}
			System.out.println("array 2 elements");
			for(int x:arr2)
			{
				System.out.println(x+" ");
				System.out.println();
			}
			MergeArray merge=new MergeArray();

			int res[]=merge.mergeArray(arr1, arr2);

			System.out.println("Array -3===> ");

			for (int x : res) {
				System.out.println(x+" ");
			}
		}
		
}
			
		

