<%--
  Created by IntelliJ IDEA.
  User: xiqiuwei
  Date: 2018/9/9
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        #customers {
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            width: 100%;
            border-collapse: collapse;
        }

        #customers td, #customers th {
            font-size: 1em;
            border: 1px solid #98bf21;
            padding: 3px 7px 2px 7px;
        }

        #customers th {
            font-size: 1.1em;
            text-align: left;
            padding-top: 5px;
            padding-bottom: 4px;
            background-color: #A7C942;
            color: #ffffff;
        }

        #customers tr.alt td {
            color: #000000;
            background-color: #EAF2D3;
        }
    </style>

</head>
<body>
<table id="customers">
    <tr>
        <th>用户名</th>
        <th>年龄</th>
        <th>收入</th>
        <th>婚姻状态</th>
        <th>兴趣爱好</th>
    </tr>

    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.username}</td>
            <td>${user.age}</td>
            <td>${user.income}</td>
            <td>
                <c:choose>
                    <c:when test="${user.isMarry}">
                        已婚
                    </c:when>
                    <c:otherwise>
                        未婚
                    </c:otherwise>
                </c:choose>
            </td>
            <td>
                <c:forEach items="${user.hobby}" var="hobby" varStatus="status">
                    ${hobby}
                    <!-- 每个值用逗号分开 -->
                    <c:if test="${!status.last}">
                        ,
                    </c:if>
                </c:forEach>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
