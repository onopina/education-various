<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<jsp:useBean id="book" scope="request" type="org.springframework.web.servlet.tags.form.AbstractDataBoundFormElementTag"/>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Details</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>Price</th>
    </tr>
    <tr>
        <td>${book.id}</td>
        <td>${book.bookTitle}</td>
        <td>${book.bookAuthor}</td>
        <td>${book.bookPrice}</td>
    </tr>
</table>
<br/>
<a href="<c:url value="/"/>">Back to the Book List</a></td>
</body>
</html>
