<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" class="beans.User" scope="session" />
<%@include file="includes/header.html" %>
<h1>Password Reset</h1>
<nav>
    <a href="index.jsp">Home</a>
    <a href="login">Login</a>
    <a href="new_customer">New Customer</a>
</nav>
<form method="post" action="password_reset">
    <p>${message}</p>
    <table>
        <tr>
            <th>Username:</th>
            <td><input type="text" name="input_username" /></td>
        </tr>
        <tr>
            <th>New Password:</th>
            <td><input type="password" name="input_password" /></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" name="input_reset" value="Reset Password" />
            </td>
        </tr>
    </table>
</form>
<%@include file="includes/footer.jsp" %>