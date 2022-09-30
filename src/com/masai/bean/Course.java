package com.masai.bean;

public class Course {

	private String coursename;
	private int fee;
	private String courseDescription;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String coursename, int fee, String courseDescription) {
		super();
		this.coursename = coursename;
		this.fee = fee;
		this.courseDescription = courseDescription;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	@Override
	public String toString() {
		return "Course [coursename=" + coursename + ", fee=" + fee + ", courseDescription=" + courseDescription + "]";
	}
	
	
	
}
