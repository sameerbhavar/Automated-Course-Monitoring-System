package com.masai.bean;

public class Faculty {
	
	private String facultyName;
	private String facultryAddress;
	private String mobile;
	private  String email;
	private String username;
	private String password;
	
	public Faculty() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Faculty(String facultyName, String facultryAddress, String mobile, String email, String username,
			String password) {
		super();
		this.facultyName = facultyName;
		this.facultryAddress = facultryAddress;
		this.mobile = mobile;
		this.email = email;
		this.username = username;
		this.password = password;
	}



	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getFacultryAddress() {
		return facultryAddress;
	}

	public void setFacultryAddress(String facultryAddress) {
		this.facultryAddress = facultryAddress;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Faculty [facultyName=" + facultyName + ", facultryAddress=" + facultryAddress + ", mobile=" + mobile
				+ ", email=" + email + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	

}
