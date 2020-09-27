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
    <% String title = application.getInitParameter("FileCreate");%>

    <title><%=title%></title>
</head>
<body>
<jsp:include page="blocks/header.jsp"/>
<div class="container">
<div style="width:600px;margin-left: auto;margin-right: auto;margin-top:24px;padding: 24px;">
    <div class="card">
        <div class="card-block" style="padding: 24px;">
            <form name="food" action="<%=request.getContextPath()+"/create"%>" method="post">
                <fieldset>

                    <!-- Login Controls -->
                    <div class="form-group">
                        <label for="category">Category</label>
                        <input type="text" class="form-control" id="category" name="category"
                               placeholder="Category">
                    </div>

                    <div class="form-group">
                        <label for="nme">Name</label>
                        <input type="text" class="form-control" id="nme" name="nme"
                               placeholder="Name">
                    </div>
                    <div class="form-group">
                        <label for="description">Description:</label>

                        <textarea class="form-control" aria-label="Description" name="description" id="description"></textarea>
                    </div>
                    <div class="form-group">
                        <label for="nme">Price</label>
                        <input type="number" max="8000" min="0" class="form-control" id="price" name="price"
                               placeholder="Price in tg">
                    </div>
                    <div class="form-group">
                        <label for="size">Size</label>
                        <select class="custom-select" id="size" name="size">
                            <option selected value="S">Small</option>
                            <option value="M">Medium</option>
                            <option value="L">Large</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="image">Image</label>
                        <input type="text" class="form-control" id="image" name="image"
                               placeholder="Image link">
                    </div>



                    <!-- Login Button -->
                    <div class="form-actions" style="margin-top: 12px;">
                        <button type="submit" class="btn btn-success">Add</button>
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
