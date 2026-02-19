package com.day3;

public class ProblemSolving1 {
	public static void main(String[] args) {
		int arr[]= {3,9,2,5,6};
		if(arr==null)
		{
			System.out.println("No Elements in the Array....");
		}
		else {
			int max=arr[0];
			int min=arr[0];
			for(int num:arr)
			{
				if(num>max)
					max=num;
				if(num<min)
					min=num;
			}
			System.out.println("Maximum: "+max+"\nMinimum: "+min);
		}
	}

}
