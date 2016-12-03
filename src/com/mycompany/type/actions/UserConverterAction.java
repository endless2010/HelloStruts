package com.mycompany.type.actions;

import com.mycompany.type.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserConverterAction extends ActionSupport{
	private User user;

//	private List<User> user;
//	private User[] user;
//	private Set<User> user;
	
	public String execute()throws Exception{
		System.out.println("user:"+user);
		return "success";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}