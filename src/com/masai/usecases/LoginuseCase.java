package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Admin;
import com.masai.bean.Faculty;
import com.masai.dao.CourseDao;
import com.masai.dao.CourseDaoImpl;
import com.masai.exception.AdminException;
import com.masai.exception.FacultyException;



public class LoginuseCase {
	
public static void main(String[] args) {
	System.out.println("Welcome Course Montoring System");
	System.out.println("1.Login as Admin");
	System.out.println("2.Login as Faculty");
	
	Scanner sc= new Scanner(System.in);
	int choice= sc.nextInt();
	
	if(choice==1)
	{
		System.out.println("Admin login");
		
		System.out.println("Enter Username:");
		String uname = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		CourseDao dao = new CourseDaoImpl();
		try {
			Admin admin= dao.loginadmin(uname, pass);
			System.out.println("Login Sucessfull...");
	 		System.out.println("Welcome To Admin :"+admin.getUsername());
	 		
	 		System.out.println("1.Create course");
	 		System.out.println("2.Update course");
	 		System.out.println("3.View Course");
	 		System.out.println("4.create batch");
	 		System.out.println("5.Update Batch");
	 		System.out.println("6.View Batch with passing course Name");
	 		System.out.println("7.Create Faculty");
	 		System.out.println("8.Update Faculty");
	 		System.out.println("9.View Faculty");
	 		System.out.println("10.Allocate Faculty to Batch");
	 		System.out.println("11.Create course Plan");
	 		System.out.println("12.Update course Plan");
	 		System.out.println("13.View course Plan");
	 		System.out.println("14.View the Day wise Update of evry Batch");
	 		System.out.println("14.GenrateReport of evry Batch");
	 		
	 		int day = 4;
	 		switch (day) {
	 		  case 1:
	 		    System.out.println("Monday");
	 		    break;
	 		  case 2:
	 		    System.out.println("Tuesday");
	 		    break;
	 		  case 3:
	 		    System.out.println("Wednesday");
	 		    break;
	 		  case 4:
	 		    System.out.println("Thursday");
	 		    break;
	 		  case 5:
	 		    System.out.println("Friday");
	 		    break;
	 		  case 6:
	 		    System.out.println("Saturday");
	 		    break;
	 		  case 7:
	 		    System.out.println("Sunday");
	 		    break;
	 		}
	 		
	 	
		}catch (AdminException e) {
			System.out.println(e.getMessage());
		}
		
	}else if(choice==2)
	{
		System.out.println("Login as Faculty");
		
		System.out.println("Enter Username:");
		String uname = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		CourseDao dao = new CourseDaoImpl();
		try {
			Faculty faculty= dao.loginfaculty(uname, pass);
			System.out.println("Login Sucessfull...");
	 		System.out.println("Welcome To Faculty :"+faculty.getFacultyName());
	 	
		}catch (FacultyException e) {
			System.out.println(e.getMessage());
		}
	}
 
}

}
