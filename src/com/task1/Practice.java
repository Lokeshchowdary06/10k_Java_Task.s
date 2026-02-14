package com.task1;
import java.util.*;
public class Practice {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=Integer.parseInt(sc.nextLine());
		if(size<=0 || size>10)
		{
			System.out.println("Invalid size");
			sc.close();
		}
		else
		{
			String str[]= new String[size];
			for(int i=0;i<size;i++)
			{
				System.out.println("Enter the "+(i+1)+" name: ");
				str[i]=sc.nextLine();
				
			}
			
				System.out.println(Arrays.toString(str));
				sc.close();
		}
	}

}
