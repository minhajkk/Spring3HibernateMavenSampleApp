<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <style type="text/css">
        .even {
            background-color: silver;
        }
    </style>
    <title>Book Management System</title>
</head>
<body>

<form:form action="add.htm" commandName="book">
    <table>
        <tr>
            <td>Book Name :</td>
            <td><form:input path="name" /></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value="Register"></td>
        </tr>
    </table>
</form:form>
<c:if test="${fn:length(bookList) > 0}">
    <table cellpadding="5">
        <tr class="even">
            <th>Name</th>
        </tr>
        <c:forEach items="${bookList}" var="book" varStatus="status">
            <tr class="<c:if test="${status.count % 2 == 0}">even</c:if>">
                <td>${book.name}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>