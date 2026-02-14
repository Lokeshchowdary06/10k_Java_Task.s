package com.task1;

import java.util.Scanner;

public interface UtilityPack {
	public static int[] getArray()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=Integer.parseInt(sc.nextLine());
		if(size<=0 || size>10)
		{
			System.out.println("Invalid size");
			sc.close();
			return null;
		}
		else
		{
			int str[]= new int[size];
			for(int i=0;i<size;i++)
			{
				System.out.println("Enter the "+(i+1)+" number: ");
				str[i]=sc.nextInt();
				
			}
			sc.close();
				return (str);
		}
		
	}
}
