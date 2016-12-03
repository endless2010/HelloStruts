package com.mycompany.i18n.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class I18nTestAction extends ActionSupport{
	private static final long serialVersionUID = 5152555344729351846L;
	
	private String message="undefined";
	public String execute()throws Exception{
		String username="endless";
		ActionContext ctx=ActionContext.getContext();
		ctx.put("username", username);
		message=getText("hello_message");
		return "success";
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
