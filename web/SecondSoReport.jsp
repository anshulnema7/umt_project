<%--
    Document   : pop_form
    Created on : 23 April, 2014, 2:11:30 PM
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
                    var status="SecondSoPart";
                    var Rfor = "";
                   
             //   alert(status);


                    document.getElementById('WaitImage').style.display ='block';



                    $.get("GetReport?date="+date+"&status="+status+"&Rfor="+Rfor, function(responseJson) {
                        if(responseJson!=null){

                            document.getElementById('WaitImage').style.display ="none";

                            $("#FSreport").find("tr:gt(0)").remove();

                            var table1 = $("#FSreport");

                            var i=0;
                            $.each(responseJson, function(key,value) {


                                var rowNew = $("<tr> <td></td> <td class=\"hdtab\"></td> <td class=\"hdtab\"></td> <td></td> <td class=\"hdtab\"></td> <td class=\"hdtab\"></td> <td class=\"hdtab\"></td> <td></td> <td></td> <td class=\"hdtab\"></td> <td class=\"hdtab\"></td> <td class=\"hdtab\"></td> <td></td> <td class=\"hdtab\"></td> <td class=\"hdtab\"></td> <td></td> <td></td> <td></td> <td class=\"hdtab\"></td> <td></td> <td></td> <td></td> <td></td> <td class=\"hdtab\"></td> <td class=\"hdtab\"></td> <td></td> <td></td> <td></td> <td></td>  </tr>");

                                rowNew.children().eq(0).text(value['Date']);
                                rowNew.children().eq(1).text(value['Time']);
                                rowNew.children().eq(2).text(value['TYPE']);
                                rowNew.children().eq(3).text(value['category']);
                                rowNew.children().eq(4).text(value['CRM_ID']);
                                rowNew.children().eq(5).text(value['TM']);
                                rowNew.children().eq(6).text(value['ccContactedBy']);
                                rowNew.children().eq(7).text(value['serialNumber']);
                                rowNew.children().eq(8).text(value['contactNumber']);
                                rowNew.children().eq(9).text(value['EmpID']);
                                rowNew.children().eq(10).text(value['warrantyStatus']);
                                rowNew.children().eq(11).text(value['WDuration']);
                                rowNew.children().eq(12).text(value['issue']);
                                rowNew.children().eq(13).text(value['SecondIssue']);
                                rowNew.children().eq(14).text(value['ThirdIssue']);
                                rowNew.children().eq(15).text(value['Status']);
                                rowNew.children().eq(16).text(value['SR_NBR']);
                                rowNew.children().eq(17).text(value['fop']);
                                rowNew.children().eq(18).text(value['poptechnicalcall']);
                                rowNew.children().eq(19).text(value['focNeeded']);
                                rowNew.children().eq(20).text(value['serviceType']);
                                rowNew.children().eq(21).text(value['partNumber']);
                                rowNew.children().eq(22).text(value['satDsat']);
                                rowNew.children().eq(23).text(value['Red_Flag']);
                                rowNew.children().eq(24).text(value['lmgrName']);
                                rowNew.children().eq(25).text(value['Follow_Up']);
                                rowNew.children().eq(26).text(value['Follow_Up_Date']);

                                
                                rowNew.children().eq(27).text(value['Comment']);
                                rowNew.children().eq(28).text(value['callCount']);
                                
                               

                                i++;

                                rowNew.appendTo(table1);



                            });

                            document.getElementById('NumOfRecord').innerHTML='('+i+')';
                        }
                    });

                });

                 $("#clear").click(function(event){
                  $("#FSreport").find("tr:gt(0)").remove();

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
                    <td width="5%"><label2>Date:&nbsp;</label2></td>
        <td width="10%"><input type="text" id="SearchDate" name="SearchDate" class="form_textbox1"  placeholder="Select Date"  /></td>
       
        <td width="5%"><input type="button" value="Search" class="button_example" id="pop_search" /></td>
        <td width="5%"><input type="button" value="Clear" class="button_example" id="clear" /></td>
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

                    <img alt=""  src="OnePage/header_left.png"/>

                </div>
                <table width="100%" cellspacing="0" cellpadding="0" border="0">

                    <tbody>
                        <tr>
                            <th id="smallHeaderText" class="basicHeaderText_wj">

                                My Report &nbsp;<h id="NumOfRecord"/>

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



<table width="100%" id="FSreport" border="0" class="NewTableStyle" align="center">
    <thead>
        <tr>
            <th>Date</th>
            <th class="hdtab">Time</th>
            <th class="hdtab">Call Type</th>
<th>Category</th>
<th class="hdtab">CRM ID</th>
<th class="hdtab">Team</th>
<th class="hdtab">Contacted By</th>
<th>Serial Number</th>
<th>Contact</th>
<th class="hdtab">Email</th>
<th class="hdtab">Warranty Status</th>
<th class="hdtab">Duration</th>
<th>Issue</th>
<th class="hdtab">Second Issue </th>
<th class="hdtab">Third Issue</th>
<th>Status</th>
<th>Reference</th>
<th>Solution Provide</th>
<th class="hdtab">POP+Tech</th>
<th>FOC</th>
<th>Service Type</th>
<th>Part Number</th>
<th>C Satisfaction</th>
<th class="hdtab">Red Flag</th>
<th class="hdtab">L2 or Mgr Name</th>
<th>Follow Up</th>
<th>Date Time</th>
<th>Comment</th>
<th>Call Count</th>



        </tr>
    </thead>


</table>
        </td></tr></table>

</body>

</html>
