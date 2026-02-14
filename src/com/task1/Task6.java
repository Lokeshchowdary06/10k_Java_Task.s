package com.task1;

public class Task6 {
	public static void main(String[] args) {
		int arr[]= new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=5+(i*10);
		}
		for(int num:arr)
		{
			System.out.println(num);
		}
	}

}
