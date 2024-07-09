<%-- 
    Document   : update
    Created on : 5 Jul, 2024, 4:20:32 PM
    Author     : Aishwarya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>update</title>
        <style>
              body{
            background-image:  url("https://wallpapercave.com/wp/wp9473555.jpg");
            background-repeat: no-repeat;
            text-align: center;
            background-size: cover;
           color: white;
            
        }
        div{
            margin: 100px;        
        }
        </style>
    </head>
    <body>
        <div>
        <h1>update student mark data</h1>
        <form action="http://localhost:8080/WebApplication12/updatingstudent" method="post">
            ID: <input type = "text" name = "id">
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
        </div>
         <% if (request.getParameter("error") != null) { %>
        <p style="color: white;">updation failed.</p>
    <% } else if(request.getParameter("error") == null){%>
     <p style="color: white;display:none;">updation success.</p>
     <% }%>
    </body>
</html>
