<%-- 
    Document   : ViewBooks
    Created on : 20 Jul, 2024, 10:58:42 PM
    Author     : Aishwarya
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>View Books</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
          background-image: url("https://www.pickthebrain.com/blog/wp-content/uploads/2016/02/book-67049_1280.jpg");
            background-color: whitesmoke;
            align-items: center;
        }
        .header {
            background-color: #333;
            color: white;
            padding: 15px;
            display: flex;
            align-items: center;
            justify-content: space-between;
        }
        .header h1 {
            margin: 0;
        }
        .header a {
            color: white;
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 5px;
            transition: background-color 0.3s, color 0.3s;
        }
        .header a:hover {
            background-color: #555;
            color: whitesmoke;
        }
        .search-form {
            margin: 20px;
            text-align: center;
        }
        .search-form input[type="text"] {
            width: 60%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        .search-form input[type="submit"] {
            padding: 10px;
            border: none;
            border-radius: 5px;
            background-color: #007BFF;
            color: #fff;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        .search-form input[type="submit"]:hover {
            background-color: #0056b3;
        }
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: white;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: center;
        }
        th {
            background-color: #f4f4f4;
        }
        .delete-button {
            color: red;
            border: none;
            background: none;
            cursor: pointer;
        }
        .delete-button:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="header">
        <h1>LMS</h1>
        <a href="main.jsp">Home</a>
        <a href="ManageBooks.jsp">Manage Books</a>
        <a href="viewtransaction.jsp">View Transaction</a>
        <a href="Login.jsp">Log Out</a>
    </div>

    <center>
        <div class="search-form">
            <form method="get" action="ViewBooks.jsp">
                <input type="text" name="search" placeholder="Search by book name or author" value="<%= request.getParameter("search") != null ? request.getParameter("search") : "" %>">
                <input type="submit" value="Search">
            </form>
        </div>

        <table>
            <thead>
                <tr>
                    <th>Book ID</th>
                    <th>Book Name</th>
                    <th>Author Name</th>
                    <th>Genre</th>
                    <th>ISBN</th>
                    <th>Publisher</th>
                    <th>Publish Year</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <%
                    Connection c = null;
                    PreparedStatement statement = null;
                    ResultSet rs = null;
                    String searchQuery = request.getParameter("search");
                    String sql = "SELECT * FROM book_detail";

                    if (searchQuery != null && !searchQuery.trim().isEmpty()) {
                        sql += " WHERE bookname LIKE ? OR author LIKE ?";
                    }

                    try {
                        c = DriverManager.getConnection("jdbc:derby://localhost:1527/Library");
                        statement = c.prepareStatement(sql);

                        if (searchQuery != null && !searchQuery.trim().isEmpty()) {
                            statement.setString(1, "%" + searchQuery + "%");
                            statement.setString(2, "%" + searchQuery + "%");
                        }

                        rs = statement.executeQuery();

                        while (rs.next()) {
                            String bookId = rs.getString("bookid");
                            String bookName = rs.getString("bookname");
                            String authorName = rs.getString("author");
                            String genre = rs.getString("genre");
                            String isbn = rs.getString("isbn");
                            String publisher = rs.getString("publisher");
                            String publishYear = rs.getString("year_published");
                %>
                <tr>
                    <td><%= bookId %></td>
                    <td><%= bookName %></td>
                    <td><%= authorName %></td>
                    <td><%= genre %></td>
                    <td><%= isbn %></td>
                    <td><%= publisher %></td>
                    <td><%= publishYear %></td>
                    <td>
                        <form method="post" action="ViewBooks.jsp" style="display:inline;">
                            <input type="hidden" name="deleteId" value="<%= bookId %>">
                            <button type="submit" class="delete-button">Delete</button>
                        </form>
                    </td>
                </tr>
                <%      } %>
            </tbody>
        </table>
        <%
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Clean up resources
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (c != null) {
                    try {
                        c.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            // Handle delete request
            String deleteId = request.getParameter("deleteId");
            if (deleteId != null) {
                try {
                    c = DriverManager.getConnection("jdbc:derby://localhost:1527/Library");
                    String deleteSql = "DELETE FROM book_detail WHERE bookid = ?";
                    statement = c.prepareStatement(deleteSql);
                    statement.setString(1, deleteId);
                    int rowsDeleted = statement.executeUpdate();
                    if (rowsDeleted > 0) {
                        out.println("<p class='success'>Book deleted successfully.</p>");
                        response.sendRedirect("ViewBooks.jsp"); // Refresh the page to reflect changes
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    // Clean up resources
                    if (statement != null) {
                        try {
                            statement.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                    if (c != null) {
                        try {
                            c.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        %>
    </center>
</body>
</html>
