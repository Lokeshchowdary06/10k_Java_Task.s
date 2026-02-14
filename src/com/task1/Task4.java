package com.task1;

public class Task4 {
		public static void main(String[] args) {
			char arr[]= new char[5];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=(char) (65+i);
			}
			for(char alpha:arr)
			{
				System.out.println(alpha);
			}
		}
}
