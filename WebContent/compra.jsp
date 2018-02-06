<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="comprado" scope="session" class="com.basico.Compra">
<jsp:setProperty name="comprado" property="email"/>
<jsp:setProperty name="comprado" property="producto"/>
<jsp:setProperty name="comprado" property="total"/>
</jsp:useBean>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Su email es: <jsp:getProperty name="comprado" property="email"/><br>
	El total por su <jsp:getProperty name="comprado" property="producto"/> es <jsp:getProperty name="comprado" property="total"/>
</body>
</html>