<%-- 
    Document   : studentpage
    Created on : 4 Jul, 2024, 9:43:08 PM
    Author     : Aishwarya
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
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
    </style>
      <script>
        function printMarksheet() {
            window.print();
        }
    </script>
    <body>
         <center>
        <h1>STUDENT DETAILS</h1>
        <form action="marksheet.jsp" method="post">
            ID: <input type = "text" name = "id">
        <br>
        <br>
          <input type = "submit" value = "Submit" />
        </form>
         <%
//           Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/Students");
//         
//           int id = Integer.valueOf(request.getParameter("id"));
//       
//         String sql = "SELECT * FROM student_detail WHERE id = ?";
// 
//PreparedStatement statement = c.prepareStatement(sql);
//statement.setInt(1, id);
//ResultSet rs = statement.executeQuery();
        %>
<!--            <table cellpadding=30px; border="2" style="border-collapse: collapse;">
                    <tr>
                        <th>ID</th>
                        <th>NAME</th>
                        <th>EMAIL</th>
                        <th>CLASS</th>
                    </tr>-->
            <%
//            while(rs.next())
//            {
//                out.println("<tr><td>"+rs.getInt(1)+"</td>");
//                out.println("<td>"+rs.getString(2)+"</td>");
//                out.println("<td>"+rs.getString(3)+"</td>");
//                out.println("<td>"+rs.getString(4)+"</td>");
//                
//               
//            } 
// if (rs.next()) {
//                        out.println("<h2>ID: " + rs.getInt("id") + "</h2>");
//                        out.println("<h2>NAME: " + rs.getString("name") + "</h2>");
//                        out.println("<h2>EMAIL: " + rs.getString("email") + "</h2>");
//                        out.println("<h2>CLASS: " + rs.getString("class") + "</h2>");
//                    } else {
//                        out.println("<h2>No student found with ID: " + id + "</h2>");
//                    }
//               
            
                %> 
<!--                <button onclick="printMarksheet()">Print Marksheet</button>-->
                </center>
           
    </body>
</html>
