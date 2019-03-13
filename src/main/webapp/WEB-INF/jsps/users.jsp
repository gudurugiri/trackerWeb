<%@ page language="java"
contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
 <link rel="stylesheet" href="myweb.css">
  <link rel="stylesheet" href="datatable.css">
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
    <table class="datatable">
      
       <tr>
      <th>first name</th>
      <th>userName</th>
       <th>lname</th>
      <th>dob</th>
       <th>gendar</th>
      <th>phone</th>
       <th>email</th>
       <th>&nbsp;</th>
       <th>&nbsp;</th>
    </tr>
  <c:forEach items="${users}" var="user">
    <tr>
      <td><c:out value="${user.fname}" /></td>
      <td><c:out value="${user.userName}" /></td>
       <td><c:out value="${user.lname}" /></td>
      <td><c:out value="${user.dob}" /></td>
       <td><c:out value="${user.gendar}" /></td>
      <td><c:out value="${user.phone}" /></td>
       <td><c:out value="${user.email}" /></td>
       <td><a href="update/${user.id}">edit</a></td>
       <td><a href="delete/${user.id}">delete</a></td>
    </tr>
  </c:forEach>
</table>
    
</body>
</html>