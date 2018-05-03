<%-- 
    Document   : index
    Created on : Apr 7, 2018, 10:00:42 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <style>
            .form-group{margin: 10px;}
        </style>
        <form>  
            <div class="form-group">

        <div>Username</div>
        <input name="id" value="${user.username}"/>
         <div>Password</div>
         <input name="password" value="${user.password}"/>
            </div>
             <div class="form-group">
         <button>Login</button>
             </div>
        </form>
    </body>
</html>
