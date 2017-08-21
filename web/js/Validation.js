



$(document).ready(function(){
    $(".tabbable").find(".tab").hide();
    $(".tabbable").find(".tab").first().show();
    $(".tabbable").find(".tabs li").first().find("a").addClass("active");
    $(".tabbable").find(".tabs").find("a").click(function(){
        tab = $(this).attr("href");
        $(".tabbable").find(".tab").hide();
        $(".tabbable").find(".tabs").find("a").removeClass("active");
        $(tab).show();
        $(this).addClass("active");
        return false;
    });
});



function SmartPhoneFormValidation(str)
{
    if(str==='Technical'||str==='CID' || str==='POP' || str==='DOA')
    {
          
    
//Email ID
//Follow up needed 
//Heat Check 
//IMEI number 1
//Issue 
//Prority 
//Refered to CCI ?
//serial number 
//Solution Provided 
        
        
    $("input:radio[name=HeatChk]").attr("required", true);
    $("input:radio[name=Alert]").attr("required", true);
    $("input#EmailID").attr("required", true);
    $("input#Imei1").attr("required", true);
    $("input#Issue").attr("required", true);  
    $("select#Priority").attr("required", true);
    $("select#ReferredToCC").attr("required", true);
    $("input#machineSerial").attr("required", true);
    $("select#SolutionProvided").attr("required", true);
    
   
    }
    else if(str==='ETA')
    {
//Email ID
//Follow up needed
//Issue 
//Prority 
//serial number 
    $("input#EmailID").attr("required", true);
    $("input#Imei1").attr("required", false);
    $("input#Issue").attr("required", true);  
    $("select#Priority").attr("required", true);
    $("select#ReferredToCC").attr("required", false);
    $("input#machineSerial").attr("required", true);
    $("select#SolutionProvided").attr("required", false);
    $("input:radio[name=HeatChk]").attr("required", false);
    $("input:radio[name=Alert]").attr("required", false);
        
        
    }
    else if(str==='CCI info'||str==='Out of scope(Third party)')
    {
//        Issue 
    $("input#EmailID").attr("required", false);
    $("input#Imei1").attr("required", false);
    $("input#Issue").attr("required", true);  
    $("select#Priority").attr("required", false);
    $("select#ReferredToCC").attr("required", false);
    $("input#machineSerial").attr("required", false);
    $("select#SolutionProvided").attr("required", false);
    $("input:radio[name=HeatChk]").attr("required", false);
    $("input:radio[name=Alert]").attr("required", false);

    }
    else if(str==='Wrong Q'||str==='Sales Query')
    {
//       Default Validateion 

    $("input#EmailID").attr("required", false);
    $("input#Imei1").attr("required", false);
    $("input#Issue").attr("required", false);  
    $("select#Priority").attr("required", false);
    $("select#ReferredToCC").attr("required", false);
    $("input#machineSerial").attr("required", false);
    $("select#SolutionProvided").attr("required", false);
    $("input:radio[name=HeatChk]").attr("required", false);
    $("input:radio[name=Alert]").attr("required", false);
    }
    
    return false;
}

function simple_Validation()
{
    var y=document.getElementById("pass").value;
    var err = false;
    z=document.getElementById("demo");// Find the element
    if(y=="")
    {
        alertify.alert("Please Enter Login Password");
        err= true;
        return false;
    }
    else if(!err){
    return true;
document.getElementById("test").submit();
    }
}

function username_Validation()
{

    var x=document.getElementById("uname").value;

    z=document.getElementById("demo").visibility='visible';
    // Find the element

    if(x=="")
    {
        z.style.color="#ff0000";

            alertify.alert("Please Enter UserName");
        return ;
    }
}

function password_Validation()
{


    var y=document.getElementById("pass").value;


    if(y=="")
    {
        alertify.alert("Please Enter Password");
        return ;
    }
}
function addnewre()
{
    document.getElementById("newre").submit();

}

function unamevalidation()
{   
    
    alertify.alert("One of the fields is empty.");
    var field = document.getElementById('uname');

    if (field.value == "") {
        document.getElementById('uname').style.border = "solid 1px red";
        alertify.alert("One of the fields is empty.");
        return false;
    }
}



var xmlHttp
// var xmlHttp
function showCity1(str){
    if (typeof XMLHttpRequest != "undefined"){
        alert("undefined");
        xmlHttp= new XMLHttpRequest();
    }
    else if (window.ActiveXObject){
        xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
        alert("Micosoft XMLHTTP");
    }
    if (xmlHttp==null){
        alert("Browser does not support XMLHTTP Request")
        return;
    }
    var url="city.jsp";
    url +="?comp=" +str;
    xmlHttp.onreadystatechange = stateChange;
    xmlHttp.open("GET", url, true);
    xmlHttp.send(null);
}

function stateChange(){
    if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){
        document.getElementById("state").innerHTML=xmlHttp.responseText
    }
}





