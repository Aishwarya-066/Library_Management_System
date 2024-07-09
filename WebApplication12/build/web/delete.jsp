<%-- 
    Document   : delete
    Created on : 5 Jul, 2024, 3:10:18 PM
    Author     : Aishwarya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <style>
             body{
                background-image:  url("https://wallpapercave.com/wp/wp9473555.jpg");
            background-repeat: no-repeat;
            text-align: center;
            background-size: cover;
           color: white;
            }
            
            div{
                margin:250px;
            }
            </style>
    <body>
        <div>
        <h1>DELETE THE STUDENT DETAILS</h1>
        <form action="http://localhost:8080/WebApplication12/deletestudent" method="post">
            ID: <input type = "text" name = "id">
        <br>
        <br>
        <input type = "submit" value = "Submit" />
        </form>
         <% if (request.getParameter("error") != null) { %>
        <p style="color: white;">failed to delete.</p>
    <% } %>
        </div>
    </body>
</html>
