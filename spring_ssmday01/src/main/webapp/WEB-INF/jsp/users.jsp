<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="/css/user.css" />
</head>
<body>
<table id="customers">
	<tr>
		<th>编号</th>
		<th>用户名</th>
		<th>姓名</th>
		<th>年龄</th>
		<th>性别</th>
		<th>出生日期</th>
		<th>创建时间</th>
		<th>更新时间</th>
	</tr>
	<c:forEach items="${users}" var="user">
		<tr>
			<td>${user.id}</td>
			<td>${user.userName}</td>
			<td>${user.name}</td>
			<td>${user.age}</td>
			<td>
				<c:choose>
					<c:when test="${user.sex==1}">
						男
					</c:when>
					<c:otherwise>
						女
					</c:otherwise>
				</c:choose>
			</td>
			<td>
				<fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"/>
			</td>
			<td>
				<fmt:formatDate value="${user.created}" pattern="yyyy-MM-dd HH:mm:ss"/>
			</td>
			<td>
				<fmt:formatDate value="${user.updated}" pattern="yyyy-MM-dd HH:mm:ss"/>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>