function validatePOPForm()
{

    
    var timeOfMail =document.getElementById("timeOfMail").value.trim();
    var email =document.getElementById("email").value.trim();
    var machinemodel = document.getElementById("machinemodel").value.trim();
    var MTM = document.getElementById("MTM").value.trim();
    var machineSerial = document.getElementById("machineSerial").value.trim();
    var PurcDate = document.getElementById("PurcDate").value.trim();
    var RequestType = document.getElementById("RequestType").value.trim();
    var status = document.getElementById("status").value.trim();
    var replyStatus = document.getElementById("replyStatus").value.trim();
    var escalatedStatus = document.getElementById("escalatedStatus").value.trim();
    var finalStatus = document.getElementById("finalStatus").value.trim();
    var ReasonOfRejection = document.getElementById("ReasonOfRejection").value.trim();
    var ManufacturingDate = document.getElementById("ManufacturingDate").value.trim();
    var ReasonCheckBox;
    
    
    
    
    

    if(timeOfMail==null|| timeOfMail==""||email==null|| email==""){
        if(timeOfMail==null|| timeOfMail=="")
        {
            document.getElementById('timeOfMail').style.border = "solid 1px red";
        }

        if(email==null|| email=="")
        {
            document.getElementById('email').style.border = "solid 1px red";
        }
        return;
    }


    else

    {
        document.getElementById('timeOfMail').style.border = "";
        document.getElementById('email').style.border = "";


    }

    if((status=="Updated"||status=="Already Updated"||status=="none")&&RequestType!="Non POP")
    {
   
        if(finalStatus=="none"||replyStatus==null||replyStatus==""||status=="none"||PurcDate==null||PurcDate==""||machinemodel==null||machinemodel==""||MTM==null||MTM==""||machineSerial==null||machineSerial=="")
        {
         


            if(machinemodel==null|| machinemodel=="")
            {
        
                document.getElementById('machinemodel').style.border = "solid 1px red";
            }
            else{
             
                document.getElementById('machinemodel').style.border = "";
            }
         

            if(MTM==null|| MTM=="")
            {
       
                document.getElementById('MTM').style.border = "solid 1px red";
            }
            else{
         
                document.getElementById('MTM').style.border = "";
            }

            if(machineSerial==null|| machineSerial==""||!PopSerialNumberValidate())
            {
       
                document.getElementById('machineSerial').style.border = "solid 1px red";
            }

            else{
            
                document.getElementById('machineSerial').style.border = "";
            }

            if(PurcDate==null|| PurcDate=="")
            {
           
                document.getElementById('PurcDate').style.border = "solid 1px red";
            }
            else{
            
                document.getElementById('PurcDate').style.border = "";
            }

            if(RequestType=="none")
            {
          
                document.getElementById('RequestType').style.border = "solid 1px red";
            }
            else{
            
                document.getElementById('RequestType').style.border = "";
            }

            if(status=="none")
            {
       
                document.getElementById('status').style.border = "solid 1px red";
            }
            else{
           
                document.getElementById('status').style.border = "";
            }

            if(replyStatus==null|| replyStatus=="")
            {
            
                document.getElementById('replyStatus').style.border = "solid 1px red";
            }
            else{
           
                document.getElementById('replyStatus').style.border = "";
            }
   
            if((escalatedStatus==null|| escalatedStatus=="")&&status=="Escalated")
            {
            
                document.getElementById('escalatedStatus').style.border = "solid 1px red";
            }
            else{
            
                document.getElementById('escalatedStatus').style.border = "";
            }
            
            if(finalStatus=="none")
            {
           
                document.getElementById('finalStatus').style.border = "solid 1px red";
            }
            else{
          
                document.getElementById('finalStatus').style.border = "";
            }

            //    alert("false");
            return;
        }

        else{
            // alert("we are in last else");
            document.getElementById("popform").submit();


        //  return true;
        }
    }
    else if(status=="Rejected")
    {
        //  alert("we are in else if status ==rejection");
        document.getElementById("machinemodel").style.border = "";
        document.getElementById("MTM").style.border = "";
        document.getElementById("machineSerial").style.border = "";
        document.getElementById("PurcDate").style.border = "";
        document.getElementById("status").style.border = "";
        document.getElementById('ManufacturingDate').style.border = "";

    
        if(ReasonOfRejection==""||finalStatus=="none"){

 

            if(ReasonOfRejection=="")

            {
                document.getElementById('ReasonOfRejection').style.border = "solid 1px red";
            }
        
            else{
                document.getElementById('ReasonOfRejection').style.border = "";
            }
            if(finalStatus=="none")

            {
                document.getElementById('finalStatus').style.border = "solid 1px red";
            }

            else{
                document.getElementById('finalStatus').style.border = "";
            }
            return;
        }
        else{
           
            document.getElementById("popform").submit();
    
        }
    }
    

    

}









function ClearValidatePOPForm()
{


    document.getElementById("email").style.border = "";
    document.getElementById("timeOfMail").style.border = "";

    document.getElementById("machinemodel").style.border = "";
    document.getElementById("MTM").style.border = "";
    document.getElementById("machineSerial").style.border = "";
    document.getElementById("PurcDate").style.border = "";

    document.getElementById("RequestType").style.border = "";
    document.getElementById("status").style.border = "";
    document.getElementById("replyStatus").style.border = "";
    document.getElementById("escalatedStatus").style.border = "";
    document.getElementById("finalStatus").style.border = "";
  
    
    document.getElementById('divRejection').style.display = "none";
    document.getElementById('divEsc').style.display = "block";
    

}

