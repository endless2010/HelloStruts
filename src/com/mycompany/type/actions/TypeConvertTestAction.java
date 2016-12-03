package com.mycompany.type.actions;

import java.util.List;
import java.util.Map;

import com.mycompany.type.User;


public class TypeConvertTestAction {
	private User user;
	private List<User> userlist;
	private Map<Integer,User> usermap;
	
	public String execute()throws Exception{
		System.out.println("user:"+user);
		System.out.println("userlist:"+userlist);
		System.out.println("usermap:"+usermap);
		return "success";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}

	public Map<Integer, User> getUsermap() {
		return usermap;
	}

	public void setUsermap(Map<Integer, User> usermap) {
		this.usermap = usermap;
	}	
}
