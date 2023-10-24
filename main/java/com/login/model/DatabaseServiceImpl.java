package com.login.model;

import java.sql.*;

public class DatabaseServiceImpl implements DatabaseSevice{
     private Connection con;
     private Statement stmnt;
     public void connectDB() {
    	 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_db","root","test1");
		   stmnt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	      
     }
	
	@Override
	public boolean verifycrendentials(String email, String password) {
		
		try {
			 
		 ResultSet result=stmnt.executeQuery("select * from loginform where email='"+email+"' and password='"+password+"' ");
		  return result.next();
		      
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
		
	}

	@Override
	public void createregistration(String name, String city, String email, String mobile ,String password) {
		try {
			 
			 stmnt.executeUpdate(" insert into registration2nd values('"+name+"' , '"+city+"', '"+email+"','"+mobile+"','"+password+"')");
			 
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}

	@Override
	 public ResultSet readRegistration() {
		
		try {
			ResultSet result =stmnt.executeQuery("select * from registration2nd ");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
		
	}

	@Override
	public void deleteUserRegistration(String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_db","root","test1");
		   stmnt = con.createStatement();
		   stmnt.executeUpdate("Delete  from registration2nd where email='"+email+"'") ; 
		 } catch (Exception e) {
			e.printStackTrace();
		} 
		
		
	}

	

	@Override
	public void userUpdate(String name, String city, String email, String mobile) {
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_db","root","test1");
		    stmnt = con.createStatement();
		    stmnt.executeUpdate("UPDATE registration2nd SET name='"+name+"',city='"+city+"',email='"+email+"',mobile='"+mobile+"' WHERE email='"+email+"' ") ; 
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

	@Override
	public void studentRegistration(String name, String city, String email, String mobile, String password) {
		   
		try {
			 
			 stmnt.executeUpdate(" insert into registration2nd values('"+name+"' , '"+city+"', '"+email+"','"+mobile+"','"+password+"')");
			 
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
	}

	@Override
	public boolean verifystudentlogin(String email, String password) {
		
		try {
			 
			 ResultSet result=stmnt.executeQuery("select * from registration2nd where email='"+email+"' and password='"+password+"' ");
			  return result.next();
			      
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return false;
	}

	

	@Override
	public void studentinquiry(String name, String email, String message) {
          
		try {
			 
			 stmnt.executeUpdate(" insert into inquiry_data values('"+name+"' , '"+email+"','"+message+"')");
			 
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
	}

	@Override
	public ResultSet viewInquiry() {
		try {
			ResultSet result =stmnt.executeQuery("select * from inquiry_data ");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	
}
