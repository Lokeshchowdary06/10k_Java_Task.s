package com.day3;

public class ProblemSolving3 {
	public static void main(String[] args) {
		int arr[]= {12,35,1,10,34,1};
		if(arr==null)
			System.out.println("No Elements in the Array");
		else
		{
			int max1=arr[0];
			int max2=arr[0];
			for(int num:arr)
			{
				if(num>max1)
				{
					max2=max1;
					max1=num;
				}
				else if(num>max2)
					max2=num;
			}
			System.out.println("Second Largest : "+max2);
		}
	}

}
