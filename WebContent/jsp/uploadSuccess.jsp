<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
<body>
	<H1> File Uploaded </H1>
	<H1> filename: <s:property value="uploadFileName" /> </H1>
	<H1> contentType: <s:property value="uploadContentType" /> </H1>
	<H1> savePath: <s:property value="savePath" /> </H1>
</body>

</html>