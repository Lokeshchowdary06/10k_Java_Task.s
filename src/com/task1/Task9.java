package com.task1;

public class Task9 {

	public static void main(String[] args) {
		long arr[]= new long[3];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=100000l*(i+1);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
