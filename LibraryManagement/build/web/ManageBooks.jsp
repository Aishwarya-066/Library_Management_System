<%-- 
    Document   : AddBooks
    Created on : 20 Jul, 2024, 10:58:55 PM
    Author     : Aishwarya
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Manage Books</title>
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
        .manage-form {
            background-color: white;
            padding: 10px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.9);
            max-width: 800px;
            text-align: center;
        }
        form h2 {
            margin-bottom: 20px;
            font-size: 24px;
        }
        h1 {
            margin-bottom: 50px;
        }
        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
        }
        input, textarea {
            width: 60%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        input:focus, textarea:focus {
            border-color: #007BFF;
            outline: none;
        }
        input[type="submit"] {
            width: 50%;
            margin: 40px;
            padding: 10px;
            border: none;
            border-radius: 5px;
            background-color: #007BFF;
            color: #fff;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        .error {
            color: red;
            font-weight: bold;
            margin-bottom: 10px;
        }
        .success {
            color: green;
            font-weight: bold;
            margin-bottom: 10px;
        }
        .buttons {
            display: flex;
            justify-content: center;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="header">
        <h1>LMS</h1>
        <a href="main.jsp">Home</a>
        <a href="ViewBooks.jsp">View Books</a>
        <a href="viewtransaction.jsp">View Transaction</a>
        <a href="Login.jsp">Log Out</a>
    </div>

    <br>
    <center>
        <div class="manage-form">
            <h1>MANAGE BOOKS</h1>
            <%
                boolean hasErrors = false;
                StringBuilder errors = new StringBuilder();
                Connection c = null;
                PreparedStatement statement = null;

                try {
                    c = DriverManager.getConnection("jdbc:derby://localhost:1527/Library");

                    String bid = request.getParameter("bid");
                    String bname = request.getParameter("bname");
                    String aname = request.getParameter("aname");
                    String genre = request.getParameter("genre");
                    String isbn = request.getParameter("isbn");
                    String publisher = request.getParameter("publisher");
                    String pyear = request.getParameter("pyear");

                    String action = request.getParameter("action");

                    if ("POST".equalsIgnoreCase(request.getMethod())) {
                        // Validate inputs
                        if (bid == null || bid.trim().isEmpty()) {
                            hasErrors = true;
                            errors.append("<p class='error'>Book ID is required.</p>");
                        }
                        if (bname == null || bname.trim().isEmpty()) {
                            hasErrors = true;
                            errors.append("<p class='error'>Book Name is required.</p>");
                        }
                        if (aname == null || aname.trim().isEmpty()) {
                            hasErrors = true;
                            errors.append("<p class='error'>Author Name is required.</p>");
                        }
                        if (genre == null || genre.trim().isEmpty()) {
                            hasErrors = true;
                            errors.append("<p class='error'>Genre is required.</p>");
                        }
                        if (isbn == null || isbn.trim().isEmpty()) {
                            hasErrors = true;
                            errors.append("<p class='error'>ISBN is required.</p>");
                        }
                        if (publisher == null || publisher.trim().isEmpty()) {
                            hasErrors = true;
                            errors.append("<p class='error'>Publisher is required.</p>");
                        }
                        if (pyear == null || pyear.trim().isEmpty()) {
                            hasErrors = true;
                            errors.append("<p class='error'>Year of Publishing is required.</p>");
                        }

                        if (!hasErrors) {
                            if ("Add Books".equals(action)) {
                                String sql = "INSERT INTO book_detail (bookname, author, genre, isbn, publisher, year_published, bookid) VALUES (?, ?, ?, ?, ?, ?, ?)";
                                statement = c.prepareStatement(sql);
                               
                                statement.setString(1, bname);
                                statement.setString(2, aname);
                                statement.setString(3, genre);
                                statement.setString(4, isbn);
                                statement.setString(5, publisher);
                                statement.setString(6, pyear);
                                statement.setString(7, bid);

                                int rowsInserted = statement.executeUpdate();
                                if (rowsInserted > 0) {
                                    out.println("<p class='success'>Book added successfully.</p>");
                                }
                            } else if ("Update Books".equals(action)) {
                                String sql = "UPDATE book_detail SET bookname = ?, author = ?, genre = ?, isbn = ?, publisher = ?, year_published = ? WHERE bookid = ?";
                                statement = c.prepareStatement(sql);
                                statement.setString(1, bname);
                                statement.setString(2, aname);
                                statement.setString(3, genre);
                                statement.setString(4, isbn);
                                statement.setString(5, publisher);
                                statement.setString(6, pyear);
                                statement.setString(7, bid);

                                int rowsUpdated = statement.executeUpdate();
                                if (rowsUpdated > 0) {
                                    out.println("<p class='success'>Book updated successfully.</p>");
                                } else {
                                    sql = "INSERT INTO book_detail (book_id, book_name, author_name, genre, isbn, publisher, publish_year) VALUES (?, ?, ?, ?, ?, ?, ?)";
                                    statement = c.prepareStatement(sql);
                                    statement.setString(1, bid);
                                    statement.setString(2, bname);
                                    statement.setString(3, aname);
                                    statement.setString(4, genre);
                                    statement.setString(5, isbn);
                                    statement.setString(6, publisher);
                                    statement.setString(7, pyear);

                                    int rowsInserted = statement.executeUpdate();
                                    if (rowsInserted > 0) {
                                        out.println("<p class='success'>Book added successfully.</p>");
                                    }
                                }
                            }
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    errors.append("<p class='error'>Database error: " + e.getMessage() + "</p>");
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
            %>
            <form id="manageForm" method="post" action="ManageBooks.jsp">
                <%= errors.toString() %>
                
                <label for="bid">ENTER BOOK ID</label>
                <input type="text" id="bid" name="bid" value="">
                <br><br>
                <label for="bname">ENTER BOOK NAME</label>
                <input type="text" id="bname" name="bname" value="">
                <br><br>
                <label for="aname">ENTER AUTHOR NAME</label>
                <input type="text" id="aname" name="aname" value="">
                <br><br>
                <label for="genre">ENTER GENRE</label>
                <input type="text" id="genre" name="genre">
                <br><br>
                <label for="isbn">ENTER ISBN</label>
                <input type="text" id="isbn" name="isbn">
                <br><br>
                <label for="publisher">ENTER PUBLISHER</label>
                <input type="text" id="publisher" name="publisher">
                <br><br>
                <label for="pyear">ENTER YEAR OF PUBLISHING</label>
                <input type="text" id="pyear" name="pyear">
                <br><br>
                <div class="buttons">
                    <input type="submit" name="action" value="Add Books">
                    <input type="submit" name="action" value="Update Books">
                </div>
            </form>
        </div>
    </center>
</body>
</html>
