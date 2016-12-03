<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="" %>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	<H1>Exception Occured</H1>
	<B>Message:</B> <s:property value="exception.message"/> <br/>
	<B>exception: </B><s:property value="exception"/> <br/>
	<B>exceptionStack: </B><s:property value="exceptionStack"/> <br/>
</body>

</html>