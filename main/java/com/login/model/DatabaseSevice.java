package com.login.model;

import java.sql.ResultSet;

public interface DatabaseSevice {
	
	public void connectDB();
    public boolean verifycrendentials(String email, String password);
	
    public void createregistration(String name, String city, String email, String mobile, String password);
	public ResultSet readRegistration();
	public void deleteUserRegistration(String email);
	public void userUpdate(String name, String city, String email, String mobile);
	public void studentRegistration(String name, String city, String email, String mobile, String password);
	public boolean verifystudentlogin(String email, String password);
	//public void studentRegistration(String name, String email, String message);
	public void studentinquiry(String name, String email, String message);
	public ResultSet viewInquiry();
	
	
	
}
