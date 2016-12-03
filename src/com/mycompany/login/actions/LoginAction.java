package com.mycompany.login.actions;

public class LoginAction {
	
	private String username;
	private String password;
	
	public String execute()throws Exception{
		if(username!=null){
			if(username.equals("plainText"))
				return "plainText";
			if(username.equals("redirect"))
				return "redirect";
			if(username.equals("redirectAction"))
				return "redirectAction";
			if(username.equals("other"))
				return "other";	
			
			if(username.equals("exception1"))
				throw new IllegalArgumentException("exception1 occured");
			if(username.equals("exception2"))
				throw new Exception("exception2 occured");		
			if(password!=null && username.equals(password))
				return "success";
		}
		return "failure";
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
	
}