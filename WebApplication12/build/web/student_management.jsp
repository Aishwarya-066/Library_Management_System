<%-- 
    Document   : student_management
    Created on : 4 Jul, 2024, 8:18:57 PM
    Author     : Aishwarya
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: black; color: white"> <center>
        <h1>MOVIES LIST!</h1>
        
   <body>
      
      <form>
         First Name: <input type = "text" name = "first_name">
         <br />
         Last Name: <input type = "text" name = "last_name" />
         <input type = "submit" value = "Submit" />
      </form>
      
   


        <%
//            Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/movies");
//            Statement st=c.createStatement();
//            Statement st1=c.createStatement();
//            Statement st2=c.createStatement();
//            Statement st3=c.createStatement();
//            ResultSet rs = st.executeQuery("Select * from movies");
//            ResultSet rs1 = st1.executeQuery("Select count(movie_id) from movies");
//            ResultSet rs2 = st2.executeQuery("Select avg(price) from movies");
//            ResultSet rs3 = st3.executeQuery("SELECT director FROM movies GROUP BY director ORDER BY avg(rating) DESC FETCH FIRST 1 ROWS ONLY");
             
           
        %>
            <table cellpadding=30px; border="2" style="border-collapse: collapse;">
                    <tr>
                        <th>MOVIE_ID</th>
                        <th>TITLE</th>
                        <th>DIRECTOR</th>
                        <th>RATING</th>
                        <th>PRICE</th>
                    </tr>
            <%
//            while(rs.next())
//            {
//                out.println("<tr><td>"+rs.getInt(1)+"</td>");
//                out.println("<td>"+rs.getString(2)+"</td>");
//                out.println("<td>"+rs.getString(3)+"</td>");
//                out.println("<td>"+rs.getInt(4)+"</td>");
//                out.println("<td>"+rs.getDouble(5)+"</td></tr>");
//               
//            }
//          out.println(" </table><br><br><table cellpadding=30px; border='2' style='border-collapse: collapse;'><tr> <th>TOTAL MOVIES IN LIST</th><th>AVERAGE PRICE IN LIST</th> <th>MAXIMUM RATING DIRECTOR</th></tr>");
//                     rs1.next();
//                     out.println("<tr><td>"+rs1.getInt(1)+"</td>");
//                     rs2.next();
//                     out.println("<td>"+rs2.getDouble(1)+"</td>");
//                     rs3.next();
//                     out.println("<td>"+rs3.getString(1)+"</td></tr>");
//                         
//                      
//                    
                %> 
           
             </table>
             </center>
    </body>
</html>-->

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Front page</title>
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
            margin-top: 150px;
        }
        div a{
            text-decoration: none;
            
        }
        
        </style>
    <body>
        <div>
        <h1>WELCOME TO STUDENT MANAGEMENT</h1>
        <h1>SYSTEM</h1>
        <br>
        <h2>LOGIN</h2>
        
        <form action="http://localhost:8080/WebApplication12/loginservlet" method="post">
            
               <%-- Display error message if error parameter is present --%>
    <% if (request.getParameter("error") != null) { %>
        <p style="color: white;">Invalid username or password. Please try again.</p>
    <% } %>
<!--    ID: <input type = "text" name = "id">
        <br>
        <br>-->
    
        USER NAME: <input type = "text" name = "username">
        <br>
        <br>
        PASSWORD: <input type = "password" name = "password" />
        <br>
        <br>
        ROLE: 
        <select name="role">
            <option value="admin">Admin</option>
            <option value="student">Student</option>
        </select><br>
        <br>
         <input type = "submit" value = "Submit" />
      </form>
      

        
        </div>
    </body>
</html>
