<%@ page import="java.io.File" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 27.09.2020
  Time: 12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><%String title = application.getInitParameter("FileDownload");%>

    <title><%=title%>
    </title>
</head>
<body>
<%File repo = (File) request.getAttribute("repository");%>
<jsp:include page="blocks/header.jsp"/>
<h1 style="text-align: center">The repo objects</h1>

<%for (File file : repo.listFiles()) {%>

<form action="<%=request.getContextPath()+"/download"%>" method="post" name="form"
      style="background-color:#ececa4;text-align: center;">
    <input type="text" name="file" value="<%=file.getAbsolutePath()%>" style="display: none;">
    <p>File name</p>
    <p style="text-align: center;"><%=file.getName()%>
    </p>
    <p>Size:</p>
    <p style="text-align: center;"><%=(double) file.length() / (1024 * 1024) + " mb"%>
    </p>

    <input style="background-color: red;color: white;border-radius: 5px;" type="submit" value="Delete">
</form>
<form action="<%=request.getContextPath()+"/load"%>" method="post" name="download">
    <input type="text" name="file" value="<%=file.getAbsolutePath()%>" style="display: none;">
    <input style="background-color: greenyellow;color: white;border-radius: 5px;" type="submit" value="Download">
</form>
<br>
<%}%>
<jsp:include page="blocks/footer.jsp"/>
</body>
</html>
