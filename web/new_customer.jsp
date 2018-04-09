<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.html" %>
<h1>New Account</h1>
<nav>
    <a href="index.jsp">Home</a>
    <a href="login">Login</a>
    <a href="new_customer">New Customer</a>
</nav>
<form method="post" action="new_customer">
    <p>${message}</p>
    <table>
        <tr>
            <th>First Name:</th>
            <td><input type="text" name="input_first_name" /></td>
        </tr>
        <tr>
            <th>Last Name:</th>
            <td><input type="text" name="input_last_name" /></td>
        </tr>
        <tr>
            <th>Phone:</th>
            <td><input type="text" name="input_phone" /></td>
        </tr>
        <tr>
            <th>Address:</th>
            <td><input type="text" name="input_address" /></td>
        </tr>
        <tr>
            <th>City:</th>
            <td><input type="text" name="input_city" /></td>
        </tr>
        <tr>
            <th>State:</th>
            <td><input type="text" name="input_state" /></td>
        </tr>
        <tr>
            <th>Zip Code:</th>
            <td><input type="text" name="input_zip_code" /></td>
        </tr>
        <tr>
            <th>Email:</th>
            <td><input type="text" name="input_email" /></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" name="input_sign_up" value="Sign Up" /></td>
        </tr>
    </table>
</form>
<%@include file="includes/footer.jsp" %>