<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:requestEncoding />


<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Book List</h1>

<c:if test="${!empty allBooks}">
    <table>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Price</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <jsp:useBean id="allBooks" scope="request" type="java.util.List"/>
        <c:forEach var="book" items="${allBooks}">
            <tr>
                <td>${book.id}</td>
                <td><a href="<c:url value="/bookinfo/${book.id}"/>" target="_blank">${book.bookTitle}</a></td>
                <td>${book.bookAuthor}</td>
                <td>${book.bookPrice}</td>
                <td><a href="<c:url value="/edit/${book.id}"/>">Edit</a></td>
                <td><a href="<c:url value="/remove/${book.id}"/>">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<h1>Add a Book</h1>

<c:url var="addAction" value="/add"/>
<%--@elvariable id="book" type=""--%>
<form:form action="${addAction}" modelAttribute="book">
<%--<form:form action="add" modelAttribute="book">--%>

    <form:hidden path="id"/>

    Title <form:input path="bookTitle"/>
    <br/><br/>
    Author <form:input path="bookAuthor"/>
    <br/><br/>
    Price <form:input path="bookPrice"/>
    <br/><br/>
    <c:if test="${!empty book.bookTitle}">
        <input type="submit" value="Edit Book">
    </c:if>
    <br/>
    <c:if test="${empty book.bookTitle}">
        <input type="submit" value="Add Book">
    </c:if>
    <br/><br/>
</form:form>

</body>
</html>
