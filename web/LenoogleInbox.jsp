<%--
    Document   : IdeaInboxSearch
    Created on : 04 Oct, 2014, 11:01:29 AM
    Author     : X220
--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="javax.swing.JOptionPane"%>
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

<%
            FetchData obj = new FetchData();
           List<String> ManagerList = obj.getDataList("select Distinct `TM` from employeedetails WHERE `LOB`='Idea' group by TM ASC");
           List<String> SolutionList = obj.getDataList("select Distinct `FOP` from lenoogle_db.lenovo_calltracker_database1 WHERE `FOP`!=''");

            %>


<html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/OnePage/OnePageCss.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/OnePage/Mystyle.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/OnePage/MyNewStyle.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery.datetimepicker.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/OnePage/jquery-ui.css" />
        
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/excellentexport.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/Validation.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquerydatetime.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.datetimepicker.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/moment.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/moment.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/datediff.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui_1.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/my.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.freezeheader.js"></script>
        
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/alertify.core.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/alertify.default.css" />
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/alertify.min.js"></script>
        
        
      <script type="text/javascript">
$(window).load(function() {
	$(".loader").fadeOut("slow");
});
</script>
      

         <script language="javascript" type="text/javascript">



            $(function(){

                if("<%=session.getAttribute("role")%>"==="Admin")
                {
                    $("#DivReportFor").show();
                }
           });
            $(function() {

                $( "#SearchDateFrm" ).datepicker();
               $("#SearchDateFrm").val(moment().format('YYYY-MM-DD'));

            });
            $(function() {
                $( "#SearchDateTo" ).datepicker();
                $("#SearchDateTo").val(moment().format('YYYY-MM-DD'));
            });

 $(document).ready(function() {
 $("#FSreport").freezeHeader();
        $("#SearchDayFrm").change(function(event){
           $('#SearchDayTo').empty();
           $("#SearchDayTo").append("<option value=''>&nbsp</option>");
            for(i=parseInt(this.value, 10);i<=10;i++)
            {
          $("#SearchDayTo").append("<option value='"+i+"'>"+i+"</option>");
            }
     });



               $("#PremiumInboxSearchButton").click(function(event){
                    if(!$("#SearchDateFrm").val().trim()||!$("#SearchDateTo").val().trim())
                        {
                        alertify.alert("Please select date interval value.");
                        return false;
                        }


                    var dateFrm = $("input#SearchDateFrm").val();
                    var dateto = $("input#SearchDateTo").val();
                    var CrmID =  $("select#TeamName").val();
                    var SerialNumber =  $("input#SerialNumber").val();
                    var RefNumber =$("input#RefNumber").val();
                    var FollowupRequired = $("select#FollowupRequired").val();
                    var SolutionProvide =$("select#SolutionProvide").val();
                    var Category  = $("select#InboxCategory").val();
                   

                    $('#WaitImage').css("display","block");

                    $.get("IdeaInbox?date="+dateFrm+"&dateto=" +dateto+"&CrmId="+CrmID+"&SerialNumber="+SerialNumber+"&RefNumber="+RefNumber+"&FollowupRequired="+FollowupRequired+"&SolutionProvide="+SolutionProvide+"&Category="+Category, function(responseJson) {
                        if(responseJson!=null){

                        $('#WaitImage').css("display","none");

                            $("#FSreport").find("tr:gt(0)").remove();

                            var table1 = $("#FSreport");

                            var i=0;
                            $.each(responseJson, function(key,value) {


                                var rowNew = $("<tr>     <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td></td> \n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td></td>\n\
                                                         <td></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td></td>\n\
                                                         <td></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         <td class=\"hdtab\"></td>\n\
                                                         </tr>");

                                rowNew.children().eq(0).text(value['TYPE']);
                                rowNew.children().eq(1).text(value['category']);
                                rowNew.children().eq(2).text(value['Date']);
                                rowNew.children().eq(3).text(value['Time']);
                                rowNew.children().eq(4).text(value['CRM_ID']);
                                rowNew.children().eq(5).text(value['TM']);
                                rowNew.children().eq(6).text(value['serialNumber']);
                                rowNew.children().eq(7).text(value['SR_NBR']);
                                rowNew.children().eq(8).text(value['warrantyStatus']);
                                rowNew.children().eq(9).text(value['contactNumber']);
                                rowNew.children().eq(10).text(value['issue']);
                                rowNew.children().eq(11).text(value['Status']);
                                rowNew.children().eq(12).text(value['Red_Flag']);
                                rowNew.children().eq(13).text(value['Follow_Up']);
                                rowNew.children().eq(14).text(value['Follow_Up_Date']);
                                rowNew.children().eq(15).text(value['focNeeded']);
                                rowNew.children().eq(16).text(value['serviceType']);
                                rowNew.children().eq(17).text(value['partNumber']);
                                rowNew.children().eq(18).text(value['satDsat']);
                                rowNew.children().eq(19).text(value['Comment']);
                                rowNew.children().eq(20).text(value['fop']);
                                rowNew.children().eq(21).text(value['EmpID']);
                                rowNew.children().eq(22).text();
                                rowNew.children().eq(23).text(value['CustomerCallBack']);
                                rowNew.children().eq(24).text(value['WarrantyExp45']);
                                rowNew.children().eq(25).text(value['WDuration']);
                                rowNew.children().eq(26).text(value['ccContactedBy']);
                                rowNew.children().eq(27).text(value['SecondIssue']);
                                rowNew.children().eq(28).text(value['ThirdIssue']);
                                rowNew.children().eq(29).text(value['poptechnicalcall']);
                                rowNew.children().eq(30).text(value['Lenoogle_ID']);
                                rowNew.children().eq(31).text(value['Name']);
                                rowNew.children().eq(32).text(value['Model_name']);
                                rowNew.children().eq(33).text(value['AltContact']);



                                i++;
                                rowNew.appendTo(table1);
                            });

                $('#NumOfRecord').html('('+i+')');
                        }

                        });


               });
                $("#PremiumInboxSearch").keypress(function(event){

                if(event.which==13){

              $("#PremiumInboxSearchButton").click();
                    }

                });

                 $("#FSreport").click(function(event){

                    event = event || window.event;
                    var target = event.target || event.srcElement;

                    while (target && target.nodeName != 'TR') {
                        target = target.parentElement;
                    }
                    var cells = target.cells;
                    if (!cells.length || target.parentNode.nodeName == 'THEAD') {
                        return;
                    }
                    $("#cds-form").dialog("open");
                    $('#cds-form').dialog('option', 'title', 'Case details for Refrence Number: '+cells[7].innerHTML);

                    $("input#LenoogleId").val(cells[30].innerHTML);
                    $("#Category").text(cells[1].innerHTML);
                    $("#Date_Time").text(cells[2].innerHTML+" "+cells[3].innerHTML);
                    $("#createdby").text(cells[4].innerHTML+" ("+cells[5].innerHTML+")");

                  if(cells[32].innerHTML.trim())
                    $("#machineSerial").text(cells[6].innerHTML+" ("+cells[32].innerHTML+")");
                  else
                    $("#machineSerial").text(cells[6].innerHTML);

                    $("#requestedsonumber").text(cells[7].innerHTML);
                    $("#CCContact").text(cells[26].innerHTML);

                   if(cells[33].innerHTML.trim())
                    $("#ContactNumber").text(cells[9].innerHTML+" ("+cells[33].innerHTML+")");
                   else
                    $("#ContactNumber").text(cells[9].innerHTML);

                    $("#Issue").text(cells[10].innerHTML);
                    $("#SolutionPrvd").text(cells[20].innerHTML);
                   

                    if(cells[13].innerHTML==="Yes")
                        $("#FollowUp").text(cells[13].innerHTML+" ("+cells[14].innerHTML+")");
                    else
                    $("#FollowUp").text(cells[13].innerHTML);
                    $("#CallStatus").text(cells[15].innerHTML);
                    $("#comment").val(cells[19].innerHTML);


                    if(cells[4].innerHTML==="<%=session.getAttribute("theName")%>")
                        $('#PremiumUpdate').show();
                    else
                        $('#PremiumUpdate').hide();
                });



                 $('#PremiumSupportForm').submit(function(e) {

                     if(!$("#CallBackStatus").val().trim())
                      {
                           $('#CallBackStatus').css('border', 'solid 1px red');
                          alertify.alert("Please select Call Back Status");
                           return false;
                      }
                      else{ $('#CallBackStatus').css('border', '');}
                      if($("select#CallBackStatus").val().trim()==="Call Back Done"&&!$("select#Category").val().trim())
                          {
                              $('#Category').css('border', 'solid 1px red');
                              alertify.alert("Please select Call Category");
                              return false;
                          }
                      else{ $('#Category').css('border', '');}

                    var formObj = $(this);
                    var formURL = formObj.attr("action");
                    var formData = new FormData(this);
                    $.ajax({
                        url: formURL,
                        type: 'POST',
                        data:  formData,
                        mimeType:"multipart/form-data",
                        contentType: false,
                        cache: false,
                        processData:false,
                        success: function(data, textStatus, jqXHR)
                        {
                            $('#PremiumSupportForm')[0].reset();
                           $('#cds-form').dialog("close");
                        }
                    });
                    e.preventDefault(); //Prevent Default action.
                    e.unbind();
                });
                $("#multiform").submit(); //Submit the form

 });


            </script>
                <style type="text/css">
            label{
                /*                font-family:FoundryGridnik,calibri;*/
                font-family: calibri;
                color:black;
                font-size:16px;
                margin-top: 0px;


            }


        </style>

        <title>Idea | Inbox Search</title>
    </head>
    <body>
             
        <div class="div_backgrndimg"></div>
        <div class="header-band">
           <div id ='WaitImage' class="waitDiv"></div>
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
                
                    <div style="margin-top: 20px;">
                     <table width="90%" align="center">
                <tr>
                    <td>
                        <div style="position: relative; height: 25px !important; overflow: visible;">
                            <div style="z-index: 999; position: absolute; float: left; left: -22px;">

                                <img alt="" src="OnePage/header_left.png"/>

                            </div>
                            <table width="100%" cellspacing="0" cellpadding="0" border="0">

                                <tbody>
                                    <tr>
                                        <th id="smallHeaderText" class="basicHeaderText_wj">

                                            Idea Inbox Search</h>

                                </th>
                                <td class="basicHeaderSlope_wj" style="min-width:20px;">
                                    <div style="width: 20px; display: block;"></div>
                                </td>
                                <td id="smallHeaderTrail" class="basicHeaderTrail_wj"></td>
                                </tr>
                                </tbody>
                            </table>
                            <div style="z-index: 999; position: absolute; float: right; top: 0pt; left: 100%">
                                <img alt="" src="OnePage/header_right.png"/>
                            </div>
                        </div>
                    </td></tr>
                <tr>
                    <td>
                        <div class="formtable" style=" width: 100%">
                            <form id="PremiumInboxSearch" enctype="multipart/form-data"  method="post" action="">
                                <table align="center" border="0" cellspacing="5px" width="97%">
                                <tbody align="right">
                                    <tr>
                                        <td colspan="6" height="2px">

                                        </td>
                                    </tr>
                                    <tr>
                                        <td width="13.33%"><label>Date From/To:</label></td>
                                        <td width="20%" align="right"><div style="display: inline-block; width: 48%;"><input type="text" name="SearchDateFrm" placeholder="From Date" id="SearchDateFrm" value="" class="form_textbox1"/></div><div style="width: 2%;display: inline-block;">&nbsp;</div><div style="display: inline-block; width: 48%;"><input type="text" name="SearchDateTo" id="SearchDateTo" placeholder="To Date" value="" class="form_textbox1"/></div></td>
                                        <td width="13.33%"><label>Select Team:</label></td>
                                        <td width="20%">
                                            <select name="TeamName" id="TeamName" class="form_textbox1">
                                                <option value="">--Select Team--</option>
                                                <%

                                                           Iterator<String> Team = ManagerList.iterator();
                                                           while (Team.hasNext()) {%>


                                               <option><%=Team.next()%></option>
                                               <% }%>
                                            </select>
                                        </td>
                                        <td width="13.33%"> <label>Solution Provided:</label></td>
                                        <td width="20%">
                                            <select name="SolutionProvide" id="SolutionProvide" class="form_textbox1">
                                                <option value="">--Solution Provided--</option>
                                                          <%

                                                           Iterator<String> Solution = SolutionList.iterator();
                                                           while (Solution.hasNext()) {%>


                                               <option><%=Solution.next()%></option>
                                               <% }%>

                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><label>Serial Number:</label></td>
                                        <td><input type="text" placeholder="Enter Serial Number" name="SerialNumber" id="SerialNumber" value="" class="form_textbox1"/></td>
                                        <td><label>Reference Number:</label></td>
                                        <td><input type="text" name="RefNumber" placeholder="Enter Reference Number" id="RefNumber" value="" class="form_textbox1"/></td>
                                        <td><label>Followup Required:</label></td>
                                        <td>
                         <select name="FollowupRequired" id="FollowupRequired" class="form_textbox1">
                            <option value=""></option>
                            <option value="Yes">Yes</option>
                            <option value="No">No</option>

                        </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        
                                        <td></td>
                                        <td width="20%">
                                            <div style="width: 50%;display: inline-block;float: left;"><input class="search" id="PremiumInboxSearchButton" type="button" value="Search" name="PremiumInboxSearchButton"/></div>
                                            <div style="width: 50%;display: inline-block;float: right;"><input class="search" type="reset" value="Clear" name="Clear" onclick="$('#FSreport').find('tr:gt(0)').remove();"/></div>
                                        </td>
                                        <td><label>Call Category:</label></td>
                                        <td>
                                            <select  name='InboxCategory' id='InboxCategory' class="form_textbox1" >
                                                <option value=""></option>
                                                <option>Call Drop</option>
                                                <option>Info Call/Other Support</option>
                                                <option>POP/Warranty</option>
                                                <option value="Platinum Support">Premium Support</option>
                                                <option>Smartphones</option>
                                                <option>Status call</option>
                                                <option>Technical call</option>
                                                <option>Think product</option>
                                                <option>Third Party Support</option>
                                            </select>
                                        </td>
                                        
                                        <td></td>
                                        <td>
                                             <a download="Lenoogle_Report" onclick="return ExcellentExport.excel(this, 'FSreport', 'FS_Report');">
                <img src="OnePage/excel.ico" width="25" height="25" alt="excel-3-32"/>&nbsp;&nbsp;<label3>Export</label3>
            </a>
                                        </td>
                                    </tr>
                                   
                                </tbody>
                            </table>
                            </form>
                            </div>

                    </td>
                </tr>
                     </table>
                    </div>

                        <hr class="style-two">

                        <div>

            <table width="98%" align="center">
                <tr>
                    <td>
                        <div style="position: relative; height: 25px !important; overflow: visible;">
                            <div style="z-index: 999; position: absolute; float: left; left: -22px;">

                                <img alt="" src="OnePage/header_left.png"/>

                            </div>
                            <table width="100%" cellspacing="0" cellpadding="0" border="0">

                                <tbody>
                                    <tr>
                                        <th id="smallHeaderText" class="basicHeaderText_wj">

                                          Search Result &nbsp;<h id="NumOfRecord"></h>

                                </th>
                                <td class="basicHeaderSlope_wj" style="min-width:20px;">
                                    <div style="width: 20px; display: block;"></div>
                                </td>
                                <td id="smallHeaderTrail" class="basicHeaderTrail_wj"></td>
                                </tr>
                                </tbody>
                            </table>
                            <div style="z-index: 999; position: absolute; float: right; top: 0pt; left: 100%">
                                <img alt="" src="OnePage/header_right.png"/>
                            </div>
                        </div>
                    </td></tr>
                <tr><td>



                        <table width="100%" id="FSreport" border="0" class="NewTableStyle" align="center" >
                            <thead>
                                <tr>
                                        <th class="hdtab">Call_Type</th>
                                        <th class="hdtab">Call_Category</th>
                                        <th>Date</th>
                                        <th class="hdtab">Time</th>
                                        <th class="hdtab">Agent_CRM_ID</th>
                                        <th class="hdtab">Team_Name</th>
                                        <th>Serial_Number</th>
                                        <th>Reference_Number</th>
                                        <th class="hdtab">Warranty_Status</th>
                                        <th>Contact_Number</th>
                                        <th>Issue</th>
                                        <th class="hdtab">Status</th>
                                        <th class="hdtab">Red_Flag</th>
                                        <th>Follow_Up</th>
                                        <th class="hdtab">Follow_Up_Date</th>
                                        <th class="hdtab">FOC_Needed</th>
                                        <th class="hdtab">Service_Type</th>
                                        <th class="hdtab">Parts_Number</th>
                                        <th class="hdtab">CSAT_DSAT</th>
                                        <th class="hdtab">Comment</th>
                                        <th>Solution Provide</th>
                                        <th class="hdtab">Email ID</th>
                                        <th class="hdtab">Technical call Drop</th>
                                        <th class="hdtab">Customer call Back</th>
                                        <th class="hdtab">Warranty expires in next 45 days</th>
                                        <th class="hdtab">Warranty_duration</th>
                                        <th class="hdtab">CC_contactedBy</th>
                                        <th class="hdtab">Second Issue</th>
                                        <th class="hdtab">Third Issue</th>
                                        <th class="hdtab">poptechnicalcall</th>
                                        <th class="hdtab">Lenoogle_id</th>
                                        <th class="hdtab">Customer_Name</th>
                                        <th class="hdtab">Machine_Model</th>
                                        <th class="hdtab">Alt_Contact_Number</th>
                               </tr>
                            </thead>


                        </table>
                    </td></tr></table>
        </div>



                        <div  id="cds-form" title="" align="center">
                        <form id="PremiumSupportForm"  enctype="multipart/form-data"  method="post" action="">
                        <table width="100%" cellspacing="5px">

                        <tbody>
                            <tr>
                                <td><input type="hidden" id="LenoogleId" name="LenoogleId" value="" /></td>
                                <td></td>
                                <td><input type="hidden" id="UpdateStatus" name="UpdateStatus" value="Update" /></td>
                                <td></td>
                                <td></td>

                            </tr>
                        <tr>
                                <td class="Myheader">Call Category:</td>
                                <td class="Myheader">Date/Time:</td>
                                <td class="Myheader">Agent (Team):</td>
                                <td class="Myheader">Serial Number:</td>
                                <td class="Myheader">Reference Number:</td>

                        </tr>
                        <tr>
                               <td><label id="Category"></label></td>
                               <td><label id="Date_Time"></label></td>
                               <td><label id="createdby"></label></td>
                               <td><label id="machineSerial"></label></td>
                               <td><label id="requestedsonumber"></label></td>
                        </tr>
                        <tr>
                                <td class="Myheader">CC Contacted By:</td>
                                <td class="Myheader">Contact Number:</td>
                                <td class="Myheader">Issue:</td>
                                <td class="Myheader">Solution Provide:</td>
                                <td class="Myheader">Followup (Date/Time):</td>
                                
                        </tr>
                        <tr>
                                <td><label id="CCContact"</label></td>
                                <td><label id="ContactNumber"></label></td>
                                <td><label id="Issue"></label></td>
                                <td><label id="SolutionPrvd"></label></td>
                                <td><label id="FollowUp"></label></td>


                        </tr>
                        <tr>
                                <td class="Myheader">Status:</td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                        </tr>
                        <tr>
                                <td><label id="CallStatus"</label></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>


                        </tr>
                        <tr>
                            <td colspan="5"><hr class="style-two"/></td>
                        </tr>
                        
                        <tr>
                            <td class="Myheader">Comments:</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>

                        <tr id="rowNumber3" style="vertical-align: top;">
                        <td  colspan="3" rowspan="2">

                        <textarea name="comment" id="comment" class="textareabig"></textarea>

                        </td>
                       

                            <td
                            </td>
                            <td>
                               
                        </td>
                        </tr>


                        <tr>
                            <td>
<!--                                <div style="width: 50%;display: inline-block;float: left;"><input class="search" id="PremiumUpdate" type="submit" value="Update" name="PremiumUpdate"/></div>-->
<!--                                 <div style="width: 50%;display: inline-block;float: right;"><input class="search" type="reset" value="Clear" name="ClearForm"  id="ClearForm" /></div>-->
                            </td>
                            <td></td>
                            <td></td>

                        </tr>

                        </tbody>
                    </table>
                        </form>

</div>



        </div>

    </body>
</html>
