<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login</title>
</head>
<body>

<%

    if(request.getMethod().equalsIgnoreCase("post")) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username != null && password != null && username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        } else if (username != null || password != null) {
            response.sendRedirect("/login.jsp");
        }
    }
%>

<h1>Login</h1>

<form action="/login.jsp" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username"><br><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password"><br><br>

    <input type="submit" value="Login">
    <button type="submit">Login</button>
</form>
</body>
</html>

