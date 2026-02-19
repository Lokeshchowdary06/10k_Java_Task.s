package com.day3;
class Course
{
	String courseName;
	int marks[]= new int[4];
	Course(String courseName,int[] marks)
	{
		this.courseName=courseName;
		this.marks=marks;
	}
	public double courseWiseAverage()
	{
		int totalmarks=0;
		for(int mark:marks)
		{
			totalmarks+=mark;
		}
		return (double)totalmarks/marks.length;
	}
}
class Student{
	int rollNo;
	String name;
	Course course[]=new Course[3];
	Student(int rollNo,String name,Course course[])
	{
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
	}
	public double getOverallAverage()
	{
		double overalltotalmarks=0;
		for(Course c:course)
		{
			overalltotalmarks+=c.courseWiseAverage();
		}
		return (double)overalltotalmarks/course.length;
	}
	public void displayStudentPerformance()
	{
		System.out.println("--------Student Details--------\nStudent Name: "+name+"\nStudent RollNo: "+rollNo);
		for(Course c:course)
		{
			System.out.println("Average Marks in "+c.courseName+" is: "+c.courseWiseAverage());
		}
		System.out.printf("OverAll Average: %.2f\n",getOverallAverage());
	}
}

public class GradingSystem {
	public static void main(String[] args) {
		Student st1 = new Student(69, "Lokesh Chowdary", new Course[] {
			    new Course("Java", new int[]{80, 85, 90, 88}),
			    new Course("Python", new int[]{70, 75, 80, 72}),
			    new Course("DBMS", new int[]{90, 92, 88, 95})
			});
		Student st2= new Student(70,"Harshini", new Course[]
				{
					new Course("Java", new int[] {80, 85, 90, 88}),
					new Course("DBMS", new int[] {70, 95, 80, 78}),
					new Course("OS", new int[] {85, 84, 75, 88})
				});
		st1.displayStudentPerformance();
		st2.displayStudentPerformance();
		
		}

}
