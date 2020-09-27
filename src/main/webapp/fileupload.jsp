<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 27.09.2020
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <% String title = application.getInitParameter("FileUpload");%>

    <title><%=title%></title>
</head>
<body>
<jsp:include page="blocks/header.jsp"/>
<div class="container">
    <div style="width:600px;margin-left: auto;margin-right: auto;margin-top:24px;padding: 24px;">
        <div class="card">
            <div class="card-header">
                <i class="fa fa-user"></i> Multiple
            </div>
            <div class="card-block" style="padding: 24px;">
                <form  enctype='multipart/form-data' name="f" action="<%=request.getContextPath()%>/upload" method="post">
                    <fieldset>


                        <!-- Upload Controls -->
                        <div class="form-group">
                            <label for="filename">File</label>
                            <input type="file" class="form-control" id="filename" name="filename"
                                 multiple   placeholder="File">
                        </div>

                        <!-- Upload Button -->
                        <div class="form-actions" style="margin-top: 12px;">
                            <button type="submit" class="btn btn-success">Upload</button>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>
<jsp:include page="blocks/footer.jsp"/>
</body>
</html>
