<%-- 
    Document   : GetReport
    Created on : 30 Apr, 2014, 6:09:54 PM
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

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="OnePage/OnePageCss.css">
        <link rel="stylesheet" href="OnePage/jquery-ui.css" />
        <link rel="stylesheet" type="text/css" href="OnePage/Mystyle.css">
        <script src="js/jquery-1.8.3.js"></script>
        <script src="js/jquery-ui.js"></script>
        <script type="text/javascript" src="js/Validation.js"></script>
        <script type="text/javascript" src="js/jquery.freezeheader.js"></script>
        <script src="js/excellentexport.js"></script>
         <script language="javascript" type="text/javascript">
            $(function() {
                $( "#SearchDate" ).datepicker();
            });
           
function  Getreportfor(str)
{
    if(str=="POP")
    {
        document.getElementById("popdiv").style.display="block";
        document.getElementById("CCDiv").style.display="none";
    }
    else if(str=="CC Report"){
        document.getElementById("popdiv").style.display="none";
        document.getElementById("CCDiv").style.display="block";
        
    }
    else{
       document.getElementById("popdiv").style.display="none";
        document.getElementById("CCDiv").style.display="none"; 
    }
    
}
        

      $(document).ready(function() {
              
        $("#pop_search").click(function(event){
         var date = $("input#SearchDate").val();
        
         var status = "POP";
        

       
        document.getElementById('WaitImage').style.display ='block';
                   
                   
                   
                  $.get("GetReport?date="+date+"&status="+status, function(responseJson) {
                        if(responseJson!=null){
                           
                             document.getElementById('WaitImage').style.display ="none";

                          $("#popreport").find("tr:gt(0)").remove();
                           $("#popreportHidden").find("tr:gt(0)").remove();
                            var table1 = $("#popreport");
                           
                            var i=0;
                            $.each(responseJson, function(key,value) {
                       

         var rowNew = $("<tr> <td></td> <td></td> <td></td> <td></td> <td></td> <td></td> <td></td> <td></td> <td></td></tr>");
         
                        rowNew.children().eq(0).text(value['Time_of_Email']);
                         rowNew.children().eq(1).text(value['Date']);

                        rowNew.children().eq(2).text(value['Email_ID']);
                        rowNew.children().eq(3).text(value['Machine_Serial']);
                        rowNew.children().eq(4).text(value['Purchase_Date']);
                        rowNew.children().eq(5).text(value['ReplyStatus']);
                        rowNew.children().eq(6).text(value['Status']);
                        rowNew.children().eq(7).text(value['Escalated_Status']);
                        rowNew.children().eq(8).text(value['FinalStatus']);
                         i++;
                    
                        rowNew.appendTo(table1);

                            });
                           
                            document.getElementById('NumOfRecord').innerHTML='('+i+')';
                        }
                    });
                   
                });
            });

$(document).ready(function () {
              //  $("#searchresult").freezeHeader({ 'height': '480px','width': '1290px' });
                $("#popreportHidden").freezeHeader({ 'height': '200px','width': '300px' });

            })



          </script>


        
        
        <title>Download Report</title>
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
       

         <table border="0" width="95%" align="center" style="margin-top: 10px;">

                        <tbody>
                            <tr>
                                <td width="10%"><label2>Select Date:&nbsp;</label2></td>
                                <td width="10%"><input type="text" id="SearchDate" name="SearchDate" class="form_textbox1"  placeholder="Select Date"  /></td>
                              
                               <td width="5%"><input type="button" value="Search" class="button_example" id="pop_search" /></td>
                                <td></td>
                                <td width="11%">
                                    <a download="POP_Report" onclick="return ExcellentExport.excel(this, 'popreportHidden', 'POP_Report');">
                            <img src="OnePage/excel.ico" width="25" height="25" alt="excel-3-32"/>&nbsp;&nbsp;<label3>Export</label3>
                                    </a>
                                </td>
                            </tr>
                        </tbody>
                    </table>

         <div id = 'WaitImage' style=" display: none; position: absolute;top:50%; right: 49%; ">
              <img src="OnePage/WaitImage31.gif" width="54" height="55" alt="WaitImage31"/>

           </div>


            <table width="95%" align="center">
                <tr>
                    <td>
                        <div style="position: relative; height: 25px !important; overflow: visible;">
                            <div style="z-index: 999; position: absolute; float: left; left: -22px;">

                                <img src="OnePage/header_left.png"></img>

                            </div>
                            <table width="100%" cellspacing="0" cellpadding="0" border="0">

                                <tbody>
                                    <tr>
                                        <th id="smallHeaderText" class="basicHeaderText_wj">

                                       Report &nbsp;<h id="NumOfRecord"></h>

                                        </th>
                                        <td class="basicHeaderSlope_wj" style="min-width:20px;">
                                            <div style="width: 20px; display: block;"></div>
                                        </td>
                                        <td id="smallHeaderTrail" class="basicHeaderTrail_wj"></td>
                                    </tr>
                                </tbody>
                            </table>
                            <div style="z-index: 999; position: absolute; float: right; top: 0pt; left: 100%">
                                <img src="OnePage/header_right.png"/>
                            </div>
                        </div>
                    </td></tr>
                <tr><td>
                        <div id="popdiv" style="display: none;">
        <table width="100%" id="popreport" border="1" class="POPReportTable" align="center" style="margin-top: 0px;  border:solid 2px #EFEFEF;  box-shadow: 0px 2px 2px #888888;background-color: #EFEFEF; ">
                    <thead>
                    <tr>
 <th scope="col">Email Received</th>
 <th scope="col">Reply On</th>
 <th scope="col">Email ID</th>
 <th scope="col">Machine SN</th>
 <th scope="col">Purchase Date</th>
 <th scope="col">Reply Status</th>
 <th scope="col">Status</th>
 <th scope="col">Escalated Status</th>
 <th scope="col">Final Status</th>

</tr>
  </thead>
 </table>
 </div>
                        
                        <div  id="CCDiv" style="display: none;">
                        <table width="100%" id="CCRepoTable" class="POPReportTable" align="center" style="margin-top: 0px;  border:solid 2px #EFEFEF;  box-shadow: 0px 2px 2px #888888;background-color: #EFEFEF;">
                            <thead>
                                <tr>
 <th scope="col">Process Date</th>
 <th scope="col">Process Time</th>
 <th scope="col">EMP CRM ID</th>
 <th scope="col">Time Of Mail</th>
 <th scope="col">Email ID</th>
 <th scope="col">Machine Model</th>
 <th scope="col">MTM</th>
 <th scope="col">Machine Serial</th>
 <th scope="col">Manufacturing Date</th>
 <th scope="col">Purchase Date</th>
 <th scope="col">Request Type</th>
 <th scope="col">Reply Status</th>
 <th scope="col">Status</th>
 <th scope="col">Reason Of Rejection</th>
 <th scope="col">Escalated Status</th>
 <th scope="col">Final Status</th>
 
 <th scope="col">Comment If Any</th>
                                </tr>
                            </thead>
                        </table>
                        
                    </div>
                        
                        
                        
                        
                        
                        
                    </td></tr>
            </table>

 
  </div>

    </body>
</html>
