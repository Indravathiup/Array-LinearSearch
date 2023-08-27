package com.kodnest.ArraySearch;

import java.util.Scanner;

public class ArraySum {
	int findsum(int arr[])
	{
	
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
			return sum;
		}
	}


