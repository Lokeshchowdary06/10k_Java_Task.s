package com.task1;

import java.util.Arrays;

public class Practice2 {
	public static void main(String[] args) {
		int arr[]=UtilityPack.getArray();
		if(arr == null)
		{
			System.out.println("No Elements");
		}
		else
		{
			System.out.println("Array elements");
//			for(int num:arr)
//			{
//				System.out.println(num);
//			}
			System.out.println(Arrays.toString(arr));
		}
	}

}
