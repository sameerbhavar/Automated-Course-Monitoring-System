package com.masai.dao;

import com.masai.bean.Admin;
import com.masai.bean.Course;
import com.masai.bean.Faculty;
import com.masai.exception.AdminException;
import com.masai.exception.FacultyException;


public interface CourseDao {

	
	
	public String Addcourse(Course course);
	public String AdminLogin(Admin admin);
	
	public Admin loginadmin(String username, String password)throws AdminException;
	public Faculty loginfaculty(String uname, String pass) throws FacultyException;

	
}
