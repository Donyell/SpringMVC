<%--
  Created by IntelliJ IDEA.
  User: donyellmargaret
  Date: 17/02/2023
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>Spring tag</head>
<body>
<form:form action="processForm" modelAttribute="customer">
    First name: <form:input path="firstName"/>
    <br>
    Last name (*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>