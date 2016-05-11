<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	this is new page
	<br />
	<c:if test="${v  eq 1}">
		<table>

			<c:forEach items="${users}" var="user" step="1">
				<tr>
					<td>${user.id }</td>
					<td>${user.ocode }</td>
					<td>${user.order_desc }</td>
					<td>${user.totalamount}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>