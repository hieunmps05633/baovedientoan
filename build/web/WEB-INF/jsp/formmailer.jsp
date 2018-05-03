<%-- 
    Document   : formmailler
    Created on : Apr 8, 2018, 8:51:30 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        ${message}
        <form action="mailer/send.htm" method="post">
            <p><input name="from" placeholder="From"></p>
            <p><input name="to" placeholder="To"></p>
            <p><input name="subject" placeholder="Subject"></p>
            <p><input type="file" name="attach"></p>
            <p><textarea name="body" placeholder="Body" rows="3" cols="30"></textarea></p>
            <button>Send</button>

        </form>
    </body>
</html>
