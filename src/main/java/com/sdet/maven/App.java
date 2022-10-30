package com.sdet.maven;

import java.util.ResourceBundle;

public class App {

	
	public int login(String user,String pass)
	{
		
		ResourceBundle  rb=ResourceBundle.getBundle("config");
		String Username=rb.getString("username");
		String password=rb.getString("password");
		
		if(user.equals(Username)  && pass.equals(password) )
		   return 1;
		
		else
			
			return 0;
		
		
	}
	

}
