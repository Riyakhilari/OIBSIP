<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login Page</h1>

    <%-- Show error message if authentication failed --%>
    <c:if test="${error}">
        <p style="color: red;">Authentication failed. Please try again.</p>
    </c:if>

    <form method="post" action="/login">
        <label>Email:</label>
        <input type="text" name="email" required/><br/>

        <label>Password:</label>
        <input type="password" name="password" required/><br/>

        <input type="submit" value="Login"/>
    </form>
</body>
</html>
