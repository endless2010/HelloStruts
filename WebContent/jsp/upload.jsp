<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
<body>
	<s:form  action="/mypackage/upload" enctype="multipart/form-data">
		<s:file name="upload" label="upload file"/><br/>
		<s:submit/>
	</s:form>
</body>

</html>