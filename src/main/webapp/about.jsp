<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 13.09.2020
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>About</title>
</head>
<body>
<jsp:include page="blocks/header.jsp"/>
<h1>About page</h1>
<form action="<%=request.getContextPath()+"/about"%>" method="post">
    <input type="text" name="first" placeholder="Fisrt"><br>
    <input type="text" name="second" placeholder="Second"><br>
    <input type="number" name="region" placeholder="region"><br>
    <input type="number" name="start" placeholder="start"><br>

    <input type="submit" value="Submit">
</form>
<jsp:include page="blocks/footer.jsp"/>

</body>
</html>
<%--Scanner in = new Scanner(System.in);--%>
<%--System.out.println("First word:");--%>
<%--String first = in.nextLine();--%>
<%--System.out.println("Second word:");--%>
<%--String second = in.nextLine();--%>
<%--System.out.println("Region index:");--%>
<%--int index=in.nextInt();--%>
<%--System.out.println("Indexes to check in:");--%>
<%--System.out.println("Start");--%>
<%--int start=in.nextInt();--%>
<%--System.out.println("End");--%>
<%--int end=in.nextInt();--%>
<%--System.out.println("Region matching:");--%>
<%--System.out.println(first.regionMatches(true,index , second, start, end));--%>
<%--System.out.println("They are equal?");--%>
<%--System.out.println(first.equalsIgnoreCase(second));--%>
