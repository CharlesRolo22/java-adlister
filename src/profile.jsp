<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Profile</title>
</head>
<body>
<h1>Welcome to your Profile</h1>

<c:set var="username" value="${param.username}" />
<p>Username: ${username}</p>
</body>
</html>


