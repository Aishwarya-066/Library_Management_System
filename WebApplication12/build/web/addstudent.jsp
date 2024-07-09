<%-- 
    Document   : addstudent
    Created on : 4 Jul, 2024, 10:20:06 PM
    Author     : Aishwarya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>     
        <style>
             body{
                background-image:  url("https://wallpapercave.com/wp/wp9473555.jpg");
            background-repeat: no-repeat;
            text-align: center;
            background-size: cover;
           color: white;
            
            }
            </style>
     </head>
    <body>
        <h1>Add student data</h1>
        <form action="http://localhost:8080/WebApplication12/addingstudent" method="post">
            ID: <input type = "text" name = "id">
        <br>
        <br>
        STUDENT NAME: <input type = "text" name = "student_name">
        <br>
        <br>
        EMAIL: <input type = "email" name = "email" />
        <br>
        <br>
        CLASS: <input type = "text" name = "class" />
        <br>
        <br>
        COURSE1: <input type = "text" name = "c1" />
        
        COURSE2: <input type = "text" name = "c2" />
        
        COURSE3: <input type = "text" name = "c3" />
        
        COURSE4: <input type = "text" name = "c4" />
        
        COURSE5: <input type = "text" name = "c5" />
        <br>
        <br>
        GRADE1: <input type = "text" name = "g1" />
        
        GRADE2: <input type = "text" name = "g2" />
        
        GRADE3: <input type = "text" name = "g3" />
       
        GRADE4: <input type = "text" name = "g4" />
        
        GRADE5: <input type = "text" name = "g5" />
        <br>
        <br>
        RESULT1: <input type = "text" name = "r1" />
        
        RESULT2: <input type = "text" name = "r2" />
        
        RESULT3: <input type = "text" name = "r3" />
        
        RESULT4: <input type = "text" name = "r4" />
        
        RESULT5: <input type = "text" name = "r5" />
        <br>
        <br>
         <input type = "submit" value = "Submit" />
      
        </form>
         <% if (request.getParameter("error") != null) { %>
        <p style="color: white;">failed to add.</p>
    <% } %>
    </body>
</html>
