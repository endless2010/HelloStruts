<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
<body>
	<s:form  action="/mypackage/typeConvertTest.action">
		<s:textfield name="user.userid" label="userid"/>
		<s:textfield name="user.username" label="username"/> 
		
		<s:textfield name="userlist[0].userid" label="list userid first"/>	
		<s:textfield name="userlist[0].username" label="list username first"/> 
		<s:textfield name="userlist[1].userid" label="list userid second"/>	
		<s:textfield name="userlist[1].username" label="list username second"/> 
		
		<s:textfield name="usermap['2001'].userid" label="map userid first"/>	
		<s:textfield name="usermap['2001'].username" label="map userid first"/> 	 
		<s:textfield name="usermap['2002'].userid" label="map userid second"/>	
		<s:textfield name="usermap['2002'].username" label="map userid second"/> 
			
		<s:submit value="submit"/>
	</s:form> 
</body>

</html>