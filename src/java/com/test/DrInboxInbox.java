/*
 * To change this template, choose Tools | Templates
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
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author X220
 */
public class DrInboxInbox extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet POPFilter</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet POPFilter at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        } finally {
            out.close();
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    String query = "select * from lenoogle_db.idea_dr_mode WHERE";

     String date =request.getParameter("date").trim();
     String dateto =request.getParameter("dateto").trim();
     String TeamName =request.getParameter("TeamName").trim();
     String CallCategory  = request.getParameter("CallCategory").trim();
     String Need_to_create  = request.getParameter("Need_to_create").trim();
     
     
     
     
     
     

     ArrayList<CdsGetSet> POPList=new ArrayList<CdsGetSet>();
        try {
            if(!date.equals("")&&!dateto.equals(""))
            {
                query = query+"`Date` between '"+date+"' and '"+dateto+"' ";
            }
            if(!TeamName.equals(""))
            {
                query = query +"and `Team_Manager`='"+TeamName+"' ";
            }

            if(!CallCategory.equals(""))
            {
                query = query +"and `Call_Category`='"+CallCategory+"' ";
            }
            if(!Need_to_create.equals(""))
            {
                 query = query +"and `Need_To_Create`='"+Need_to_create+"' ";
            }
            


POPList = FetchData.MultiSearchLenooogleInboxDRMode(query);



       } catch (ClassNotFoundException ex) {
            Logger.getLogger(DrInboxInbox.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DrInboxInbox.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DrInboxInbox.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DrInboxInbox.class.getName()).log(Level.SEVERE, null, ex);
        }
  Gson gson = new Gson();
  JsonElement element = gson.toJsonTree(POPList, new TypeToken<List<CdsGetSet>>() {}.getType());

  JsonArray jsonArray = element.getAsJsonArray();
  response.setContentType("application/json");
  response.getWriter().print(jsonArray);



    }
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
