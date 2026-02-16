//package com.task1;
//
//public class Student {
//	static int rollNumber;
//	static String name;
//	static int arr[]=UtilityPack.getArray();
//	Student( int rollNumber, String name,int arr[] )
//	{
//		this.rollNumber= rollNumber;
//		this.name= name;
//		this.arr=arr;
//	}
//	public static int calculateAverage()
//	{
//		int totalMarks=0;
//		for(int marks:arr)
//		{
//			totalMarks+=marks;
//		}
//		return totalMarks/arr.length;
//	}
//	public static void displayDetails()
//	{
//		System.out.println("----------------Student Details--------------\nStudent Roll Number:"+rollNumber+"\nName:"+name+"\nAverage Marks: "+calculateAverage());
//	}
//	public static void main(String[] args) {
//		Student std1= new Student(69,"Lokesh Chowdary");
//		Student std2= new Student(70,"Ravi");
//		Student std3= new Student(71,"Raju");
//		Student std[]=new Student[3];
//	}
//	
//	
//	
//
//}