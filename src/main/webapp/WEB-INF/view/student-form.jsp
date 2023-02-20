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
<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br>
    Last name: <form:input path="lastName"/>
    <br>
    Country: <form:select path="country">
    <%--    <form:option value="NL" label="Netherlands"/>--%>
    <%--    <form:option value="DE" label="Germany"/>--%>
    <%--    <form:option value="USA" label="United States of America"/>--%>
    <%--    <form:option value="HK" label="Hong Kong"/>--%>
    <form:options items="${student.countryOptions}"/>
</form:select>
    <br>
    Favorite language:

    Java<form:radiobutton path="favoriteLanguage" value="Java"/>
    C#<form:radiobutton path="favoriteLanguage" value="C#"/>
    PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
    Ruby<form:radiobutton path="favoriteLanguage" value="Ruby"/>
    <br>

    Favorite operating systems:
    Linux<form:checkbox path="operatingSystems" value="Linux"/>
    Windows<form:checkbox path="operatingSystems" value="Windows"/>
    Mac OS<form:checkbox path="operatingSystems" value="Mac"/>
    <br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>