<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 13.09.2020
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<jsp:include page="blocks/header.jsp"/>
<h2>Authenticated User</h2>
<h1><%=request.getAttribute("authuser")%></h1>
<a href="<%=request.getContextPath()%>/logout" class="btn btn-danger">Logout</a>
<jsp:include page="blocks/footer.jsp"/>
</body>
</html>
