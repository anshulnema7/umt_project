/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


function Message(number,msg){
//    alert(msg);
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
    xmlHttp.onreadystatechange = MessageSent;
    xmlHttp.open("GET", url, true);
    xmlHttp.send(null);

}
function MessageSent()
{
    if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
    {
       //alert("Sent");

        return;
    }
}