package com.day3;

import java.util.Arrays;

public class Patient {
	int patientId;
	String name;
	double testResults[] = new double[5];
	Patient(int patientId,String name,double[] testResults)
	{
		this.patientId=patientId;
		this.name=name;
		this.testResults=testResults;
	}
	public double getAverageResult()
	{
		double totalres=0.0d;
		for(double res:testResults)
		{
			totalres+=res;
		}
		return totalres/testResults.length;
	}
	public boolean hasCriticalValues()
	{
		for(double res:testResults)
		{
			if(res<50) 
				return true;
		}
		return false;
	}
	public void displayPatientReport()
	{
		System.out.println("Patient details:\nPatient Id: "+patientId+"\nPatient Name: "+name+"\nTest Results: "+Arrays.toString(testResults));
	}
	public static void main(String[] args) {
		Patient p1= new Patient(1, "Lokesh" , new double[] {100.23,123.45,80,56.69,45});
		Patient p2= new Patient(2, "ravi" , new double[] {120.23,123.45,80,56.69,45});
		Patient p3= new Patient(3, "raju" , new double[] {100.23,103.45,80,56.69,45});
		Patient p4= new Patient(4, "ramu" , new double[] {100.23,123.45,50,56.69,45});
		Patient p5= new Patient(5, "rakesh" , new double[] {100.23,135.45,80,96.69,440});
		Patient p[]= {p1,p2,p3,p4,p5};
		for(Patient P:p)
		{
			if(P.hasCriticalValues())
				P.displayPatientReport();
		}
	}
}
