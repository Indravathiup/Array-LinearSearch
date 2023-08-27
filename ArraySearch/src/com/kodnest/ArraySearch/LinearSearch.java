package com.kodnest.ArraySearch;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		System.out.println("enter the key to search");
		int key=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				System.out.println("key found");
				return;
			}
		}
			System.out.println("key not found");
		}
	}


