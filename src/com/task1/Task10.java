package com.task1;

public class Task10 {

	public static void main(String[] args) {
		short arr[]= new short[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(short) (100*(i+1));
		}
		for(short num:arr)
		{
			System.out.println(num);
		}
	}

}
