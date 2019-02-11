/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DLBeans.OrderDL;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luiss
 */
@WebServlet(name = "updateOrders_proc", urlPatterns = {"/updateOrders_proc"})
public class updateOrders_proc extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet updateOrders_proc</title>");            
            out.println("</head>");
            out.println("<body>");
            String numOfOrders = request.getParameter("numOfOrders");
            int oend = Integer.parseInt(numOfOrders);
            boolean flag = false;
            
            for(int i = 1; i <= oend; i++){
                try{                    
                   String orderToUpdate = request.getParameter("update"+i+"");
                   if(orderToUpdate != null){
                       int orderID = Integer.parseInt(orderToUpdate);
                       OrderDL.UpdateOrderStatus(orderID);
                       flag = true;
                   }
                }catch(Exception ex){
                    String bucket = "no";
                }
            }
            if(flag == true){
                response.sendRedirect("EmpManager.jsp?msgUpdate=Successful Update");
            }else{
                response.sendRedirect("EmpManager.jsp?msgUpdate=Check the boxes to update Orders");
            }
            out.println("<h1>Servlet updateOrders_proc at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
