<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, servletDemo.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<%
ArrayList<Employee> emps = (ArrayList<Employee>) request.getAttribute("elist");
for(Employee e: emps) {
%>
<tr>
	<td><%=e.getId()%></td>
	<td><%out.println(e.getEname());%></td>
	<td><%out.println(e.getSalary());%></td>
</tr>
<%
}
%>
</table>
</body>
</html>