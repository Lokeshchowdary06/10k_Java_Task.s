package com.day2;

import java.util.*;

public interface ArrayInput {
	public static int[] getArray()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size=Integer.parseInt(sc.nextLine());
		if(size<=0)
		{
			System.out.println("Invalid Array Size Entered");
			return null;
		}
		else
		{
			int arr[]= new int[size];
			System.out.println("Enter Array Elements:");
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			return arr;
		}
	}


}
