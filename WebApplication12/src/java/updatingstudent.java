/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aishwarya
 */
@WebServlet(urlPatterns = {"/updatingstudent"})
public class updatingstudent extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
         int id = Integer.parseInt(request.getParameter("id"));
          String c1 = request.getParameter("c1");
        String c2 = request.getParameter("c2");
        String c3 = request.getParameter("c3");
        String c4 = request.getParameter("c4");
        String c5 = request.getParameter("c5");

       String g1 = request.getParameter("g1");
        String g2 = request.getParameter("g2");
        String g3 = request.getParameter("g3");
        String g4 = request.getParameter("g4");
        String g5 = request.getParameter("g5");
        
        String r1 = request.getParameter("r1");
        String r2 = request.getParameter("r2");
        String r3 = request.getParameter("r3");
        String r4 = request.getParameter("r4");
        String r5 = request.getParameter("r5");
        
       
            // JDBC Connection
            //Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/Students");
            String sql1 = "UPDATE marks SET c1=?, g1=?, r1=?, c2=?, g2=?, r2=?, c3=?, g3=?, r3=?, c4=?, g4=?, r4=?, c5=?, g5=?, r5=? WHERE id = ?";
 
PreparedStatement statement1 = c.prepareStatement(sql1);

statement1.setString(1, c1);
statement1.setString(2, g1);
statement1.setString(3, r1);
statement1.setString(4, c2);
statement1.setString(5, g2);
statement1.setString(6, r2);
statement1.setString(7, c3);
statement1.setString(8, g3);
statement1.setString(9, r3);
statement1.setString(10, c4);
statement1.setString(11, g4);
statement1.setString(12, r4);
statement1.setString(13, c5);
statement1.setString(14, g5);
statement1.setString(15, r5);
statement1.setInt(16, id);
int rowsInserted1 = statement1.executeUpdate();
String redirect = "update.jsp";
  if(rowsInserted1 != 1){
    redirect = "update.jsp?error=1";
  }

        response.sendRedirect(redirect);
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet updatingstudent</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet updatingstudent at " + request.getContextPath() + "</h1>");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(addingstudent.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(updatingstudent.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
