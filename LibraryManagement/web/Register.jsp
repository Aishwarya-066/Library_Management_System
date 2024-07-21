<%-- 
    Document   : Register
    Created on : 20 Jul, 2023, 6:45:58 PM
    Author     : Aishwarya
--%>


<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Register</title>
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
        .register-form {
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
    </style>
</head>
<body>
    <div class="header">
        <h1>LMS</h1>
         <a href="Login.jsp">Login</a>
    </div>
    <br>
<center>
        <div class="register-form">
            <h1>REGISTER</h1>
            <%
                boolean hasErrors = false;
                StringBuilder errors = new StringBuilder();
                Connection c = null;
                PreparedStatement statement = null;

                try {
                    c = DriverManager.getConnection("jdbc:derby://localhost:1527/Library");

                    String name = request.getParameter("uname");
                    String email = request.getParameter("email");
                    String password = request.getParameter("password");
                    String confirmPassword = request.getParameter("cpassword");
                    int id = -1;

                    if ("POST".equalsIgnoreCase(request.getMethod())) {
                        // Validate ID
                        String idParam = request.getParameter("id");
                        try {
                            id = Integer.parseInt(idParam);
                        } catch (NumberFormatException e) {
                            hasErrors = true;
                            errors.append("<p class='error'>Invalid ID format.</p>");
                        }

                        // Validate other inputs
                        if (name == null || name.trim().isEmpty()) {
                            hasErrors = true;
                            errors.append("<p class='error'>Name is required.</p>");
                        }
                        if (email == null || email.trim().isEmpty()) {
                            hasErrors = true;
                            errors.append("<p class='error'>Email is required.</p>");
                        } else if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                            hasErrors = true;
                            errors.append("<p class='error'>Invalid email format.</p>");
                        }
                        if (password == null || password.trim().isEmpty()) {
                            hasErrors = true;
                            errors.append("<p class='error'>Password is required.</p>");
                        } else if (!password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")) {
                            hasErrors = true;
                            errors.append("<p class='error'>Password must contain at least one uppercase letter, one number, and one special character.</p>");
                        }
                        if (confirmPassword == null || confirmPassword.trim().isEmpty()) {
                            hasErrors = true;
                            errors.append("<p class='error'>Confirm Password is required.</p>");
                        } else if (!password.equals(confirmPassword)) {
                            hasErrors = true;
                            errors.append("<p class='error'>Passwords do not match.</p>");
                        }

                        if (!hasErrors) {
                            String sql = "INSERT INTO login (user_id, user_name, password, email) VALUES (?, ?, ?, ?)";
                            statement = c.prepareStatement(sql);
                            statement.setInt(1, id);
                            statement.setString(2, name);
                            statement.setString(3, password);
                            statement.setString(4, email);

                            int rowsInserted = statement.executeUpdate();
                            if (rowsInserted > 0) {
                                out.println("<p class='success'>Registration successful.</p>");
                                name = "";
                                email = "";
                                password = "";
                                confirmPassword = "";
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
            <form id="registerForm" method="post" action="Register.jsp">
                <%= errors.toString() %>
                
                <label for="uname">ENTER YOUR NAME</label>
                <input type="text" id="uname" name="uname" value="">
                <br><br>
                <label for="id">ENTER YOUR ID</label>
                <input type="text" id="id" name="id" value="">
                <br><br>
                <label for="email">ENTER YOUR EMAIL</label>
                <input type="email" id="email" name="email" value="">
                <br><br>
                <label for="password">PASSWORD</label>
                <input type="password" id="password" name="password">
                <br><br>
                <label for="cpassword">CONFIRM PASSWORD</label>
                <input type="password" id="cpassword" name="cpassword">
                <br><br>
                <input type="submit" value="Register">
            </form>
        </div>
    </center>
</body>
</html>
