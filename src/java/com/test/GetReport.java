/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import javax.swing.JOptionPane;

/**
 *
 * @author X220
 */
public class GetReport extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetReport</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GetReport at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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



        String date = request.getParameter("date");
        String status = request.getParameter("status");
        String Rfor = request.getParameter("Rfor");

        ArrayList<CdsGetSet> POPList = new ArrayList<CdsGetSet>();
        try {
            if (status.equals("CC Report") && !Rfor.equals("")) {
                POPList = FetchData.getPopReport(date, status.toString(), Rfor.toString());
            }


            else if(status.equals("POP")) {
                POPList = FetchData.getPopReport(date, status.toString());
            }
                     else if(status.equals("Field Service")) {
                POPList = FetchData.FSInboxSearch(date, status.toString());
            }
            else if(status.equals("SecondSoPart")) {
                String query="select * from lenovo_calltracker_database1 WHERE `Date`='"+date+"' and `FOP` like 'Second SO/Part%'";
                POPList = FetchData.MultiSearchLenooogleInbox(query);
            }


        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GetReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GetReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GetReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        Gson gson = new Gson();
        JsonElement element = gson.toJsonTree(POPList, new TypeToken<List<CdsGetSet>>() {
        }.getType());

        JsonArray jsonArray = element.getAsJsonArray();
        response.setContentType("application/json");
        response.getWriter().print(jsonArray);



    }

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
