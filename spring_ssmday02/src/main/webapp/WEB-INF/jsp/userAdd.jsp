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
	<form action="/user/save" method="post">
		用户名：<input type="text" name="userName"><br>
		密码：<input type="password" name="password"><br>
		姓名：<input type="text" name="name"><br>
		年龄：<input type="text" name="age"><br>
		性别：<input type="text" name="sex"><br>
		出生日期：<input type="text" name="birthday"><br>
		<input type="submit" value="提交">
	</form>
</body>
</html>