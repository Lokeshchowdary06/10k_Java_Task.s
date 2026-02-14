package com.day2;

// import java.util.*;

public class Task5 {
	public static void main(String[] args) {
			int arr[]=ArrayInput.getArray();
			if(arr == null)
				System.out.println("No Array Elements");
			else
			{
				int size=arr.length;
				int newarr[]= new int[size];
				for(int i=0;i<size;i++)
				{
					newarr[i]=arr[i];
				}
				//System.out.println("Elements copied to New Array: "+Arrays.toString(newarr));
				System.out.println("Elements copied to New Array: ");
				for(int num:newarr)
				{
					System.out.println(num);
				}
			}
	}

}
