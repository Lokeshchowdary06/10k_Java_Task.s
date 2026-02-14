package com.day2;

public class Task2 {
	public static void main(String[] args) {
		int arr[]=ArrayInput.getArray();
		if(arr == null)
			System.out.println("No Array Elements");
		else
		{
			//Count Even and Odd Numbers in an Array
			int evenCount=0;
			int oddCount=0;
			for(int num:arr)
			{
				if(num%2==0)
					evenCount++;
				else
					oddCount++;
			}
			System.out.println("Even Count = "+evenCount);
			System.out.println("Odd Count = "+oddCount);
		}
	}

}
