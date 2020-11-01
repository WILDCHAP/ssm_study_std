<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<c:forEach var="book" items="${books}">
    <tr>
        <td>${book.bookID}</td>
        <td>${book.bookName}</td>
        <td>${book.bookCounts}</td>
        <td>${book.detail}</td>
        <td>
            <a href="${pageContext.request.contextPath}/book/toUpdataBook/${book.bookID}">修改</a>
            &nbsp; | &nbsp;
            <a href="${pageContext.request.contextPath}/book/deleteBook/${book.bookID}">删除</a>
        </td>
    </tr>
</c:forEach>

</body>
</html>
