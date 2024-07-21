<%-- 
    Document   : BorrowerDetail
    Created on : 20 Jul, 2024, 8:56:17 PM
    Author     : Aishwarya
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
    <style>
       body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-image: url("https://www.pickthebrain.com/blog/wp-content/uploads/2016/02/book-67049_1280.jpg");
/*            background-repeat: no-repeat;
            background-size: cover;*/
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
     
        #register-form {
            margin: 0;
        }
        .login-form {
            background-color: white;
            padding: 10px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.9);
            max-width: 550px;
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
         <a href="Register.jsp">Register</a>
    </div>
    <br>
    <!--<img src="https://static01.nyt.com/images/2015/10/24/opinion/24manguel/24manguel-superJumbo.jpg" alt="image">-->
    <center>

        <div class="login-form">
            <h1>LOGIN</h1>
            <% 
                String username = request.getParameter("uname");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                boolean hasErrors = false;
                String errorMessage = "";

                Connection c = null;
                PreparedStatement statement = null;
                ResultSet rs = null;

                try {
                    c = DriverManager.getConnection("jdbc:derby://localhost:1527/Library");

                    if ("POST".equalsIgnoreCase(request.getMethod())) {
                        if (username == null || username.trim().isEmpty() || email == null || email.trim().isEmpty() || password == null || password.trim().isEmpty()) {
                            hasErrors = true;
                            errorMessage = "<p class='error'>All fields are required.</p>";
                        }

                        if (!hasErrors) {
                            String sql = "SELECT * FROM login WHERE user_name = ? AND email = ?";
                            statement = c.prepareStatement(sql);
                            statement.setString(1, username);
                            statement.setString(2, email);
                            rs = statement.executeQuery();

                            if (rs.next()) {
                                // User is registered; now check the password
                                String storedPassword = rs.getString("password");
                                if (storedPassword.equals(password)) {
                                    out.println("<p class='success'>Login successful.</p>");
                                    // Redirect to the main page or dashboard
                                    response.sendRedirect("main.jsp");
                                } else {
                                    errorMessage = "<p class='error'>Incorrect password.</p>";
                                }
                            } else {
                                errorMessage = "<p class='error'>Not registered. Please <a href='Register.jsp'>register</a>.</p>";
                            }
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    errorMessage = "<p class='error'>Database error: " + e.getMessage() + "</p>";
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
            %>
            <form id="Login" action="Login.jsp" method="post">
                <%= errorMessage %>
                
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
                <input type="password" id="password" name="password" value="">
                <br><br>
                <input type="submit" value="LOGIN">
            </form>
        </div>
   
    </center>
</body>
</html>
