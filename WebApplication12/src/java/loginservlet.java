/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aishwarya
 */
@WebServlet(urlPatterns = {"/loginservlet"})
public class loginservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
     
        boolean isValidUser = false;
        String redirect = "login.jsp";
         try {
            // JDBC Connection
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Students");
            PreparedStatement pstmt = con.prepareStatement("select * from login where name=? and password=? and role=?");
            
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, role);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                isValidUser = true;
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        if (isValidUser) {
            if (role.equals("admin")) {
                redirect = "admin.jsp";
            } else if (role.equals("student")) {
                redirect = "studentpage.jsp";
            }
        } else {
            redirect = "student_management.jsp?error=1";
        }

        response.sendRedirect(redirect);
//         RequestDispatcher dispatcher = request.getRequestDispatcher(redirect);
//        dispatcher.forward(request, response);
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet loginservlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet loginservlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