function ContactNumberValidate() {
    var mobile = document.getElementById("contact").value.trim();
    var pattern = /^\d{10,13}$/;
               
    if(!pattern.test(mobile))
    {
        document.getElementById('contact').style.border = "solid 2px red";
        return false;
    }
    else{
        document.getElementById('contact').style.border = "";
        return true;
    }
}

function IMEINumber(IMEI) {
   
    var pattern = /^\d{15}$/;
               
    if(!pattern.test(IMEI))
    {
//       alertify.alert("Invalid IMEI Number");
        
       this.id.style.color = '#cc0000';
        return false;
    }
    else{
       
        return true;
    }
}





function SerialNumberValidate() {
    if(document.getElementById('idea').checked){
        var serial = document.getElementById("serialnumber").value.trim();

        var pattern = /^(\d+[a-zA-Z]|[a-zA-Z]+\d)[a-zA-Z\d]*$/;

        if(!pattern.test(serial)||serial.length>10||serial.length<8)
        {
            document.getElementById('msnerror').style.display ="block";
            return false;
        }
        else{
            document.getElementById('msnerror').style.display ="none";
            return true;
        }
    }
    if(document.getElementById('think').checked){
        var serial = document.getElementById("serialnumber").value.trim();
        var mtm =   document.getElementById("mtmnumber").value.trim();
                
        var pattern = /^[a-zA-Z0-9]*$/;
        var mtypepattern = /^[0-9]*$/;

        if(!pattern.test(serial)||serial.length!=7)
        {
            document.getElementById('msnerror').style.display ="block";
            return false;
        }
        else {
            document.getElementById('msnerror').style.display ="none";

            if(!mtypepattern.test(mtm)|| mtm==""||mtm.length<3||mtm.length>4)
            {
                document.getElementById('mtmerror').style.display ="block";
                return false;
            }
            else {
                document.getElementById('mtmerror').style.display ="none";
                  
                return true;
            }
            return true;
        }




    }
}



function PopSerialNumberValidate() {

    var serial = document.getElementById("machineSerial").value.trim();

    var pattern = /^(\d+[a-zA-Z]|[a-zA-Z]+\d)[a-zA-Z\d]*$/;

    if(!pattern.test(serial)||serial.length>10||serial.length<7)
    {
        document.getElementById('machineSerial').style.border = "solid 1px red";
        return false;
    }
    else{
        document.getElementById('machineSerial').style.border = "";
        return true;
    }
}

function MSNValidation(MSN) {
    var pattern = /^(\d+[a-zA-Z]|[a-zA-Z]+\d)[a-zA-Z\d]*$/;
    if(!pattern.test(MSN)||MSN.length>10||MSN.length<7||MSN.length==0)
    {
        return false;
    }
    else{
        return true;
    }

}



function IrSrSovalidate(key,ref)
{

    var keycode = (key.which) ? key.which : key.keyCode;
             

    if (!(keycode==9 ||keycode==8 || keycode==46)&&(keycode < 48 || keycode > 57))
    {
        return false;
    }
    else
    {
        return true;

    }
}

//Send Message Code..

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function MyMessage(number,msg){
    if (typeof XMLHttpRequest != "undefined"){
        xmlHttp= new XMLHttpRequest();
    }
    else if (window.ActiveXObject){
        xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
    }
    if (xmlHttp==null){
        alert("Browser does not support XMLHTTP Request")
        return;
    }
    var url = 'http://103.16.101.52:8080/bulksms/bulksms?username=hry-lenovo&password=lenovo&type=0&dlr=0&destination=91'+number+'&source=Lenovo&message='+msg;

    xmlHttp.onreadystatechange = stateChange;
    xmlHttp.open("GET", url, true);
    xmlHttp.send(null);
}
function stateChange()
{
    if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
    {
//        document.getElementById("mainform").submit();
        alertify.alert("Message sent to customer.");
         return true;
    }
}


function MessageFuncation(){
    var n = $("select#Category").val();
    if(n=="Call Drop"||n=="Technical call"||n=="POP/Warranty"){


        var contact = $("input#contact").val();
        var conf = confirm("You want to send SMS ?");
        var message;
        //   alert("We Are Here");
        if(n=="Call Drop"&& contact!=""&&conf)
        {

            message = 'Dear Valuable Customer,Sorry for the inconvenience your call got dropped. We are arranging call back for you, shortly you will receive call from our team.';
            MyMessage(contact,message);
                      
                    
        }
         if(n=="Technical call"&& contact!=""&&conf &&$("#techCallDrop").is(':checked'))
        {

            message = 'Thank you for contacting Lenovo. We regret that your call dropped. Your call is important to us. Our Technical expert will call you in 4 Biz hours.';
            MyMessage(contact,message);
         

        }
        
        else  if(n=="POP/Warranty"&& contact!=""&&conf)
        {

            message = 'Dear Customer,Thank you for contacting Lenovo Tech support, for Register your product please send invoice copy on POP@lenovo.com and INDIA@lenovoreg.com reference number '+$("input#referenceno").val()+'.';
            MyMessage(contact,message);
          

        }
        else{

//            document.getElementById("mainform").submit();

            document.getElementById('LenInboxDiv').style.display = "none";
            document.getElementById('lenlab').style.display = "none";
            document.getElementById('SRCatalogDiv').style.display = "none";
            document.getElementById('SRlab').style.display = "none";
            document.getElementById('SOCatalogDiv').style.display = "none";
            document.getElementById('SOlab').style.display = "none";
             return true;
        }

    }
    else{
        return;
    }

}






