<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1><%= "Hello World!" %></h1>
    <br/>
    <form action="/servlet/context1" method="post">
        <input type="submit" value="上传">
    </form>
</body>
</html>