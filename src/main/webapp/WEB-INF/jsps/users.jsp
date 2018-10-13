<%@ page language="java"
contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<style>
table td{
vertical-align:top;
border:solid 1px #888;
padding:10px;
}
</style>
</head>
<body>
    <h1>Users </h1>
    <table>
       <table>
  <c:forEach items="${users}" var="user">
    <tr>
      <td><c:out value="${user.fname}" /></td>
      <td><c:out value="${user.userName}" /></td>
    </tr>
  </c:forEach>
</table>
    </table>
</body>
</html>