function validateFSForm()
{

    var machineSerial = document.getElementById("machineSerial").value.trim();
    var emailtime =  document.getElementById("emailtime").value.trim();
    var Category =  document.getElementById("Category").value.trim();
    var Requeststatus =  document.getElementById("Requeststatus").value.trim();
    var model =  document.getElementById("model").value.trim();


    if(machineSerial==null||machineSerial==""||emailtime==null||emailtime==""||Requeststatus==""||Category==""||model==null||model=="")
    {
        if(machineSerial==null|| machineSerial=="")
        {

            $('#machineSerial').css('border', 'solid 1px red');
        }
        else{

            $('#machineSerial').css('border', '');
        }


        if(emailtime==null|| emailtime=="")
        {

            $('#emailtime').css('border', 'solid 1px red');
        }
        else{

        $('#emailtime').css('border', '');
        }

        if(Category=="")
        {

            $('#Category').css('border', 'solid 1px red');
        }

        else{

            $('#Category').css('border', '');
        }

        if(Requeststatus=="")
        {

            $('#Requeststatus').css('border', 'solid 1px red');
        }
        else{

            $('#Requeststatus').css('border', '');
        }
        if(model==null||model=="")
        {

        $('#model').css('border', 'solid 1px red');
        }
        else{

        $('#model').css('border', '');
        }

        return;

    }
    else{
        //  alert("we are in last else");
        document.getElementById("FSFormSubmit").submit();


    //alert("Aftrer Call");
    }
}













function RefValidate(ref){
   
    var pattern = /^\d{9,10}$/;

    if(!pattern.test(ref.trim()))
    {
  return false;
    }
    else{
        return true;
    }
}










