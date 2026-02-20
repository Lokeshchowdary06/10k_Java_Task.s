package com.day1;

//import java.util.Arrays;

interface distinctSortArray{
	void distSortArray(int[] arr);
}
public class Task1 {
	public static int[] srt(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,3,4,5,5,0,9,0,5};
//		System.out.println(Arrays.toString(srt(arr)));
		distinctSortArray DSA=new distinctSortArray()
			{
				public void distSortArray(int[] arr)
				{
					boolean visited[]=new boolean[arr.length];
					for(int i=0;i<arr.length;i++)
					{
						if(visited[i]==true)
							continue;
						for(int j=i+1;j<arr.length;j++)
						{
							if(arr[i]==arr[j])
							{
								visited[j]=true;
							}
						}
						System.out.println(arr[i]);
					}
				}
			};
			DSA.distSortArray(srt(arr));
	}
}
