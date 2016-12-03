package com.mycompany.type;

public class User {
	private int userid;
	private String username;
	
	public String toString(){
		return "id:"+userid+",name:"+username;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
