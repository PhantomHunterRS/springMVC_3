<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: phantomhunter
  Date: 04.04.2022
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<h1>Products List</h1>
<ul>
    <c:forEach var = "product" items="$products">
        <c:url var="viewUrl" value="/product"
    </c:forEach>
</ul>

</body>
</html>
