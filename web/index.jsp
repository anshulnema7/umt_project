<%-- 
    Document   : index
    Created on : 30 Apr, 2014, 6:03:02 PM
    Author     : X220
--%>
<%@page import="java.lang.String"%>
<%@ page import="java.sql.*" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.test.*" %>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="OnePage/OnePageCss.css">
        <link rel="stylesheet" href="OnePage/jquery-ui.css" />
        <link rel="stylesheet" type="text/css" href="OnePage/Mystyle.css">
        <script src="js/jquery-1.8.3.js"></script>
        <script src="js/jquery-ui.js"></script>
        <script type="text/javascript" src="js/Validation.js"></script>
        <script type="text/javascript" src="js/jquery.freezeheader.js"></script>
        <script src="js/excellentexport.js"></script>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Report Home</title>
    </head>
    <body>
         <div class="div_backgrndimg"></div>
  <div class="header-band">
              <div class="logo">
                <table width="800" border="0" cellspacing="0" cellpadding="0">
                    <tbody>
                        <tr>
                            <td>
                               <img src="css/lenovo-for-those-who-do-logo.png" width="440" height="65" alt="lenovo-for-those-who-do-logo"/>
                            </td>
                            <td></td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
              </div>
         <h1><a href="DrModeInbox.jsp">DR Mode Inbox</a></h1><br/>
        <h1><a href="PopRepo.jsp">POP</a></h1><br/>
         <h1><a href="LenoogleRepo.jsp">CC Report</a></h1><br/>
          <h1><a href="FsRepo.jsp">FS Report</a></h1><br/>
           <h1><a href="SecondSoReport.jsp">Second SO</a></h1><br/>
            <h1><a href="LenoogleInbox.jsp">Lenoogle Inbox</a></h1><br/>
          
  </div>
    </body>
</html>
