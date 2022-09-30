package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Course;
import com.masai.dao.CourseDao;
import com.masai.dao.CourseDaoImpl;

public class AddCourseUsecase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter course Name");
		String coursename=sc.next();  
		
		System.out.println("Enter course fee");
		int fee= sc.nextInt();
		
		System.out.println("Enter course Description");
		String courseDescription=sc.nextLine();
		
		Course course = new Course();
		course.setCoursename(coursename);
		course.setFee(fee);
		course.setCourseDescription(courseDescription);
		
		
		CourseDao dao=new CourseDaoImpl();
		//CourseDaoImpl dao = new CourseDaoImpl();
		String result=dao.Addcourse(course);
		
		System.out.println(result);
	}

}
