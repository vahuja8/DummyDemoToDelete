package com.vinay.mvc;

//MVC model class
public class LoginBean {
	
	//declaration of properties
		private String username;
		private String password;
		
		//setter method for user name
		public void setUsername(String user)
		{
			this.username=user;
			
		}
		//getter method for user name
		public String getUsername()
		{
			return username;
		}
		//setter method for password
		public void setPassword(String pass)
		{
			this.password=pass;
			
		}
		//getter method for password
		public String getPassword()
		{
			return password;
		}
		
		//check methods to validate the user credentials
		public boolean checkCredentials(String username, String password)
	    {
	        boolean status = false;

	        if("Max".equals(username) && "Max123".equals(password))
	        {
	            status = true;
	        }
	        return status;
	    }

}
