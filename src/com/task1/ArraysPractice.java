package com.task1;

public class ArraysPractice {
	public static void main(String args[])
	{
		int arr[]= new int[3];
		for(int i=1;i<=arr.length;i++)
		{
			arr[i-1]=i*10;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
