<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" class="beans.User" scope="session" />
<%@include file="includes/header.html" %>
<h1>Account Created!</h1>
<nav>
    <a href="index.jsp">Home</a>
    <a href="login">Login</a>
    <a href="new_customer">New Customer</a>
</nav>
<p>Your new account has been successfully created.</p>
<table>
    <tr>
        <td><strong>Username</strong></td>
        <td>${user.username}</td>
    </tr>
    <tr>
        <td><strong>Password</strong></td>
        <td>${user.password}</td>
    </tr>
    <tr>
        <td><strong>Name</strong></td>
        <td>${user.firstName} ${user.lastName}</td>
    </tr>
    <tr>
        <td><strong>Contact</strong></td>
        <td>${user.phone} or ${user.email}</td>
    </tr>
    <tr>
        <td><strong>Address</strong></td>
        <td>${user.address}, ${user.city}, ${user.state} ${user.zipCode}</td>
    </tr>
</table>
<%@include file="includes/footer.jsp" %>