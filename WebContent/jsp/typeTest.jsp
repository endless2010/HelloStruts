<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
<body>
	<s:form  action="/mypackage/typeTest">
		<s:textfield name="booleanType" label="booleanType"/>
		<s:textfield name="charType" label="charType"/>
		<s:textfield name="intType" label="intType"/>
		<s:textfield name="longType" label="LongType"/>
		<s:textfield name="floatType" label="floatType"/>
		<s:textfield name="doubleType" label="doubleType"/>
		<s:textfield name="dateType" label="dateType"/>
		<s:checkboxlist name="arrayType" label="arrayType" list="{0,1,2,3}"/>
		<s:checkboxlist name="collectionType" label="collectionType" list="{'A','B','CD'}"/>
		<s:submit/>
	</s:form>

</body>

</html>