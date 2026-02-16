package com.task1;
class employee{
	int empId;
	String empName;
	double monthlySalary[];
	public employee(int empId, String empName, double[] monthlySalary) {
		this.empId = empId;
		this.empName = empName;
		this.monthlySalary = monthlySalary;
	}
	public double calculateAnnualSalary() {
		double annualSalary=0;
		for(double sal:monthlySalary)
		{
			annualSalary+=sal;
		}
		return annualSalary;
	}
	public void displayEmployeeDetails()
	{
		System.out.println("--------------Employee Details---------\nEmployee Id:"+empId+"\nEmployee Name: "+empName+"\nTotal Annual Salary: "+calculateAnnualSalary());
	}
}

public class Main {
	public static void main(String[] args) {
		employee e1=new employee(69, "Lokesh chowdary", new double[] {10,20,30,40,50,60,70,80,90,110,120});
		employee e2=new employee(69, "Ravi chowdary", new double[] {110,120,130,410,150,160,170,80,901,110,120});
		employee e[]= {e1,e2};
		for(employee emp:e)
		{
			emp.displayEmployeeDetails();
		}

		
	}

}
