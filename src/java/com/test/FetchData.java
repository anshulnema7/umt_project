package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.swing.JOptionPane;


public class FetchData {

 private List<String> SubCategory;
   private List<String> stateList;

public static ArrayList<CdsGetSet> getPopReport(String dateFrm,String status ) throws ClassNotFoundException, InstantiationException, IllegalAccessException {


        ArrayList<CdsGetSet> countryList = new ArrayList<CdsGetSet>();
        Connection conn = null;
        Statement s = null;
        ResultSet rs = null;
        String RepQuery="";

        try {


            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lenoogle_db", "root", "system");
            s = conn.createStatement();


            if(status.equals("POP"))
            {

                RepQuery="select * from lenoogle_db.pop_database WHERE `Date`='"+dateFrm+"'" ;

            }



              rs = s.executeQuery(RepQuery);

            while(rs.next()) {

             CdsGetSet GetSetPOP = new CdsGetSet();
             GetSetPOP.setDate(rs.getString("Date"));
             GetSetPOP.setTime(rs.getString("Time"));
             GetSetPOP.setCRM_ID(rs.getString("CRM_ID"));
             GetSetPOP.setTime_of_Email(rs.getString("Time_of_Email"));
             GetSetPOP.setEmail_ID(rs.getString("Email_ID"));
             GetSetPOP.setM_C_Model(rs.getString("M_C_Model"));
             GetSetPOP.setMTM(rs.getString("MTM"));
             GetSetPOP.setMachine_Serial(rs.getString("Machine_Serial"));
             GetSetPOP.setPurchase_Date(rs.getString("Purchase_Date"));
             GetSetPOP.setRequest_Type(rs.getString("Request_Type"));
             GetSetPOP.setReplyStatus(rs.getString("ReplyStatus"));
             GetSetPOP.setStatus(rs.getString("Status"));
             GetSetPOP.setReasonOfRejection(rs.getString("ReasonOfRejection"));
             GetSetPOP.setEscalated_Status(rs.getString("Escalated_Status"));
             GetSetPOP.setFinalStatus(rs.getString("FinalStatus"));
             GetSetPOP.setComment(rs.getString("Comment"));
             GetSetPOP.setManufacturingDate(rs.getString("ManufacturingDate"));


             countryList.add(GetSetPOP);


    }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return countryList;
    }





 public static ArrayList<CdsGetSet> getPopReport(String dateFrm,String status ,String Rfor) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
 
 
        ArrayList<CdsGetSet> countryList = new ArrayList<CdsGetSet>();
        Connection conn = null;
        Statement s = null;
        ResultSet rs = null;
        String RepQuery="";

        try {
     

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lenoogle_db", "root", "system");
            s = conn.createStatement();
           


            if(status.equals("CC Report")&&Rfor.equals("All"))
            {

                RepQuery="select * from lenoogle_db.lenovo_calltracker_database1 WHERE `Date`='"+dateFrm+"'" ;
            
            }

              else if(status.equals("CC Report")&& Rfor.equals("RedFlag"))
            {

                  RepQuery="select * from lenoogle_db.lenovo_calltracker_database1 WHERE `Date`='"+dateFrm+"' and `Red_Flag`='Yes'";

              }


              else if(status.equals("CC Report")&&Rfor.equals("CallCount"))
            {

                  RepQuery ="select * from lenoogle_db.lenovo_calltracker_database1 WHERE `Date`='"+dateFrm+"' and `Customer_Callcount`>2";

              }


           else if(status.equals("CC Report")&&Rfor.equals("Technical Call Drop"))
            {

              RepQuery="select * from lenoogle_db.lenovo_calltracker_database1 WHERE `Date`='"+dateFrm+"' and `Call_Category`='Technical call' and m1='Yes' ";

           }




              rs = s.executeQuery(RepQuery);

            while(rs.next()) {
   
             CdsGetSet GetLenoogle = new CdsGetSet();

             GetLenoogle.setTYPE(rs.getString("Call_Type"));
             GetLenoogle.setCategory(rs.getString("Call_Category"));
             GetLenoogle.setDate(rs.getString("Date"));
             GetLenoogle.setTime(rs.getString("Time"));
             GetLenoogle.setCRM_ID(rs.getString("Agent_CRM_ID"));
             GetLenoogle.setTM(rs.getString("Team_Name"));
             GetLenoogle.setCcContactedBy(rs.getString("CC_contactedBy"));
             GetLenoogle.setSerialNumber(rs.getString("Serial_Number"));
             GetLenoogle.setContactNumber(rs.getString("Contact_Number"));
             GetLenoogle.setEmpID(rs.getString("fop_email"));
             GetLenoogle.setWarrantyStatus(rs.getString("Warranty_Status"));
             GetLenoogle.setWDuration(rs.getString("Warranty_duration"));
             GetLenoogle.setIssue(rs.getString("issue"));
             GetLenoogle.setSecondIssue(rs.getString("SecondIssue"));
             GetLenoogle.setThirdIssue(rs.getString("ThirdIssue"));
             GetLenoogle.setStatus(rs.getString("Status"));
             GetLenoogle.setSR_NBR(rs.getString("Reference_Number"));
             GetLenoogle.setFop(rs.getString("FOP"));
             GetLenoogle.setPoptechnicalcall(rs.getString("poptechnicalcall"));
             GetLenoogle.setFocNeeded(rs.getString("FOC_Needed"));
             GetLenoogle.setServiceType(rs.getString("Service_Type"));
             GetLenoogle.setPartNumber(rs.getString("Parts_Number"));
             GetLenoogle.setSatDsat(rs.getString("CSAT_DSAT"));
             GetLenoogle.setRed_Flag(rs.getString("Red_Flag"));
             GetLenoogle.setLmgrName(rs.getString("Manager_Involved"));
             GetLenoogle.setFollow_Up(rs.getString("Follow_Up"));
             GetLenoogle.setFollow_Up_Date(rs.getString("Follow_Up_Date"));
             GetLenoogle.setComment(rs.getString("Comment"));
             GetLenoogle.setCallCount(rs.getString("Customer_Callcount"));

             countryList.add(GetLenoogle);

            
    }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return countryList;
    }




 public static ArrayList<CdsGetSet> FSInboxSearch(String Date, String Status) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        ArrayList<CdsGetSet> countryList = new ArrayList<CdsGetSet>();
        Connection conn = null;
        Statement s = null;
        ResultSet rs = null;
        String query=null;
        try {
 //  JOptionPane.showMessageDialog(null, "in FSInboxSearch");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lenoogle_db", "root", "system");
            s = conn.createStatement();
           
           query="select * from lenoogle_db.fs_database WHERE processed_date='"+Date+"'";
         
            rs = s.executeQuery(query);

            while(rs.next()) {


              CdsGetSet GetSetFS = new CdsGetSet();

            GetSetFS.setDate(rs.getString("processed_date"));
            GetSetFS.setTime(rs.getString("processed_time"));
            GetSetFS.setCRM_ID(rs.getString("CRM_ID"));
            GetSetFS.setCategory(rs.getString("category"));

           // JOptionPane.showMessageDialog(null, rs.getString("processed_date"));
            GetSetFS.setRequest_status(rs.getString("request_status"));
            GetSetFS.setTime_of_Email(rs.getString("time_of_email"));
            GetSetFS.setMachine_Serial(rs.getString("machine_serial"));
            GetSetFS.setM_C_Model(rs.getString("model_number"));
            GetSetFS.setRequested_so_number(rs.getString("requested_so_number"));
            GetSetFS.setOld_so_vendor(rs.getString("old_so_vendor"));
            GetSetFS.setReason_for_newSo(rs.getString("reason_for_newSo"));
            GetSetFS.setNew_sonumber(rs.getString("new_sonumber"));
            GetSetFS.setAdp_cid(rs.getString("adp_cid"));
            GetSetFS.setRepeat_so(rs.getString("repeat_so"));
            GetSetFS.setTotal_parts_sent_newso(rs.getString("total_parts_sent_newso"));
            GetSetFS.setTotal_so(rs.getString("total_so"));
            GetSetFS.setApprover(rs.getString("approver"));
            GetSetFS.setPpsn(rs.getString("ppsn"));
            GetSetFS.setNew_vendorso(rs.getString("new_vendorso"));
            GetSetFS.setComment(rs.getString("comments"));
            GetSetFS.setStatus(rs.getString("status"));

            countryList.add(GetSetFS);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return countryList;
    }


      public static ArrayList<CdsGetSet> MultiSearchLenooogleInbox(String Query) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

                 ArrayList<CdsGetSet> countryList = new ArrayList<CdsGetSet>();
        Connection conn = null;
        Statement s = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String connectionString = "jdbc:mysql://localhost:3306/lenoogle_db?user=root&password=system&useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&failOverReadOnly=false&maxReconnects=10";
            conn = DriverManager.getConnection(connectionString);
            s = conn.createStatement();
            rs = s.executeQuery(Query);
            while(rs.next()) {
             CdsGetSet GetLenoogle=new CdsGetSet();

             GetLenoogle.setTYPE(rs.getString("Call_Type"));
            
             GetLenoogle.setCategory(rs.getString("Call_Category"));
             GetLenoogle.setDate(rs.getString("Date"));
             GetLenoogle.setTime(rs.getString("Time"));
             GetLenoogle.setCRM_ID(rs.getString("Agent_CRM_ID"));
//             JOptionPane.showMessageDialog(null, rs.getString("Agent_CRM_ID"));
             GetLenoogle.setTM(rs.getString("Team_Name"));
             GetLenoogle.setSerialNumber(rs.getString("Serial_Number"));
             GetLenoogle.setSR_NBR(rs.getString("Reference_Number"));
//JOptionPane.showMessageDialog(null, rs.getString("Reference_Number"));
             GetLenoogle.setWarrantyStatus(rs.getString("Warranty_Status"));
             GetLenoogle.setContactNumber(rs.getString("Contact_Number"));
             GetLenoogle.setCall_count(rs.getString("Customer_Callcount"));
             GetLenoogle.setIssue(rs.getString("issue"));
             GetLenoogle.setStatus(rs.getString("Status"));
             GetLenoogle.setRed_Flag(rs.getString("Red_Flag"));
             GetLenoogle.setEscalated_Status(rs.getString("Escalation_Call"));
             GetLenoogle.setLmgrName(rs.getString("Manager_Involved"));
             GetLenoogle.setFollow_Up(rs.getString("Follow_Up"));
             GetLenoogle.setFollow_Up_Date(rs.getString("Follow_Up_Date"));
             GetLenoogle.setFocNeeded(rs.getString("FOC_Needed"));
             GetLenoogle.setServiceType(rs.getString("Service_Type"));
             GetLenoogle.setPartNumber(rs.getString("Parts_Number"));
             GetLenoogle.setSatDsat(rs.getString("CSAT_DSAT"));
             GetLenoogle.setComment(rs.getString("Comment"));
             GetLenoogle.setFop(rs.getString("FOP"));
             GetLenoogle.setEmpID(rs.getString("fop_email"));
             GetLenoogle.setPoptechnicalcall(rs.getString("m1"));
             GetLenoogle.setCustomerCallBack(rs.getString("m2"));
             GetLenoogle.setWarrantyExp45(rs.getString("m3"));
             GetLenoogle.setWDuration(rs.getString("Warranty_duration"));
             GetLenoogle.setCcContactedBy(rs.getString("CC_contactedBy"));
             GetLenoogle.setSecondIssue(rs.getString("SecondIssue"));
             GetLenoogle.setThirdIssue(rs.getString("ThirdIssue"));
             GetLenoogle.setPoptechnicalcall(rs.getString("poptechnicalcall"));
             GetLenoogle.setCRM_HEADER_STATUS(rs.getString("CRM_PD"));
             GetLenoogle.setLenoogle_ID(rs.getString("Lenoogle_id"));
             GetLenoogle.setName(rs.getString("Customer_Name"));
             GetLenoogle.setModel_name(rs.getString("Machine_Model"));
             GetLenoogle.setAltContact(rs.getString("Alt_Contact_Number"));
//             JOptionPane.showMessageDialog(null, rs.getString("Alt_Contact_Number"));
            
            countryList.add(GetLenoogle);

            }
        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }

        return countryList;
    }

      
      