function validateMainForm(){
     var Refpattern = /^\d{9,10}$/;
     var Contpattern = /^\d{10,13}$/;
     var techContPatrn= /^[789]\d{9}$/;

//alert("in validatemain form");
    var Category = document.getElementById("Category").value.trim();
   
  if(!$("#referenceno").val().trim()||!Refpattern.test($("#referenceno").val().trim())||!$("#contact").val().trim()||!Contpattern.test($("#contact").val().trim())||!$("#comment").val().trim())
     {
//          alert("inside 1st if");
         if(!$("#referenceno").val().trim()||!Refpattern.test($("#referenceno").val().trim()))
        {
//             alert("inside 1st  sub if");
            $('#referenceno').css('border', 'solid 1px red');
           
        }
        else
            {
//                 alert("inside 1st  sub else");
                $('#referenceno').css('border', '');
            }
         if(!$("#contact").val().trim()||!Contpattern.test($("#contact").val().trim()))
        {
//              alert("inside 2st  sub is");
            $('#contact').css('border', 'solid 1px red');
           
        }
        else
            {
//                  alert("inside 2nd  sub else");
                 $('#contact').css('border', '');
            }
 
     }

  if(($("#contact").val().trim()&&$("#referenceno").val().trim())&&($("#contact").val().trim()==$("#referenceno").val().trim()))
        {
        alertify.alert("Refrence and Contact number should not be same");
        return;
        }

if(Category=="Platinum Support")
    {

 if(!$("#customername").val().trim()||!$("#machineSerial").val().trim()||!$("#machinemodel").val().trim())
     {

        if(!$("#customername").val().trim())
        {
            $('#customername').css('border', 'solid 1px red');
        }
        if(!$("#machineSerial").val().trim())
        {
            $('#machineSerial').css('border', 'solid 1px red');
        }
        if(!$("#machinemodel").val().trim())
        {
            $('#machinemodel').css('border', 'solid 1px red');
        }
        return;
     }
        else{
           document.getElementById("mainform").submit();
        }



    }


   else if(Category=="Call Drop")
    {
       
         
        if( !$("#contact").val().trim()||!Contpattern.test($("#contact").val().trim()))
        {                   
            $('#contact').css('border', 'solid 1px red');
        }
        else{

           document.getElementById("mainform").submit();
//           $("#LenInboxDiv").css("display", "none");
//           $('#lenlab').css("display", "none");
//           $('#SRCatalogDiv').css("display", "none");
//            $('#SRlab').css("display", "none");
//           $('#SOCatalogDiv').css("display", "none");
//           $('#SOlab').css("display", "none");
//            return true;
         
      //  MessageFuncation();
        }
    }

    
    else if(Category==="Think product"||Category==="Third Party Support"||Category==="Smartphones")
    {
        document.getElementById("mainform").submit();

//        $("#LenInboxDiv").css("display", "none");
//           $('#lenlab').css("display", "none");
//           $('#SRCatalogDiv').css("display", "none");
//           $('#SRlab').css("display", "none");
//           $('#SOCatalogDiv').css("display", "none");
//           $('#SOlab').css("display", "none");
//            return true;
    }



    else if(Category=="Info Call/Other Support")
    {
     
       
        if($("#contactedby").val().trim()=="")
        {
            $('#contactedby').css('border', 'solid 1px red');
        }
         
        else{
            document.getElementById("mainform").submit();
//            $("#LenInboxDiv").css("display", "none");
//           $('#lenlab').css("display", "none");
//           $('#SRCatalogDiv').css("display", "none");
//           $('#SRlab').css("display", "none");
//           $('#SOCatalogDiv').css("display", "none");
//           $('#SOlab').css("display", "none");
//            return true;
        }

    }

    else if(Category=="POP/Warranty")
    {
    
        if(!$("#machineSerial").val().trim()||!$("#contact").val().trim()||!$("#contactedby").val().trim()||!$("#emailid").val().trim())
        {
            if( !$("#machineSerial").val().trim())
            {
             $('#machineSerial').css('border', 'solid 1px red');
            }
            if( !$("#contact").val().trim())
            {
             $('#contact').css('border', 'solid 1px red');
            }
            if($("#contactedby").val().trim()=="")
            {
              $('#contactedby').css('border', 'solid 1px red');
            }
            if($("#emailid").val().trim()=="")
            {
                $('#emailid').css('border', 'solid 1px red');
            }
            return;
        }
        if($('#poptech').is(':checked')){
      
            if($("#issue").val().trim()=="")
            {
                $('#issue').css('border', 'solid 1px red');
                return;
            }
            else{

           document.getElementById("mainform").submit();
//           $("#LenInboxDiv").css("display", "none");
//           $('#lenlab').css("display", "none");
//           $('#SRCatalogDiv').css("display", "none");
//           $('#SRlab').css("display", "none");
//           $('#SOCatalogDiv').css("display", "none");
//           $('#SOlab').css("display", "none");
//            return true;
            }
        }
   
        else{

          document.getElementById("mainform").submit();
//           $("#LenInboxDiv").css("display", "none");
//           $('#lenlab').css("display", "none");
//           $('#SRCatalogDiv').css("display", "none");
//           $('#SRlab').css("display", "none");
//           $('#SOCatalogDiv').css("display", "none");
//           $('#SOlab').css("display", "none");
//
//            return true;
        }

    }

    else if(Category=="Technical call")
    {

        if(!jQuery("input[name=HeatCheck]:checked").val()||!jQuery("input[name=year]:checked").val()||!techContPatrn.test($("#contact").val().trim())||!$("#solution").val().trim()||!$("#warrantydetails").val().trim()||!$("#machineSerial").val().trim()||!$("#contact").val().trim()||!$("#contactedby").val().trim()||!$("#emailid").val().trim())
        {
          
          if(!jQuery("input[name=HeatCheck]:checked").val()){

         $('#htckredioV').css('border', 'solid 1px red');
         $('#htckredioV').css('background' , "#FFCECE");
         }
          
          
          if(!jQuery("input[name=year]:checked").val()){

         $('#warrntyredioV').css('border', 'solid 1px red');
         $('#warrntyredioV').css('background' , "#FFCECE");
         }




            if(!techContPatrn.test($("#contact").val().trim()))
            {
            $('#contact').css('border', 'solid 1px red');
            }
            if( !$("#machineSerial").val().trim())
            {
                $('#machineSerial').css('border', 'solid 1px red');
            }
            if( !$("#contact").val().trim())
            {
                $('#contact').css('border', 'solid 1px red');
            }
            if($("#contactedby").val().trim()=="")
            {
               $('#contactedby').css('border', 'solid 1px red');
            }
            if($("#emailid").val().trim()=="")
            {
                $('#emailid').css('border', 'solid 1px red');
            }
            if($("#issue").val().trim()=="")
            {

                  $('#issue').css('border', 'solid 1px red');

            }
            if($("#warrantydetails").val().trim()=="")
            {
                $('#warrantydetails').css('border', 'solid 1px red');

            }
            if($("#solution").val().trim()=="")
            {
                $('#solution').css('border', 'solid 1px red');

            }
            return;
        }

        else if($('#solution').val().trim()=="FOC"){

            if($("#servicetype").val().trim()=="")
            {
               $('#servicetype').css('border', 'solid 1px red');
                return;
            }
            else{
           document.getElementById("mainform").submit();
//           $("#LenInboxDiv").css("display", "none");
//           $('#lenlab').css("display", "none");
//           $('#SRCatalogDiv').css("display", "none");
//           $('#SRlab').css("display", "none");
//           $('#SOCatalogDiv').css("display", "none");
//           $('#SOlab').css("display", "none");
//            return true;
        //  MessageFuncation();
            }
        }
         else if($("#techCallDrop").is(':checked')){
         
          MessageFuncation();
        }
        else{
            document.getElementById("mainform").submit();

//           $("#LenInboxDiv").css("display", "none");
//           $('#lenlab').css("display", "none");
//           $('#SRCatalogDiv').css("display", "none");
//           $('#SRlab').css("display", "none");
//           $('#SOCatalogDiv').css("display", "none");
//           $('#SOlab').css("display", "none");
//            return true;
        }

    }

    else if(Category=="Status call")
    {

        if(!jQuery("input[name=HeatCheck]:checked").val()||!$("#status").val().trim()||!$("#machineSerial").val().trim()||!$("#contact").val().trim()||!$("#contactedby").val().trim())
        {
            

            if(!jQuery("input[name=HeatCheck]:checked").val()){

         $('#htckredioV').css('border', 'solid 1px red');
         $('#htckredioV').css('background' , "#FFCECE");
         }


            if($("#status").val().trim()=="")
            {
                $('#status').css('border', 'solid 1px red');
            }
            if( !$("#machineSerial").val().trim())
            {
             $('#machineSerial').css('border', 'solid 1px red');
            }
            if( !$("#contact").val().trim())
            {
              $('#contact').css('border', 'solid 1px red');
            }
            if($("#contactedby").val().trim()=="")
            {
              $('#contactedby').css('border', 'solid 1px red');
            }
       
            if($("#issue").val().trim()=="")
            {
             $('#issue').css('border', 'solid 1px red');

            }
            return;
        }
        else{
           document.getElementById("mainform").submit();

//           $("#LenInboxDiv").css("display", "none");
//           $('#lenlab').css("display", "none");
//           $('#SRCatalogDiv').css("display", "none");
//           $('#SRlab').css("display", "none");
//           $('#SOCatalogDiv').css("display", "none");
//           $('#SOlab').css("display", "none");
//           $('#technicallDrop').css("display", "none");
//            return true;
        }


    }

}

