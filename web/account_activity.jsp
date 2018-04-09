<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="user" class="beans.User" scope="session" />
<%@include file="includes/header.html" %>
<h1>Account Activity</h1>
<c:if test="${user != null && user.loggedIn }">
    <nav>
        <a href="#">${user.username}</a>	
        <a href="#">Logout</a>
    </nav>
    <p>Welcome ${user.firstName} ${user.lastName}</p>            
</c:if>
<c:if test="${user == null || !user.loggedIn}">
    <p>Not Logged In</p>
</c:if>
<%@include file="includes/footer.jsp" %>