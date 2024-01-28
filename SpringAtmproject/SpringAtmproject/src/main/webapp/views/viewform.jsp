<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Balance Page</title>
</head>
<center>
<body bgcolor="pink">

    <h2>Welcome to the Balance Page</h2>

    <p>Account Number: ${authenticatedUser.accountno}</p>
    <p>Name: ${authenticatedUser.name}</p>
    <p>Balance: ${authenticatedUser.ammount}</p>
    <hr/>

    <a href="<c:url value='/a' />">Home</a>

</body>
</center>
</html>
