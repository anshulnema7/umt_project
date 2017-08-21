/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


$(function () {

    $("#dialog-form").dialog({
        autoOpen: false,
        height: 520,
        width: 900,
        modal: true,
        draggable: false,
        resizable: false,
        buttons: {

            "Close": function () {
                $(this).dialog("close");
            }
        }
    });

    $("#overall-comments").click(function () {
        $("#dialog-form").dialog("open");
    });


     $("#cds-form").dialog({
        autoOpen: false,
        height: 540,
        width: 1050,
        modal: true,
        draggable: false,
        resizable: false,
        buttons: {

            "Close": function () {
                $(this).dialog("close");
            }
        }
    });
     $("#click-cds-form").click(function () {
        $("#cds-form").dialog("open");
    });


  $("#dialog-form-secondso").dialog({
        autoOpen: false,
        height: 550,
        width: 1300,
        modal: true,
        draggable: false,
        resizable: false,
        buttons: {

            "Close": function () {
                $(this).dialog("close");
            }
        }
    });


$("#PicChange").click(function(event){
                    return !window.open(this.href, "pop", "width=500,height=550,top=50,left=500,resizable=no,fullscreen=no");
                });

});



  
