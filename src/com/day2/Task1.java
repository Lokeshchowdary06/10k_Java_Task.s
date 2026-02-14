package com.day2;

public class Task1 {

	public static void main(String[] args) {
		int arr[]=ArrayInput.getArray();
		if(arr == null)
			System.out.println("No Array Elements");
		else
		{
			//Sum of Array Elements
			int sum=0;
			for(int num:arr)
			{
				sum+=num;
			}
			System.out.println("Sum 0f Array Elements = "+sum);
		}	
	}
}