//Clear Main Form
function ClearLenoogleForm()
{
     //alert("Aftrer Call");

           $("#LenInboxDiv").css("display", "none");
           $('#lenlab').css("display", "none");
           $('#SRCatalogDiv').css("display", "none");
           $('#SRlab').css("display", "none");
           $('#SOCatalogDiv').css("display", "none");
           $('#SOlab').css("display", "none");
           $('#technicallDrop').css("display", "none");
                $('#machinesn').hide();
                $('#contactnumber').hide();
                $('#ccby1').hide();
                $('#irsrsonumber').hide();
                $('#rows1').hide();
                $('#rows2').hide();
                $('#rows3').hide();
                $('#rows4').hide();
                $('#rows5').hide();
                $('#rows6').hide();
                $('#rows7').hide();
                $('#rows8').hide();
                $('#rows9').hide();
                $('#substatus').hide();
                $('#poptechnical').hide();
                $('#CustCount').hide();
                $('#comments').hide();
                $('#buttons').hide();
                $('#contactsupport').hide();
                $('#IRGrpnRow1').hide();
                $('#IRGrpnRow2').hide();
                $('#IRGrpnRow3').hide();
                $('#premium').hide();
                $('#altcontactnumber').hide();
}

//Message Send For FOC

function Validate_iOmegaForm()
{
      var Tktpattern = /^\d{6}-\d{6}$/;
      var RMAIDpattern = /[aA][pP]\d{10}/;
      var SerialPattern = /^([a-zA-Z0-9]){7,10}$/;


    if(!SerialPattern.test($("#machineSerial").val().trim())||!Tktpattern.test($("#tktNumber").val().trim())||!$("#Nas_Das").val().trim()||!$("#Warranty_Terms").val().trim()||!$("#tktNumber").val().trim()||!$("#machineSerial").val().trim()||!$("#CustomerName").val().trim())
    {

        if(!$("#Nas_Das").val().trim())
        {
            $('#Nas_Das').css('border', 'solid 1px red');
        }
        else
        {
            $('#Nas_Das').css('border', '');
        }

        if(!$("#Warranty_Terms").val().trim())
        {
            $('#Warranty_Terms').css('border', 'solid 1px red');
        }
        else
        {
            $('#Warranty_Terms').css('border', '');
        }

        if(!$("#machineSerial").val().trim()||!SerialPattern.test($("#machineSerial").val().trim()))
        {
            $('#machineSerial').css('border', 'solid 1px red');
        }
        else
        {
            $('#machineSerial').css('border', '');
        }

        if(!$("#tktNumber").val().trim()||!Tktpattern.test($("#tktNumber").val().trim()))
        {
             
            $('#tktNumber').css('border', 'solid 1px red');
        }
        else
        {

            $('#tktNumber').css('border', '');
        }

        if(!$("#CustomerName").val().trim())
        {
            $('#CustomerName').css('border', 'solid 1px red');
        }
        else
        {
            $('#CustomerName').css('border', '');
        }

        return false;
    }
    if($("#RMAId").val().trim()&&!RMAIDpattern.test($("#RMAId").val().trim()))
        {
            $('#RMAId').css('border', 'solid 1px red');
        }
    else
    {
        document.getElementById("iOmegaFormSubmit").submit();
    }
}



