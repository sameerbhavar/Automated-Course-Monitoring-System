package com.masai.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.masai.bean.Admin;
import com.masai.bean.Course;
import com.masai.bean.Faculty;
import com.masai.exception.AdminException;
import com.masai.exception.FacultyException;
import com.masai.utility.Dbutil;

public class CourseDaoImpl implements CourseDao {

	@Override
	public String Addcourse(Course course) {

    String msg="Not inserted";
    
    try(Connection conn= Dbutil.provideConnection()) {
    	PreparedStatement ps= conn.prepareStatement("insert into course(coursename,fee,courseDescription)values(?,?,?)");
    	ps.setString(1,course.getCoursename());
    	ps.setInt(2, course.getFee());
    	ps.setString(3, course.getCourseDescription());
    	
    	int x=ps.executeUpdate();
    	
    	if(x>0)
    	{
    		msg="Course Added Successfully";
    	}
		
	} catch (SQLException e) {
		msg=e.getMessage();
	}
		
		return msg;
	}

	@Override
	public String AdminLogin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin loginadmin(String username, String password) throws AdminException {
		
		Admin admin = null;
		
		try(Connection conn = Dbutil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from admin where username = ? AND password = ?");			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			
				if(rs.next()) {
				
				String userName= rs.getString("username");
				String password1=rs.getString("password");
				
				
			admin=new Admin(userName,password1);	
				
				
			}else
				throw new AdminException("Invalid Username or password.. ");
			
			
		} catch (SQLException e) {
			throw new AdminException(e.getMessage());
		}
		
		
		return admin;
	}

	@Override
	public Faculty loginfaculty(String uname, String pass) throws FacultyException {
   
		Faculty faculty = null;
		
		try(Connection conn = Dbutil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from faculty where username = ? AND password = ?");			
			
			ps.setString(1, uname);
			ps.setString(2, pass);
			
			ResultSet rs= ps.executeQuery();
			
			
				if(rs.next()) {
				
				String fname= rs.getString("facultyname");
				String faddress=rs.getString("facultyaddress");
				String mobile=rs.getString("mobile");
				String email=rs.getString("email");
				String username=rs.getString("username");
				String password=rs.getString("password");
				
				
			faculty=new Faculty(fname, faddress, mobile, email, username, password);	
				
				
			}else
				throw new FacultyException("Invalid Username or password.. ");
			
			
		} catch (SQLException e) {
			throw new FacultyException(e.getMessage());
		}
		
		return faculty;
	}

	

}
