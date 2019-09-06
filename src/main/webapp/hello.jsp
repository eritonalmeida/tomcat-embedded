<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${message}</h1>
        <c:set var="Date" value="<%=new java.util.Date()%>" />  
        <p>
            Formatted Time :  
            <fmt:formatDate type="time" value="${Date}" />  
        </p>  
    </body>
</html>