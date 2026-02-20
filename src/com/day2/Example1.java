package com.day2;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Employee{
	private String empName;
	private String empDeg;
	private double empSalary;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDeg() {
		return empDeg;
	}
	public void setEmpDeg(String empDeg) {
		this.empDeg = empDeg;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	Employee(String empName,String empDeg,double empSalary)
	{
		this.empName = empName;
		this.empDeg = empDeg;
		this.empSalary = empSalary;
	}
	public void empDetails()
	{
		System.out.println("--------Employee Details---------\nEmp Name: "+empName+"\nEmp Designation: "+empDeg+"\nEmp Salary: "+empSalary);
	}
}
public class Example1 {
	public static void main(String[] args) {
		Predicate<Employee> predicate = new Predicate<Employee>() {
			
			@Override
			public boolean test(Employee e) {
				if(e.getEmpSalary()>10000)
					return true;
				return false;
			}
		};
		Consumer<Employee> consumer= new Consumer<Employee>() {
			
			@Override
			public void accept(Employee t) {
				t.empDetails();
				if(predicate.test(t))
				{
//					t.empDetails();
					double bonus=t.getEmpSalary()*0.1;
					t.setEmpSalary(t.getEmpSalary()+bonus);
					System.out.println("Bonus Increment:"+bonus+"\nFinal Salary: "+t.getEmpSalary()+"\n");
				}
				else
				{
					System.out.println("No Bonus Bruhh....\n");
				}
			}
		};
		Employee e1= new Employee("Lokesh Chowdary", "Developer", 12000.00);
		Employee e2= new Employee("Ravi Chowdary", "Tester", 1000.00);
		Employee e3= new Employee("Raju Chowdary", "Designer", 11000.00);
		Employee[] e= {e1,e2,e3};
		for(Employee emp:e)
		{
			consumer.accept(emp);
		}
		
		
	}

}
