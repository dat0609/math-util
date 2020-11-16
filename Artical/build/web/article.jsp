<%-- 
    Document   : article
    Created on : Oct 7, 2020, 8:14:03 PM
    Author     : liemn
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .article{
                background-color: #ebed69;

            }
            .description{
                color: red;
            }
        </style>
    </head>
    
    <body>
        <a href="create-article">New Article</a>
        <c:forEach items="${listaArticals}" var="a">
            <div class="article">
                <h3>${a.title}</h3>
                <div class="description">
                    ${a.description}
                </div>
            </div>
        </c:forEach>
    </body>
</html>
