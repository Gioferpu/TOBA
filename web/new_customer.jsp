<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>New Customer | Titan Online Banking Application</title>
        <link href="style.css" rel="stylesheet" />
    </head>
    <body>
        <h1>New Account</h1>
    <nav>
        <a href="index.html">Home</a>
        <a href="login.html">Login</a>
        <a href="new_customer.jsp">New Customer</a>
    </nav>
    <%
        if (request.getAttribute("error_message") != null) {
            out.println("<p class='error'>" + request.getAttribute("error_message") + "</p>");
        }
    %>
    <form method="post" action="new_customer">
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
</body>
</html>