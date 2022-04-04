<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: phantomhunter
  Date: 03.04.2022
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product create</title>
</head>
<body>
<form:form action="create" modelAttribute="newProduct">
    <form:hidden path="id" value="$product.id"/>
    Product title: <form:input path="title"/>
    <br>
    Product cost: <form:input path="cost"/>
    <br>
    <input type="submit" value="Submit">
</form:form>

</body>
</html>
