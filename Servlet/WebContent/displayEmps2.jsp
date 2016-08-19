<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>displayEmps2</title>
</head>
<body>
<div style="width:800px; margin-left:auto; margin-right:auto">
<table width="100%" border="1" bordercolor="red" cellpadding="5" cellspacing="5">
<c:forEach items="${elist}" var="emp">
<tr>
	<td><c:out value="${emp.id}"></c:out></td>
	<td><c:out value="${emp.ename}"></c:out></td>
	<td><c:out value="${emp.salary}"></c:out></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>