function FOCMessage(number,msg){

     

    if (typeof XMLHttpRequest != "undefined"){
        xmlHttp= new XMLHttpRequest();
    }
    else if (window.ActiveXObject){
        xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
    }
    if (xmlHttp==null){
        alert("Browser does not support XMLHTTP Request")
        return;
    }
    var url = 'http://103.16.101.52:8080/bulksms/bulksms?username=hry-lenovo&password=lenovo&type=0&dlr=0&destination=91'+number+'&source=Lenovo&message='+encodeURIComponent(msg);
//alert(url);
    xmlHttp.onreadystatechange = FOCMessageSent;
    xmlHttp.open("GET", url, true);
    xmlHttp.send(null);
}
function FOCMessageSent()
{
    if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
    {
       alertify.alert("Message Sent to customer");
        return;
    }
}

function showKeyCode(e) {
   // debugger;
   
    var keycode;
    if (window.event)
        keycode = window.event.keyCode;
    else if (e)
        keycode = e.which;

    // Mozilla firefox
    if (jqcc.browser.mozilla) {
        if (keycode == 116 || (e.ctrlKey && keycode == 82)) {
           // alert("mozila");
            if (e.preventDefault) {
                e.preventDefault();
                e.stopPropagation();
            }
        }
    }
    // IE
    else if (jqcc.browser.msie) {
        if (keycode == 116 || (window.event.ctrlKey && keycode == 82)) {
            window.event.returnValue = false;
            window.event.keyCode = 0;
            window.status = "Refresh is disabled";
        }
    }
    else {
        switch (e.keyCode) {

            case 116: // 'F5'
                event.returnValue = false;
                event.keyCode = 0;
                window.status = "Refresh is disabled";
                break;

        }
    }
}
function checkForNotifications(name){

 $.get('NotificationStatus?name='+name,function(responseJson) {
                        if(responseJson!=null){
                 $.each(responseJson, function(key,value) {
             if(value["Status"]==="Ready")
                   {
                          ShowmNotification(name,'Please get into ready mode');
                   }

                  else if(value["Status"]==="Break Exceeded")
                   {
                          ShowmNotification(name,'You have exceeded break');
                   }
                  else if(value["Status"]==="Long Call")
                   {
                          ShowmNotification(name,'you are on a long call. Please check with L2');
                   }
else
    {
       
        ShowmNotification(name, value["Status"].toString());
    }


           });

                        }
                    });




}


 function datediff(fromDate,toDate) {
                /*
                 * DateFormat month/day/year hh:mm:ss
                 * ex.
                 * datediff('01/01/2011 12:00:00','01/01/2011 13:30:00','seconds');
                 */
                var second=1000, minute=second*60, hour=minute*60, day=hour*24, week=day*7;
                fromDate = new Date(fromDate);
                toDate = new Date(toDate);
                var timediff = toDate - fromDate;
                if (isNaN(timediff)) return NaN;

                var sec= Math.floor(timediff / second);



                return sec;

            }

            function js_yyyy_mm_dd_hh_mm_ss () {
                now = new Date();
                year = "" + now.getFullYear();
                month = "" + (now.getMonth() + 1);if (month.length == 1) {month = "0" + month;}
                day = "" + now.getDate();if (day.length == 1) {day = "0" + day;}
                hour = "" + now.getHours();if (hour.length == 1) {hour = "0" + hour;}
                minute = "" + now.getMinutes();if (minute.length == 1) {minute = "0" + minute;}
                second = "" + now.getSeconds();if (second.length == 1) {second = "0" + second;}
                return year + "/" + month + "/" + day + " " + hour + ":" + minute + ":" + second;
            }

            function secondsToString(seconds)
            {

                var numdays = Math.floor(seconds / 86400);
                var numhours = Math.floor((seconds % 86400) / 3600);
                var numminutes = Math.floor(((seconds % 86400) % 3600) / 60);
                //var numseconds = ((seconds % 86400) % 3600) % 60;

        return numdays + " days, " + numhours + " hours " + numminutes + " minutes ";

            }
             function secondsToStringAging(seconds,OldDays)
            {
                var numdays = Math.floor(seconds / 86400);
                var numhours = Math.floor((seconds % 86400) / 3600);
                var numminutes = Math.floor(((seconds % 86400) % 3600) / 60);
                //var numseconds = ((seconds % 86400) % 3600) % 60;
             if(OldDays)
                 {
               return parseInt(OldDays, 10)+parseInt(numdays, 10) + " days, " + numhours + " hours " + numminutes + " minutes ";
                 }
             else
                 {
               return numdays+ " days, " + numhours + " hours " + numminutes + " minutes ";
                 }
            }

            








