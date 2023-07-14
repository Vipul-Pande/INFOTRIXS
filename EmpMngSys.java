package com.empdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class EmpMngSys {

	public static void main(String[] args) {
		List<Employe> col = new ArrayList<Employe>();
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		 int choice;
		
		do {
			System.out.println("1) Add Employee Details");
			System.out.println("2) Show Employee Details");
			System.out.println("3) Search Employee Details");
			System.out.println("4) Delete Employee Details");
			System.out.println("5) Update Employee Details");
			System.out.println("\n Hey Admin ! ");
			System.out.print("Enter Your Choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Employee ID");
				int id = sc.nextInt();
				System.out.println("Enter Employee Name");
				String name=s.nextLine();
				System.out.println("Enter Employee Salary");
				int salary=sc.nextInt();
				col.add(new Employe(id,name,salary));
				System.out.println("Details Added Successfully");
				System.out.println("////////////////////////////////////");
				break;
			case 2:
				System.out.println("Employee Details : ");
				
				for (Employe emp : col) {
		                System.out.println(emp);
		            }

				break;
			case 3:
				boolean found = false;
				System.out.print("Enter Employee ID  : ");
				id = sc.nextInt();
		  
				for(Employe emp: col)
				{
					if(emp.getId()==id)
					{
						System.out.println("-------Record Found ! --------- ");
						System.out.println(emp);
						found = true;
					}
					
				}
				if(!found)
				{
					System.out.println("Record not Found");
				}
				break;
			case 4:
			    found = false;
				System.out.print("Enter Employee ID to Delete  : ");
				id = sc.nextInt();
				Iterator<Employe> i = col.iterator();
			    i = col.iterator();
				while(i.hasNext())
				{
					Employe e = i.next();
					if(e.getId()==id)
					{
						
						i.remove();
						found = true;
					}
					
				}
				if(!found)
				{
					System.out.println("Oops Something Went Wrong !");
				}
				else
				{
					System.out.println("Record is deleted");
				}
				break;
			case 5:
			     found = false;
				System.out.print("To update employee details --- ");
				System.out.println("Please Enter Employee ID :");
				id = sc.nextInt();
			    ListIterator<Employe> li = col.listIterator();
				while(li.hasNext())
				{
					Employe e = li.next();
					if(e.getId()==id)
					{
						System.out.println("Update Employee Name :");
						name = s.nextLine();
						System.out.println("Update Employee Salary");
						salary = sc.nextInt();
						li.set(new Employe(id,name,salary));
						found = true;
					}
					
				}
				if(!found)
				{
					System.out.println("Oops Something Went Wrong !");
				}
				else
				{
					System.out.println("Details Updated ! ");
				}
				break;
			}
		}while(choice!=0);
	}
	}
 class Employe {
	
	private int id;
	private String name;
	private int salary;
	
	
	public Employe(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
 


