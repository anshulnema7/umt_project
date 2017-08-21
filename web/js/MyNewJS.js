/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function POPMobileValidate() {
    var mobile = document.getElementById("contact").value.trim();
    var pattern = /^[789]\d{9}$/;

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

    xmlHttp.onreadystatechange = POPUpdate;
    xmlHttp.open("GET", url, true);
    xmlHttp.send(null);
}
function POPUpdate()
{
    if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
    {
        alert("Message sent to customer.");
         $('#popform').submit();

    }
}





function validatePOPForm2()
{
 
     
    if(!$("#timeOfMail").val().trim()||!$("#email").val().trim()){
        if(!$("#timeOfMail").val().trim())
        {
         $('#timeOfMail').css('border', 'solid 1px red');
         $('#timeOfMail').css('background' , "#FFCECE");
          
        }
       if(!$("#email").val().trim())
        {
        $('#email').css('border', 'solid 1px red');
         $('#email').css('background' , "#FFCECE");
           
        }
        return;
    }


    else

    {
      $('#timeOfMail').css('border', '');
      $('#email').css('border', '');
      $('#timeOfMail').css('background' , "");
      $('#email').css('background' , "");
}
 var ReasonOfRejection = $('.popreason:checked').map(function() {return this.value;}).get().join('\n');
 
  
  if((!$("#status").val().trim()||$("#status").val().trim()==="Updated"||$("#status").val().trim()==="Already Updated")&& $("#RequestType").val().trim()==="POP")
  
  {
       $('#comment').css('border', '');
       $('#comment').css('background', "");
      if(!$("#replyStatus").val().trim()||!$("#status").val().trim()||!$("#PurcDate").val().trim()||!$("#machinemodel").val().trim()||!$("#MTM").val().trim()||!$("#machineSerial").val().trim())
      {
          if(!$("#replyStatus").val().trim()){
         $('#replyStatus').css('border', 'solid 1px red');
         $('#replyStatus').css('background' , "#FFCECE");
          }
          
          if(!$("#status").val().trim()){
         $('#status').css('border', 'solid 1px red');
         $('#status').css('background' , "#FFCECE");
          }
          
         if(!$("#PurcDate").val().trim()){
         $('#PurcDate').css('border', 'solid 1px red');
         $('#PurcDate').css('background' , "#FFCECE");
           }
         
         if(!$("#machinemodel").val().trim()){
         $('#machinemodel').css('border', 'solid 1px red');
         $('#machinemodel').css('background' , "#FFCECE");
     }
     
     if(!$("#MTM").val().trim()){
         $('#MTM').css('border', 'solid 1px red');
         $('#MTM').css('background' , "#FFCECE");
     }
     
     if(!$("#machineSerial").val().trim()){
         $('#machineSerial').css('border', 'solid 1px red');
         $('#machineSerial').css('background' , "#FFCECE");
     }
     
   
            return ; 
         
         
     }

   else if($("#status").val().trim()==="Updated"&&$("#contact").val().trim()&& POPMobileValidate())
  {
    
           var message = "Thank you for contacting Lenovo,your system warranty has been updated for SN:"+$("#machineSerial").val().trim().toUpperCase()+", Please Check your email for details.";
           MyMessage($("#contact").val().trim(),message);
  }
     else{
          //  document.getElementById("popform").submit();
           $('#popform').submit();

           }
  }

  
   else if($("#status").val().trim()==="Rejected")
    {
        $('#status').css('border', '');
        $('#status').css('background', "");

        $('#PurcDate').css('border', '');
        $('#PurcDate').css('background', "");

        $('#machinemodel').css('border', '');
        $('#machinemodel').css('background', "");

        $('#MTM').css('border', '');
        $('#MTM').css('background', "");

        $('#machineSerial').css('border', '');
        $('#machineSerial').css('background', "");

       
if(ReasonOfRejection===""||!$("#replyStatus").val().trim()){
           if(ReasonOfRejection==="")
                {
                 $('#reasonchklist').css('border', 'solid 2px red');
                 $('#reasonchklist').css('background', "#FFCECE");
                }
            if(!$("#replyStatus").val().trim())
                {
                $('#replyStatus').css('border', 'solid 2px red');
                $('#replyStatus').css('background', "#FFCECE");    
                }
                return ;
 }
        else{
           $('#popform').submit();
         }
    }
    
      else if($("#status").val().trim()==="Escalated")
      {
          
          
        

        $('#status').css('border', '');
        $('#status').css('background', "");

        $('#PurcDate').css('border', '');
        $('#PurcDate').css('background', "");

        $('#machinemodel').css('border', '');
        $('#machinemodel').css('background', "");

        $('#MTM').css('border', '');
        $('#MTM').css('background', "");

        $('#machineSerial').css('border', '');
        $('#machineSerial').css('background', "");

      
        
             if(!$("#comment").val().trim()||!$("#replyStatus").val().trim()){
           if(!$("#comment").val().trim())
               {
                     $('#comment').css('border', 'solid 2px red');
                     $('#comment').css('background', "#FFCECE");
                }
            if(!$("#replyStatus").val().trim())
                {
                $('#replyStatus').css('border', 'solid 2px red');
                $('#replyStatus').css('background', "#FFCECE");    
                }
                return ;
 }
        else{
           $('#popform').submit();
         }
          
      }
    
   else if($("#status").val().trim()==="Wrong channel")
      {
          
          
        

        $('#status').css('border', '');
        $('#status').css('background', "");

        $('#PurcDate').css('border', '');
        $('#PurcDate').css('background', "");

        $('#machinemodel').css('border', '');
        $('#machinemodel').css('background', "");

        $('#MTM').css('border', '');
        $('#MTM').css('background', "");

        $('#machineSerial').css('border', '');
        $('#machineSerial').css('background', "");

       
             if(!$("#comment").val().trim()||!$("#replyStatus").val().trim()){
           if(!$("#comment").val().trim())
               {
                     $('#comment').css('border', 'solid 2px red');
                     $('#comment').css('background', "#FFCECE");
                }
            if(!$("#replyStatus").val().trim())
                {
                $('#replyStatus').css('border', 'solid 2px red');
                $('#replyStatus').css('background', "#FFCECE");    
                }
                return ;
 }
        else{
           $('#popform').submit();
         }
          
      }
     
    
    







}

function ClearValidatePOPForm()
{
    
         $('#replyStatus').css('border', '');
         $('#replyStatus').css('background', "");

         $('#status').css('border', '');
         $('#status').css('background', "");

         $('#PurcDate').css('border', '');
         $('#PurcDate').css('background', "");

         $('#machinemodel').css('border', '');
         $('#machinemodel').css('background', "");

         $('#MTM').css('border', '');
         $('#MTM').css('background', "");

         $('#machineSerial').css('border', '');
         $('#machineSerial').css('background', "");

         $('#ManufacturingDate').css('border', '');
         $('#ManufacturingDate').css('background', "");
        
         $('#timeOfMail').css('border', '');
         $('#timeOfMail').css('background', "");
        
         $('#email').css('border', '');
         $('#email').css('background', "");
        
         $('#escalatedStatus').css('border', '');
         $('#escalatedStatus').css('background', "");
        
         $('#reasonchklist').css('border', '1px solid');
         $('#reasonchklist').css('background', "");
         
         $('#comment').css('border', '');
         $('#comment').css('background', "");
        document.getElementById('divRejection').style.display = "none";
    

}