function thinkvalidation()
{
    var Refpattern = /^\d{9,10}$/;
     var Contpattern = /^\d{10,13}$/;
     var techContPatrn= /^[789]\d{9}$/;


    var Category = document.getElementById("Category").value.trim();

  if(!$("#referenceno").val().trim()||!Refpattern.test($("#referenceno").val().trim())||!$("#contact").val().trim()||!Contpattern.test($("#contact").val().trim())||!$("#comment").val().trim())
     {

         if(!$("#referenceno").val().trim()||!Refpattern.test($("#referenceno").val().trim()))
        {
//             alert("inside 1st  sub if");
            $('#referenceno').css('border', 'solid 1px red');

        }
        else
            {
//                 alert("inside 1st  sub else");
                $('#referenceno').css('border', '');
            }
         if(!$("#contact").val().trim()||!Contpattern.test($("#contact").val().trim()))
        {
//              alert("inside 2st  sub is");
            $('#contact').css('border', 'solid 1px red');

        }
        else
            {
//                  alert("inside 2nd  sub else");
                 $('#contact').css('border', '');
            }

     }

  if(($("#contact").val().trim()&&$("#referenceno").val().trim())&&($("#contact").val().trim()==$("#referenceno").val().trim()))
        {
        alertify.alert("Refrence and Contact number should not be same");
        return;
        }

   else if(Category=="Call Drop")
    {

        if( !$("#contact").val().trim()||!Contpattern.test($("#contact").val().trim()))
        {
            $('#contact').css('border', 'solid 1px red');
        }
         else if(!$("#referenceno").val().trim()||!Refpattern.test($("#referenceno").val().trim()))
        {

            $('#referenceno').css('border', 'solid 1px red');

        }

        else{

           document.getElementById("mainform").submit();

        }
    }


    else if(Category=="Idea product"||Category=="Third Party Support"||Category=="Smartphones"||Category=="POP/Warranty")
    {
          if( !$("#contact").val().trim()||!Contpattern.test($("#contact").val().trim()))
        {
            $('#contact').css('border', 'solid 1px red');
        }
            else if(!$("#referenceno").val().trim()||!Refpattern.test($("#referenceno").val().trim()))
        {

            $('#referenceno').css('border', 'solid 1px red');

        }
        else{
        document.getElementById("mainform").submit();
        }
    }

    else if(Category=="Info Call/Other Support")
    {

          if( !$("#contact").val().trim()||!Contpattern.test($("#contact").val().trim()))
        {
            $('#contact').css('border', 'solid 1px red');
        }
            else if(!$("#referenceno").val().trim()||!Refpattern.test($("#referenceno").val().trim()))
        {

            $('#referenceno').css('border', 'solid 1px red');

        }
        else{
            document.getElementById("mainform").submit();
        }
    }

    else if(Category=="Technical call")
    {

        if(!jQuery("input[name=HeatCheck]:checked").val()||!techContPatrn.test($("#contact").val().trim())||!$("#solution").val().trim()||!$("#warrantydetails").val().trim()||!$("#machineSerial").val().trim()||!$("#emailid").val().trim())
        {

          if(!jQuery("input[name=HeatCheck]:checked").val()){

         $('#htckredioV').css('border', 'solid 1px red');
         $('#htckredioV').css('background' , "#FFCECE");
         }



            if(!techContPatrn.test($("#contact").val().trim()))
            {
            $('#contact').css('border', 'solid 1px red');
            }
            if( !$("#machineSerial").val().trim())
            {
                $('#machineSerial').css('border', 'solid 1px red');
            }
                    if($("#emailid").val().trim()=="")
            {
                $('#emailid').css('border', 'solid 1px red');
            }
            if($("#issue").val().trim()=="")
            {

                  $('#issue').css('border', 'solid 1px red');

            }
            if($("#warrantydetails").val().trim()=="")
            {
                $('#warrantydetails').css('border', 'solid 1px red');

            }
            if($("#solution").val().trim()=="")
            {
                $('#solution').css('border', 'solid 1px red');

            }
            return;
        }

        else if($('#solution').val().trim()=="FOC"){

            if($("#servicetype").val().trim()=="")
            {
               $('#servicetype').css('border', 'solid 1px red');
                return;
            }
            else{
           document.getElementById("mainform").submit();

            }
        }
 else if($('#solution').val().trim()=="Snapshot Request"){

            var message="Please send snapshot to"+ $('#casemanager').val();

             ThinkMessage($('#contact').val(),message);

            }

        else{
            document.getElementById("mainform").submit();

        }

    }

    else if(Category=="Status call")
    {



        if(!jQuery("input[name=HeatCheck]:checked").val()||!$("#status").val().trim()||!$("#contact").val().trim())
        {


            if(!jQuery("input[name=HeatCheck]:checked").val()){

         $('#htckredioV').css('border', 'solid 1px red');
         $('#htckredioV').css('background' , "#FFCECE");
         }


            if($("#status").val().trim()=="")
            {

                $('#status').css('border', 'solid 1px red');
            }
          
            if( !$("#contact").val().trim())
            {

              $('#contact').css('border', 'solid 1px red');
            }


            return;
        }
        else{
           document.getElementById("mainform").submit();

        }


    }

}

function ThinkMessage(number,msg){
isPaused = true;
$('#WaitImage').css("display","block");
    xmlHttp= new XMLHttpRequest();
    var url = 'http://103.16.101.52:8080/bulksms/bulksms?username=hry-lenovo&password=lenovo&type=0&dlr=0&destination=91'+number+'&source=Lenovo&message='+encodeURIComponent(msg);
   xmlHttp.open("GET", url, true);
   xmlHttp.onreadystatechange= function(){
       if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
    {
               $('#WaitImage').css("display","none");
                alertify.alert("Email Id Sent To Customer");
                document.getElementById("mainform").submit();
 }
       
   }

    xmlHttp.send(null);
}
