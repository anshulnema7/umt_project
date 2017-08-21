<%--
    Document   : pop_form
    Created on : 20 Feb, 2014, 2:11:30 PM
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
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="OnePage/OnePageCss.css">
        <link rel="stylesheet" href="OnePage/jquery-ui.css" />
        <link rel="stylesheet" type="text/css" href="OnePage/Mystyle.css">
        <script src="js/jquery-1.8.3.js"></script>
        <script src="js/jquery-ui.js"></script>
        <script type="text/javascript" src="js/Validation.js"></script>
        <script type="text/javascript" src="js/jquery.freezeheader.js"></script>
        <script src="js/excellentexport.js"></script>
        <style>

            .POPReportTable{

                border-collapse:collapse;
                font-family:calibri;
                font-size: small;





            }

            .POPReportTable td {
                border-right: 1px solid #fff;
                border-left: 1px solid #e8e8e8;
                border-top: 1px solid #fff;
                border-bottom: 1px solid #e8e8e8;
                padding: 3px 4px;
                text-align: center;


            }


            .POPReportTable thead tr th
            {
                font-family:calibri;
                background: #AEAEAE;
                color: whitesmoke;
                border-right: 1px solid #fff;
                border-left: 1px solid #e8e8e8;
                border-top: 1px solid #fff;
                border-bottom: 1px solid #e8e8e8;
                padding: 1px 2px;
                position: relative;
                -transition: all 300ms;


            }



            /*  Define the background color for all the ODD background rows  */
            .POPReportTable tr:nth-child(odd){
                background: whitesmoke;
                border-right: 1px solid #fff;


            }
            /*  Define the background color for all the EVEN background rows  */
            .POPReportTable tr:nth-child(even){
                background:#DCDCDC;

            }



        </style>
        <script language="javascript" type="text/javascript">
            $(function() {
                $( "#SearchDate" ).datepicker();
            });
          


            $(document).ready(function() {

                $("#pop_search").click(function(event){
                    var date = $("input#SearchDate").val();
                
                    var status = "Field Service";
                

        

                    document.getElementById('WaitImage').style.display ='block';



                    $.get("GetReport?date="+date+"&status="+status, function(responseJson) {
                        if(responseJson!=null){

                            document.getElementById('WaitImage').style.display ="none";

                            $("#FSreport").find("tr:gt(0)").remove();
                         
                            var table1 = $("#FSreport");
                         
                            var i=0;
                            $.each(responseJson, function(key,value) {


                                var rowNew = $("<tr> <td class=\"hdtab\"></td> <td class=\"hdtab\"></td> <td class=\"hdtab\"></td> <td></td> <td></td> <td class=\"hdtab\"></td> <td></td> <td class=\"hdtab\"></td> <td></td> <td class=\"hdtab\"></td> <td></td> <td></td> <td class=\"hdtab\"></td> <td></td> <td class=\"hdtab\"></td> <td class=\"hdtab\"></td> <td></td> <td class=\"hdtab\"></td> <td class=\"hdtab\"></td> <td class=\"hdtab\"></td> <td></td>  </tr>");

                                rowNew.children().eq(0).text(value['Date']);
                                rowNew.children().eq(1).text(value['Time']);
                                rowNew.children().eq(2).text(value['CRM_ID']);
                                rowNew.children().eq(3).text(value['category']);
                                rowNew.children().eq(4).text(value['request_status']);
                                rowNew.children().eq(5).text(value['Time_of_Email']);
                                rowNew.children().eq(6).text(value['Machine_Serial']);
                                rowNew.children().eq(7).text(value['M_C_Model']);
                                rowNew.children().eq(8).text(value['requested_so_number']);
                                rowNew.children().eq(9).text(value['old_so_vendor']);
                                rowNew.children().eq(10).text(value['reason_for_newSo']);

                                rowNew.children().eq(11).text(value['new_sonumber']);
                                rowNew.children().eq(12).text(value['adp_cid']);
                                rowNew.children().eq(13).text(value['repeat_so']);
                                rowNew.children().eq(14).text(value['total_parts_sent_newso']);
                                rowNew.children().eq(15).text(value['total_so']);
                                rowNew.children().eq(16).text(value['approver']);
                                rowNew.children().eq(17).text(value['ppsn']);
                                rowNew.children().eq(18).text(value['new_vendorso']);
                                rowNew.children().eq(19).text(value['Comment']);
                                rowNew.children().eq(20).text(value['Status']);
                        
                                i++;

                                rowNew.appendTo(table1);



                            });

                            document.getElementById('NumOfRecord').innerHTML='('+i+')';
                        }
                    });

                });
            });



        </script>



        <title>POP Report</title>


    </head>
    <body>

        <input type="hidden" name="CrmID" id="CrmID" value="<%=session.getAttribute("theName")%>" />

        <table border="0" width="95%" align="center" style="margin-top: 10px;">

            <tbody>
                <tr>
                    <td width="10%"><label2>Select Date:&nbsp;</label2></td>
        <td width="10%"><input type="text" id="SearchDate" name="SearchDate" class="form_textbox1"  placeholder="Select Date"  /></td>
      


        <td width="5%"><input type="button" value="Search" class="button_example" id="pop_search" /></td>
        <td></td>
        <td width="11%">
            <a download="POP_Report" onclick="return ExcellentExport.excel(this, 'FSreport', 'FS_Report');">
                <img src="OnePage/excel.ico" width="25" height="25" alt="excel-3-32"/>&nbsp;&nbsp;<label3>Export</label3>
            </a>
        </td>
    </tr>
</tbody>
</table>

<div id = 'WaitImage' style=" display: none; position: absolute;top:50%; right: 49%; ">
    <img src="OnePage/WaitImage31.gif" width="54" height="55" alt="WaitImage31"/>

</div>


<table width="94%" align="center">
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

                                FS Interaction Report &nbsp;<h id="NumOfRecord"></h>

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



<table width="100%" id="FSreport" border="1" class="POPReportTable" align="center" style="margin-top: 0px;  border:solid 2px #EFEFEF;  box-shadow: 0px 2px 2px #888888;background-color: #EFEFEF; ">
    <thead>
        <tr>

            <th scope="col" class="hdtab">Process Date</th>
            <th scope="col" class="hdtab">Process Time</th>
            <th scope="col" class="hdtab">CRM ID</th>
             <th scope="col">Category</th>
             <th scope="col">Request Status</th>
             <th scope="col" class="hdtab">Email Time</th>
             <th scope="col">Serial Number</th>
             <th scope="col" class="hdtab">Model</th>
             <th scope="col">Req SO Number</th>
             <th scope="col" class="hdtab">Old SO Vendor</th>
             <th scope="col">Reason For New SO</th>
             <th scope="col">New SO</th>
             <th scope="col" class="hdtab">ADP/CID</th>
             <th scope="col">Repeat SO</th>
             <th scope="col" class="hdtab">Part In New SO</th>
             <th scope="col" class="hdtab">Total SO</th>
             <th scope="col">Approved By</th>
             <th scope="col" class="hdtab">PPSN</th>
             <th scope="col" class="hdtab">New SO Vendor</th>
             <th scope="col" class="hdtab">Comments</th>
             <th scope="col">Status</th>


        </tr>
    </thead>


</table>
        </td></tr></table>
        
</body>

</html>
