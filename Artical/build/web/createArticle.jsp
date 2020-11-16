<%-- 
    Document   : create-article
    Created on : Oct 7, 2020, 8:28:01 PM
    Author     : liemn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add new Article</h1>
        <form action="create-article" method="POST">
            Title:<input type="text" name="title" value="" /><br/>
            Description:
            <textarea name="description" rows="10" cols="200">
            </textarea>
            <input type="submit" value="Create">
        </form>
    </body>
</html>
