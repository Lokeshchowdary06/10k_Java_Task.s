package com.task1;

public class Task8 {

	public static void main(String[] args) {
		float arr[]= new float[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=1.1f*(i+1);
		}
		for(float f:arr)
		{
			System.out.printf("%.1f%n",f);
		}
	}

}
