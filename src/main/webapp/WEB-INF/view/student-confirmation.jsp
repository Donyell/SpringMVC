<%--
  Created by IntelliJ IDEA.
  User: donyellmargaret
  Date: 17/02/2023
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Studen…t Confirmation</title>
</head>
<body>
This student is confirmed: ${student.firstName} ${student.lastName} from ${student.country}
<br>
Student's favorite language: ${student.favoriteLanguage}
<br>
Operating systems:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li> Test ${temp} </li>
    </c:forEach>
</ul>
</body>
</html>
