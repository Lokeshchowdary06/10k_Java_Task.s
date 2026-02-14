package com.day2;

public class Task3 {
	public static void main(String[] args) {
		int arr[]= ArrayInput.getArray();
		if(arr == null)
			System.out.println("No Array Elements");
		else
		{
			//Reverse an Array
			for(int i=arr.length-1;i>=0;i--)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
