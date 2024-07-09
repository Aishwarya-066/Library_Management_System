<%-- 
    Document   : view
    Created on : 5 Jul, 2024, 3:54:03 PM
    Author     : Aishwarya
--%>

<%@page import="java.sql.*"%>
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
        <center>
        <h1>STUDENT DETAILS</h1>
         <%
           Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/Students");
          Statement st=c.createStatement();
          
            ResultSet rs = st.executeQuery("Select * from student_detail");
            
             
           
        %>
            <table cellpadding=30px; border="2" style="border-collapse: collapse;background-color: black">
                    <tr>
                        <th>ID</th>
                        <th>NAME</th>
                        <th>EMAIL</th>
                        <th>CLASS</th>
                    </tr>
            <%
            while(rs.next())
            {
                out.println("<tr><td>"+rs.getInt(1)+"</td>");
                out.println("<td>"+rs.getString(2)+"</td>");
                out.println("<td>"+rs.getString(3)+"</td>");
                out.println("<td>"+rs.getString(4)+"</td>");
                
               
            } 
                %> 
                </center>
           
    </body>
</html>
