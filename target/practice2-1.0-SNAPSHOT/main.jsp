<%@ page import="Models.Product" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Main</title>
</head>
<body>


<jsp:include page="blocks/header.jsp"/>
<div class="container-fluid text-center">
    <div class="row">
        <%
        List<Product> products= (List<Product>) request.getAttribute("products");
        for (int i=0;i<products.size();i++){%>
        <div class="col-xs-12 col-sm-6 col-md-4 col-lg-3 col-xl-2 text-center shadow rounded pt-5 my-5">
            <img src="<%=products.get(i).getImage_url()%>" style="height: 200px;max-width: 200px;">
            <h2><%=products.get(i).getCategory()%></h2>
            <p><%=products.get(i).getName()%></p>
            <p><b>Size:</b></p>
            <h4><%=products.get(i).getSize()%></h4>
            <h4><b>Price:</b></h4><br>
            <b><h3><%=products.get(i).getPrice()%></h3></b>
            <p><a class="btn btn-secondary" role="button">View
                details »</a></p>

            <div class="row text-center">
                <a class="btn btn-success m-2" role="button">Edit</a>
                <form method="post"><input type="submit" value="Remove" class="btn btn-danger"></form>
            </div>
        </div>
        <%}%>
    </div>
</div>
<jsp:include page="blocks/footer.jsp"/>
</body>
</html>