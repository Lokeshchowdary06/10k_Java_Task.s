package com.day2;
import java.util.*;

public class Task4 {
	public static void main(String[] args) {
		int arr[]= ArrayInput.getArray();
		if(arr == null)
			System.out.println("No Array Elements");
		else
		{
			//Search Operation 
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Element to Search:");
			int searchele=sc.nextInt();
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==searchele)
				{
					System.out.println("Element Found at Position: "+(i+1));
					break;
				}
			}
			sc.close();
		}
	}

}
