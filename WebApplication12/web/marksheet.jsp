<%-- 
    Document   : marksheet
    Created on : 5 Jul, 2024, 9:37:48 PM
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
        /* Add your CSS styling here */
       
        /* Print styles */
        @media print {
            body {
                -webkit-print-color-adjust: exact;
            }
            button {
                display: none; /* Hide print button during printing */
            }
            @page {
                margin: 0; /* Remove margins to avoid unwanted browser headers and footers */
            }
            body {
                margin: 1cm; /* Add margin to avoid content being cut off */
            }
        }
        
         .print-button {
            position: fixed;
            bottom: 10px;
            right: 10px;
        }
    </style>
      <script>
        function printMarksheet() {
            window.print();
        }
    </script>
    </head>
    <body>
    <center>
        <div>
        <%
           Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/Students");
         
           int id = Integer.valueOf(request.getParameter("id"));
       
         String sql = "SELECT * FROM student_detail WHERE id = ?";
 
PreparedStatement statement = c.prepareStatement(sql);
statement.setInt(1, id);
ResultSet rs1 = statement.executeQuery();
if (rs1.next()) {
                        out.println("<h3>ID: " + rs1.getInt("id") + "</h3>");
                        out.println("<h3>NAME: " + rs1.getString("sname") + "</h3>");
                        out.println("<h3>EMAIL: " + rs1.getString("email") + "</h3>");
                        out.println("<h3>CLASS: " + rs1.getString("class") + "</h3>");
                    } else {
                        out.println("<h2>No student found with ID: " + id + "</h2>");
                    }
               

         String sql1 = "SELECT * FROM marks WHERE id = ?";
 
PreparedStatement statement1 = c.prepareStatement(sql1);
statement1.setInt(1, id);
ResultSet rs = statement1.executeQuery();


        %>
        <br>
        <br>
            <table cellpadding=30px; border="2" style="border-collapse: collapse;">
                    <tr>
                        <th>COURSE</th>
                        <th>GRADE</th>
                        <th>RESULT</th>
                    </tr>
            <%
            while(rs.next())
            {
                out.println("<tr><td>"+rs.getString("c1")+"</td>");
                out.println("<td>"+rs.getString("g1")+"</td>");
                out.println("<td>"+rs.getString("r1")+"</td></tr>");
                out.println("<tr><td>"+rs.getString("c2")+"</td>");
                 out.println("<td>"+rs.getString("g2")+"</td>");
                out.println("<td>"+rs.getString("r2")+"</td></tr>");
                out.println("<tr><td>"+rs.getString("c3")+"</td>");
                out.println("<td>"+rs.getString("g3")+"</td>");
                 out.println("<td>"+rs.getString("r3")+"</td></tr>");
                out.println("<tr><td>"+rs.getString("c4")+"</td>");
                out.println("<td>"+rs.getString("g4")+"</td>");
                out.println("<td>"+rs.getString("r4")+"</td></tr>");
                 out.println("<tr><td>"+rs.getString("c5")+"</td>");
                out.println("<td>"+rs.getString("g5")+"</td>");
                out.println("<td>"+rs.getString("r5")+"</td></tr>");
    
            } 
 
            
                %> 
                </div>
            
                 <button class="print-button" onclick="printMarksheet()">Print Marksheet</button>
              </center>

    </body>
</html>
