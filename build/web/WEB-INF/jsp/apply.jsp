
<%-- 
    Document   : apply
    Created on : Apr 7, 2018, 10:59:36 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/">
        <meta charset="utf-8"/>
        <title>Tiêu đề</title>
    </head>
    <body>
        <p>
        <h3>Thông tin cá nhân</h3>
        <img src="files/${name}">
        <br>
        <h3>${param.fullname}</h3>
    </p>
    <p>
    <h3>Hồ sơ xin việc</h3>
    <ul>
        <li>File Name: ${name}</li>
        <li>File Type: ${type}</li>
        <li>File Size: ${size}</li>
    </ul>
</p>


</body>
</html>
