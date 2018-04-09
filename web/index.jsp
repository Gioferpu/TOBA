<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.html" %>
<h1>Login</h1>
<nav>
    <a href="index.jsp">Home</a>
    <a href="login">Login</a>
    <a href="new_customer">New Customer</a>
</nav>
<form method="post" action="login">
    <table>
        <tr>
            <th>Username:</th>
            <td><input type="text" name="input_username" /></td>
        </tr>
        <tr>
            <th>Password:</th>
            <td><input type="password" name="input_password" /></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" name="input_login" value="Login" />
                or <a href="password_reset">Reset Password</a>
            </td>
        </tr>
    </table>
</form>
<%@include  file="includes/footer.jsp" %>