    public List<String> getDataList(String Query) throws InstantiationException, IllegalAccessException {

     stateList = new ArrayList<String>();

        Connection conn = null;
        Statement s = null;
        ResultSet rs = null;


        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/techupdate", "root", "system");
            s = conn.createStatement();
            rs = s.executeQuery(Query);


            while (rs.next()) {

                stateList.add(rs.getString(1));

            }

        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    s.close();
                   // s1.close();
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return stateList;
    }


    
    
      public static ArrayList<CdsGetSet> MultiSearchLenooogleInboxDRMode(String Query) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

                 ArrayList<CdsGetSet> countryList = new ArrayList<CdsGetSet>();
        Connection conn = null;
        Statement s = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String connectionString = "jdbc:mysql://localhost:3306/lenoogle_db?user=root&password=system&useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&failOverReadOnly=false&maxReconnects=10";
            conn = DriverManager.getConnection(connectionString);
            s = conn.createStatement();
            rs = s.executeQuery(Query);
            while(rs.next()) {
             CdsGetSet GetLenoogle=new CdsGetSet();

             GetLenoogle.setDate(rs.getString("Date"));
             GetLenoogle.setTime(rs.getString("Time"));
             GetLenoogle.setTYPE(rs.getString("Call_Type"));
             GetLenoogle.setCategory(rs.getString("Call_Category"));
             GetLenoogle.setSub(rs.getString("Sub_Status"));
             GetLenoogle.setContactNumber(rs.getString("Contact_Number"));
             GetLenoogle.setCase_Type(rs.getString("Case_Type"));
             GetLenoogle.setService_Request_Number(rs.getString("Existing_Reference_Number"));
             GetLenoogle.setName(rs.getString("Customer_Name"));
             GetLenoogle.setAltContact(rs.getString("Alt_Contact_Number"));
             GetLenoogle.setEmpID(rs.getString("Email_ID"));
             GetLenoogle.setStreet(rs.getString("Street"));
             GetLenoogle.setHouse_Number(rs.getString("House_Number"));
             GetLenoogle.setPincode(rs.getString("Pincode"));
             GetLenoogle.setCity(rs.getString("City"));
             GetLenoogle.setIssue(rs.getString("Issue"));
             GetLenoogle.setFop(rs.getString("FOP"));
             GetLenoogle.setDescription(rs.getString("Description"));
             GetLenoogle.setProblem_Description(rs.getString("Problem_Description"));
             GetLenoogle.setNeed_To_Create(rs.getString("Need_To_Create"));
             GetLenoogle.setComment(rs.getString("Comments"));
             GetLenoogle.setCRM_ID(rs.getString("Agent_CRM_ID"));
             GetLenoogle.setTM(rs.getString("Team_Manager")); 
             GetLenoogle.setSerialNumber(rs.getString("Serial_Number"));
             GetLenoogle.setLOB(rs.getString("LOB"));
             
            
//             JOptionPane.showMessageDialog(null, rs.getString("Alt_Contact_Number"));
            
            countryList.add(GetLenoogle);

            }
        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
finally{
rs.close();
s.close();
conn.close();
        }
        return countryList;
    }

      

      
      
      
      
      
}