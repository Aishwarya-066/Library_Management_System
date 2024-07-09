<%-- 
    Document   : admin
    Created on : 4 Jul, 2024, 9:42:45 PM
    Author     : Aishwarya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin page</title>
        <style>
            body{
                background-image:  url("https://wallpapercave.com/wp/wp9473555.jpg");
            background-repeat: no-repeat;
            text-align: center;
            background-size: cover;
           color: white;
            
            }
            a{
                text-decoration: none;
                color: white;
            }
            a:hover{
                color: blanchedalmond;
            }
            div{
                margin: 150px;
                background-color: black;
                
                padding: 50px
            }
            </style>
    </head>
    <body>
        <div>
        <h1>WELCOME TO ADMIN PAGE</h1>
        <a href="addstudent.jsp" > <h1>Add student detail</h1></a>
        <a href="delete.jsp" > <h1>Delete student detail</h1></a>
        <a href="view.jsp" > <h1>View student detail</h1></a>
        <a href="update.jsp" > <h1>Update student detail</h1></a>
        </div>

    </body>
</html>
