/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

/**
 *
 * @author X220
 */
public class CdsGetSet {

    public CdsGetSet() {
        //default constructor
    }
private String Street;
private String House_Number;
private String Pincode;
private String City;
private String Description;
private String Need_To_Create;
    private String Case_Type;
    
    
    private String Date_Received;
    private String Overall_Satisfaction;
    private String Overall_Satisfaction_Comment;
    private String Case_Resolved_Y_N;
    private String Transaction_Number;
    private String Data_Feed_Service_Delivery_Type;
    private String Data_Feed_Transaction_Reported_Received_Date;
    private String Serial_Number;
    private String Incident_Handling_Comment;
    private String QA;
    private String CC_WAI;
    private String Accessibility;
    private String Communication;
    private String Technical_Expertise;
    private String Avg_CC_WAI;
    private String CountOfSurvey;
    /*
    MSN SR Catalog Strings
     */
    private String Service_Request_Number;
    private String Service_Request_Created_By_CC_Agent;
    private String Service_Request_Create_Date;
    private String Service_Request_Status_Name;
    private String Problem_Description;
    /*
    MSN SO Catalog Strings
     */
    private String CRM_SO_CREATED_DATE;
    private String SR_NBR;
    private String SO_NBR;
    private String TYPE;
    private String CRM_SERVICE_SUB_CAT;
    private String CRM_DROP_POINT_BY_VENDOR_ID;
    private String CRM_HEADER_STATUS;
    private String CRM_PART_NBR;
    private String CRM_PARTS_ITEM_STATUS;
    private String CRM_LABOR_ITEM_STATUS;
    private String CRM_PROBLEM_DESC;
    /**
     * POP Report String...
     */
    private String Date;
    private String Time;
    private String CRM_ID;
    private String Time_of_Email;
    private String Email_ID;
    private String M_C_Model;
    private String MTM;
    private String Machine_Serial;
    private String Purchase_Date;
    private String Request_Type;
    private String ReplyStatus;
    private String Status;
    private String ReasonOfRejection;
    private String Escalated_Status;
    private String FinalStatus;
    private String Comment;
    private String ManufacturingDate;
    /**
     * Employee Details For Quality..
     */
    private String EmpID;
    private String CRM_ID_For_QA;
    private String Name;
    private String LOB;
    private String Roll;
    private String Sub;
    private String TM;
    private String LastWorkingDay;
    private String DOJ;
    /**
     * fatch Lenoogle data
     */
    private String serialNumber;
    private String warrantyStatus;
    private String ccContactedBy;
    private String contactNumber;
    private String issue;
    private String satDsat;
    private String fop;
    private String focNeeded;
    private String serviceType;
    private String partRequired;
    private String partNumber;
    /**
     * FS String
     */
    private String category;
    private String request_status;
    private String requested_so_number;
    private String old_so_vendor;
    private String reason_for_newSo;
    private String new_sonumber;
    private String adp_cid;
    private String repeat_so;
    private String total_parts_sent_newso;
    private String total_so;
    private String approver;
    private String ppsn;
    private String new_vendorso;

    /*
     * lenoogle Inbox Search
     */
    private String Red_Flag;
    private String CSAT_DSAT;
    private String CCContactBy;
    private String WDuration;
    private String SecondIssue;
    private String ThirdIssue;
    private String poptechnicalcall;
    private String lmgrName;
    private String Follow_Up;
    private String Follow_Up_Date;
    private String callCount;
    
    
    private String Call_count;
    private String CustomerCallBack;
    private String WarrantyExp45;
    private String Lenoogle_ID;
    private String Model_name;
    private String AltContact;



    /**
     * @return the Date_Received
     */
    public String getDate_Received() {
        return Date_Received;
    }

    /**
     * @param Date_Received the Date_Received to set
     */
    public void setDate_Received(String Date_Received) {
        this.Date_Received = Date_Received;
    }

    /**
     * @return the Overall_Satisfaction
     */
    public String getOverall_Satisfaction() {
        return Overall_Satisfaction;
    }

    /**
     * @param Overall_Satisfaction the Overall_Satisfaction to set
     */
    public void setOverall_Satisfaction(String Overall_Satisfaction) {
        this.Overall_Satisfaction = Overall_Satisfaction;
    }

    /**
     * @return the Overall_Satisfaction_Comment
     */
    public String getOverall_Satisfaction_Comment() {
        return Overall_Satisfaction_Comment;
    }

    /**
     * @param Overall_Satisfaction_Comment the Overall_Satisfaction_Comment to set
     */
    public void setOverall_Satisfaction_Comment(String Overall_Satisfaction_Comment) {
        this.Overall_Satisfaction_Comment = Overall_Satisfaction_Comment;
    }

    /**
     * @return the Case_Resolved_Y_N
     */
    public String getCase_Resolved_Y_N() {
        return Case_Resolved_Y_N;
    }

    /**
     * @param Case_Resolved_Y_N the Case_Resolved_Y_N to set
     */
    public void setCase_Resolved_Y_N(String Case_Resolved_Y_N) {
        this.Case_Resolved_Y_N = Case_Resolved_Y_N;
    }

    /**
     * @return the Transaction_Number
     */
    public String getTransaction_Number() {
        return Transaction_Number;
    }

    /**
     * @param Transaction_Number the Transaction_Number to set
     */
    public void setTransaction_Number(String Transaction_Number) {
        this.Transaction_Number = Transaction_Number;
    }

    /**
     * @return the Data_Feed_Service_Delivery_Type
     */
    public String getData_Feed_Service_Delivery_Type() {
        return Data_Feed_Service_Delivery_Type;
    }

    /**
     * @param Data_Feed_Service_Delivery_Type the Data_Feed_Service_Delivery_Type to set
     */
    public void setData_Feed_Service_Delivery_Type(String Data_Feed_Service_Delivery_Type) {
        this.Data_Feed_Service_Delivery_Type = Data_Feed_Service_Delivery_Type;
    }

    /**
     * @return the Data_Feed_Transaction_Reported_Received_Date
     */
    public String getData_Feed_Transaction_Reported_Received_Date() {
        return Data_Feed_Transaction_Reported_Received_Date;
    }

    /**
     * @param Data_Feed_Transaction_Reported_Received_Date the Data_Feed_Transaction_Reported_Received_Date to set
     */
    public void setData_Feed_Transaction_Reported_Received_Date(String Data_Feed_Transaction_Reported_Received_Date) {
        this.Data_Feed_Transaction_Reported_Received_Date = Data_Feed_Transaction_Reported_Received_Date;
    }

    /**
     * @return the Serial_Number
     */
    public String getSerial_Number() {
        return Serial_Number;
    }

    /**
     * @param Serial_Number the Serial_Number to set
     */
    public void setSerial_Number(String Serial_Number) {
        this.Serial_Number = Serial_Number;
    }

    /**
     * @return the Incident_Handling_Comment
     */
    public String getIncident_Handling_Comment() {
        return Incident_Handling_Comment;
    }

    /**
     * @param Incident_Handling_Comment the Incident_Handling_Comment to set
     */
    public void setIncident_Handling_Comment(String Incident_Handling_Comment) {
        this.Incident_Handling_Comment = Incident_Handling_Comment;
    }

    /**
     * @return the QA
     */
    public String getQA() {
        return QA;
    }

    /**
     * @param QA the QA to set
     */
    public void setQA(String QA) {
        this.QA = QA;
    }

    /**
     * @return the CC_WAI_Satisfaction
     */
    public String getCC_WAI() {
        return CC_WAI;
    }

    public void setCC_WAI(String CC_WAI) {
        this.CC_WAI = CC_WAI;
    }

    /**
     * @return the Accessibility
     */
    public String getAccessibility() {
        return Accessibility;
    }

    /**
     * @param Accessibility the Accessibility to set
     */
    public void setAccessibility(String Accessibility) {
        this.Accessibility = Accessibility;
    }

    /**
     * @return the Communication
     */
    public String getCommunication() {
        return Communication;
    }

    /**
     * @param Communication the Communication to set
     */
    public void setCommunication(String Communication) {
        this.Communication = Communication;
    }

    /**
     * @return the Technical_Expertise
     */
    public String getTechnical_Expertise() {
        return Technical_Expertise;
    }

    /**
     * @param Technical_Expertise the Technical_Expertise to set
     */
    public void setTechnical_Expertise(String Technical_Expertise) {
        this.Technical_Expertise = Technical_Expertise;
    }

    /**
     * @return the Avg_CC_WAI
     */
    public String getAvg_CC_WAI() {
        return Avg_CC_WAI;
    }

    /**
     * @param Avg_CC_WAI the Avg_CC_WAI to set
     */
    public void setAvg_CC_WAI(String Avg_CC_WAI) {
        this.Avg_CC_WAI = Avg_CC_WAI;
    }

    /**
     * @return the CountOfSurvey
     */
    public String getCountOfSurvey() {
        return CountOfSurvey;
    }

    /**
     * @param CountOfSurvey the CountOfSurvey to set
     */
    public void setCountOfSurvey(String CountOfSurvey) {
        this.CountOfSurvey = CountOfSurvey;
    }

    /**
     * @return the Service_Request_Number
     */
    public String getService_Request_Number() {
        return Service_Request_Number;
    }

    /**
     * @param Service_Request_Number the Service_Request_Number to set
     */
    public void setService_Request_Number(String Service_Request_Number) {
        this.Service_Request_Number = Service_Request_Number;
    }

    /**
     * @return the Service_Request_Created_By_CC_Agent
     */
    public String getService_Request_Created_By_CC_Agent() {
        return Service_Request_Created_By_CC_Agent;
    }

    /**
     * @param Service_Request_Created_By_CC_Agent the Service_Request_Created_By_CC_Agent to set
     */
    public void setService_Request_Created_By_CC_Agent(String Service_Request_Created_By_CC_Agent) {
        this.Service_Request_Created_By_CC_Agent = Service_Request_Created_By_CC_Agent;
    }

    /**
     * @return the CRM_SO_CREATED_DATE
     */
    public String getCRM_SO_CREATED_DATE() {
        return CRM_SO_CREATED_DATE;
    }

    /**
     * @param CRM_SO_CREATED_DATE the CRM_SO_CREATED_DATE to set
     */
    public void setCRM_SO_CREATED_DATE(String CRM_SO_CREATED_DATE) {
        this.CRM_SO_CREATED_DATE = CRM_SO_CREATED_DATE;
    }

    /**
     * @return the Service_Request_Create_Date
     */
    public String getService_Request_Create_Date() {
        return Service_Request_Create_Date;
    }

    /**
     * @param Service_Request_Create_Date the Service_Request_Create_Date to set
     */
    public void setService_Request_Create_Date(String Service_Request_Create_Date) {
        this.Service_Request_Create_Date = Service_Request_Create_Date;
    }

    /**
     * @return the Service_Request_Status_Name
     */
    public String getService_Request_Status_Name() {
        return Service_Request_Status_Name;
    }

    /**
     * @param Service_Request_Status_Name the Service_Request_Status_Name to set
     */
    public void setService_Request_Status_Name(String Service_Request_Status_Name) {
        this.Service_Request_Status_Name = Service_Request_Status_Name;
    }

    /**
     * @return the Problem_Description
     */
    public String getProblem_Description() {
        return Problem_Description;
    }

    /**
     * @param Problem_Description the Problem_Description to set
     */
    public void setProblem_Description(String Problem_Description) {
        this.Problem_Description = Problem_Description;
    }

    /**
     * @return the SR_NBR
     */
    public String getSR_NBR() {
        return SR_NBR;
    }

    /**
     * @param SR_NBR the SR_NBR to set
     */
    public void setSR_NBR(String SR_NBR) {
        this.SR_NBR = SR_NBR;
    }

    /**
     * @return the SO_NBR
     */
    public String getSO_NBR() {
        return SO_NBR;
    }

    /**
     * @param SO_NBR the SO_NBR to set
     */
    public void setSO_NBR(String SO_NBR) {
        this.SO_NBR = SO_NBR;
    }

    /**
     * @return the TYPE
     */
    public String getTYPE() {
        return TYPE;
    }

    /**
     * @param TYPE the TYPE to set
     */
    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    /**
     * @return the CRM_SERVICE_SUB_CAT
     */
    public String getCRM_SERVICE_SUB_CAT() {
        return CRM_SERVICE_SUB_CAT;
    }

    /**
     * @param CRM_SERVICE_SUB_CAT the CRM_SERVICE_SUB_CAT to set
     */
    public void setCRM_SERVICE_SUB_CAT(String CRM_SERVICE_SUB_CAT) {
        this.CRM_SERVICE_SUB_CAT = CRM_SERVICE_SUB_CAT;
    }

    /**
     * @return the CRM_DROP_POINT_BY_VENDOR_ID
     */
    public String getCRM_DROP_POINT_BY_VENDOR_ID() {
        return CRM_DROP_POINT_BY_VENDOR_ID;
    }

    /**
     * @param CRM_DROP_POINT_BY_VENDOR_ID the CRM_DROP_POINT_BY_VENDOR_ID to set
     */
    public void setCRM_DROP_POINT_BY_VENDOR_ID(String CRM_DROP_POINT_BY_VENDOR_ID) {
        this.CRM_DROP_POINT_BY_VENDOR_ID = CRM_DROP_POINT_BY_VENDOR_ID;
    }

    /**
     * @return the CRM_HEADER_STATUS
     */
    public String getCRM_HEADER_STATUS() {
        return CRM_HEADER_STATUS;
    }

    /**
     * @param CRM_HEADER_STATUS the CRM_HEADER_STATUS to set
     */
    public void setCRM_HEADER_STATUS(String CRM_HEADER_STATUS) {
        this.CRM_HEADER_STATUS = CRM_HEADER_STATUS;
    }

    /**
     * @return the CRM_PART_NBR
     */
    public String getCRM_PART_NBR() {
        return CRM_PART_NBR;
    }

    /**
     * @param CRM_PART_NBR the CRM_PART_NBR to set
     */
    public void setCRM_PART_NBR(String CRM_PART_NBR) {
        this.CRM_PART_NBR = CRM_PART_NBR;
    }

    /**
     * @return the CRM_PARTS_ITEM_STATUS
     */
    public String getCRM_PARTS_ITEM_STATUS() {
        return CRM_PARTS_ITEM_STATUS;
    }

    /**
     * @param CRM_PARTS_ITEM_STATUS the CRM_PARTS_ITEM_STATUS to set
     */
    public void setCRM_PARTS_ITEM_STATUS(String CRM_PARTS_ITEM_STATUS) {
        this.CRM_PARTS_ITEM_STATUS = CRM_PARTS_ITEM_STATUS;
    }

    /**
     * @return the CRM_LABOR_ITEM_STATUS
     */
    public String getCRM_LABOR_ITEM_STATUS() {
        return CRM_LABOR_ITEM_STATUS;
    }

    /**
     * @param CRM_LABOR_ITEM_STATUS the CRM_LABOR_ITEM_STATUS to set
     */
    public void setCRM_LABOR_ITEM_STATUS(String CRM_LABOR_ITEM_STATUS) {
        this.CRM_LABOR_ITEM_STATUS = CRM_LABOR_ITEM_STATUS;
    }

    /**
     * @return the CRM_PROBLEM_DESC
     */
    public String getCRM_PROBLEM_DESC() {
        return CRM_PROBLEM_DESC;
    }

    /**
     * @param CRM_PROBLEM_DESC the CRM_PROBLEM_DESC to set
     */
    public void setCRM_PROBLEM_DESC(String CRM_PROBLEM_DESC) {
        this.CRM_PROBLEM_DESC = CRM_PROBLEM_DESC;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the Time
     */
    public String getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * @return the CRM_ID
     */
    public String getCRM_ID() {
        return CRM_ID;
    }

    /**
     * @param CRM_ID the CRM_ID to set
     */
    public void setCRM_ID(String CRM_ID) {
        this.CRM_ID = CRM_ID;
    }

    /**
     * @return the Time_of_Email
     */
    public String getTime_of_Email() {
        return Time_of_Email;
    }

    /**
     * @param Time_of_Email the Time_of_Email to set
     */
    public void setTime_of_Email(String Time_of_Email) {
        this.Time_of_Email = Time_of_Email;
    }

    /**
     * @return the Email_ID
     */
    public String getEmail_ID() {
        return Email_ID;
    }

    /**
     * @param Email_ID the Email_ID to set
     */
    public void setEmail_ID(String Email_ID) {
        this.Email_ID = Email_ID;
    }

    /**
     * @return the M_C_Model
     */
    public String getM_C_Model() {
        return M_C_Model;
    }

    /**
     * @param M_C_Model the M_C_Model to set
     */
    public void setM_C_Model(String M_C_Model) {
        this.M_C_Model = M_C_Model;
    }

    /**
     * @return the MTM
     */
    public String getMTM() {
        return MTM;
    }

    /**
     * @param MTM the MTM to set
     */
    public void setMTM(String MTM) {
        this.MTM = MTM;
    }

    /**
     * @return the Machine_Serial
     */
    public String getMachine_Serial() {
        return Machine_Serial;
    }

    /**
     * @param Machine_Serial the Machine_Serial to set
     */
    public void setMachine_Serial(String Machine_Serial) {
        this.Machine_Serial = Machine_Serial;
    }

    /**
     * @return the Purchase_Date
     */
    public String getPurchase_Date() {
        return Purchase_Date;
    }

    /**
     * @param Purchase_Date the Purchase_Date to set
     */
    public void setPurchase_Date(String Purchase_Date) {
        this.Purchase_Date = Purchase_Date;
    }

    /**
     * @return the Request_Type
     */
    public String getRequest_Type() {
        return Request_Type;
    }

    /**
     * @param Request_Type the Request_Type to set
     */
    public void setRequest_Type(String Request_Type) {
        this.Request_Type = Request_Type;
    }

    /**
     * @return the ReplyStatus
     */
    public String getReplyStatus() {
        return ReplyStatus;
    }

    /**
     * @param ReplyStatus the ReplyStatus to set
     */
    public void setReplyStatus(String ReplyStatus) {
        this.ReplyStatus = ReplyStatus;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return the ReasonOfRejection
     */
    public String getReasonOfRejection() {
        return ReasonOfRejection;
    }

    /**
     * @param ReasonOfRejection the ReasonOfRejection to set
     */
    public void setReasonOfRejection(String ReasonOfRejection) {
        this.ReasonOfRejection = ReasonOfRejection;
    }

    /**
     * @return the Escalated_Status
     */
    public String getEscalated_Status() {
        return Escalated_Status;
    }

    /**
     * @param Escalated_Status the Escalated_Status to set
     */
    public void setEscalated_Status(String Escalated_Status) {
        this.Escalated_Status = Escalated_Status;
    }

    /**
     * @return the FinalStatus
     */
    public String getFinalStatus() {
        return FinalStatus;
    }

    /**
     * @param FinalStatus the FinalStatus to set
     */
    public void setFinalStatus(String FinalStatus) {
        this.FinalStatus = FinalStatus;
    }

    /**
     * @return the Comment
     */
    public String getComment() {
        return Comment;
    }

    /**
     * @param Comment the Comment to set
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * @return the ManufacturingDate
     */
    public String getManufacturingDate() {
        return ManufacturingDate;
    }

    /**
     * @param ManufacturingDate the ManufacturingDate to set
     */
    public void setManufacturingDate(String ManufacturingDate) {
        this.ManufacturingDate = ManufacturingDate;
    }

    /**
     * @return the EmpID
     */
    public String getEmpID() {
        return EmpID;
    }

    /**
     * @param EmpID the EmpID to set
     */
    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    /**
     * @return the CRM_ID_For_QA
     */
    public String getCRM_ID_For_QA() {
        return CRM_ID_For_QA;
    }

    /**
     * @param CRM_ID_For_QA the CRM_ID_For_QA to set
     */
    public void setCRM_ID_For_QA(String CRM_ID_For_QA) {
        this.CRM_ID_For_QA = CRM_ID_For_QA;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the LOB
     */
    public String getLOB() {
        return LOB;
    }

    /**
     * @param LOB the LOB to set
     */
    public void setLOB(String LOB) {
        this.LOB = LOB;
    }

    /**
     * @return the Roll
     */
    public String getRoll() {
        return Roll;
    }

    /**
     * @param Roll the Roll to set
     */
    public void setRoll(String Roll) {
        this.Roll = Roll;
    }

    /**
     * @return the Sub
     */
    public String getSub() {
        return Sub;
    }

    /**
     * @param Sub the Sub to set
     */
    public void setSub(String Sub) {
        this.Sub = Sub;
    }

    /**
     * @return the TM
     */
    public String getTM() {
        return TM;
    }

    /**
     * @param TM the TM to set
     */
    public void setTM(String TM) {
        this.TM = TM;
    }

    /**
     * @return the LastWorkingDay
     */
    public String getLastWorkingDay() {
        return LastWorkingDay;
    }

    /**
     * @param LastWorkingDay the LastWorkingDay to set
     */
    public void setLastWorkingDay(String LastWorkingDay) {
        this.LastWorkingDay = LastWorkingDay;
    }

    /**
     * @return the DOJ
     */
    public String getDOJ() {
        return DOJ;
    }

    /**
     * @param DOJ the DOJ to set
     */
    public void setDOJ(String DOJ) {
        this.DOJ = DOJ;
    }

    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return the warrantyStatus
     */
    public String getWarrantyStatus() {
        return warrantyStatus;
    }

    /**
     * @param warrantyStatus the warrantyStatus to set
     */
    public void setWarrantyStatus(String warrantyStatus) {
        this.warrantyStatus = warrantyStatus;
    }

    /**
     * @return the ccContactedBy
     */
    public String getCcContactedBy() {
        return ccContactedBy;
    }

    /**
     * @param ccContactedBy the ccContactedBy to set
     */
    public void setCcContactedBy(String ccContactedBy) {
        this.ccContactedBy = ccContactedBy;
    }

    /**
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * @return the issue
     */
    public String getIssue() {
        return issue;
    }

    /**
     * @param issue the issue to set
     */
    public void setIssue(String issue) {
        this.issue = issue;
    }

    /**
     * @return the satDsat
     */
    public String getSatDsat() {
        return satDsat;
    }

    /**
     * @param satDsat the satDsat to set
     */
    public void setSatDsat(String satDsat) {
        this.satDsat = satDsat;
    }

    /**
     * @return the fop
     */
    public String getFop() {
        return fop;
    }

    /**
     * @param fop the fop to set
     */
    public void setFop(String fop) {
        this.fop = fop;
    }

    /**
     * @return the focNeeded
     */
    public String getFocNeeded() {
        return focNeeded;
    }

    /**
     * @param focNeeded the focNeeded to set
     */
    public void setFocNeeded(String focNeeded) {
        this.focNeeded = focNeeded;
    }

    /**
     * @return the serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * @param serviceType the serviceType to set
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * @return the partRequired
     */
    public String getPartRequired() {
        return partRequired;
    }

    /**
     * @param partRequired the partRequired to set
     */
    public void setPartRequired(String partRequired) {
        this.partRequired = partRequired;
    }

    /**
     * @return the partNumber
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * @param partNumber the partNumber to set
     */
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the request_status
     */
    public String getRequest_status() {
        return request_status;
    }

    /**
     * @param request_status the request_status to set
     */
    public void setRequest_status(String request_status) {
        this.request_status = request_status;
    }

    /**
     * @return the requested_so_number
     */
    public String getRequested_so_number() {
        return requested_so_number;
    }

    /**
     * @param requested_so_number the requested_so_number to set
     */
    public void setRequested_so_number(String requested_so_number) {
        this.requested_so_number = requested_so_number;
    }

    /**
     * @return the old_so_vendor
     */
    public String getOld_so_vendor() {
        return old_so_vendor;
    }

    /**
     * @param old_so_vendor the old_so_vendor to set
     */
    public void setOld_so_vendor(String old_so_vendor) {
        this.old_so_vendor = old_so_vendor;
    }

    /**
     * @return the reason_for_newSo
     */
    public String getReason_for_newSo() {
        return reason_for_newSo;
    }

    /**
     * @param reason_for_newSo the reason_for_newSo to set
     */
    public void setReason_for_newSo(String reason_for_newSo) {
        this.reason_for_newSo = reason_for_newSo;
    }

    /**
     * @return the new_sonumber
     */
    public String getNew_sonumber() {
        return new_sonumber;
    }

    /**
     * @param new_sonumber the new_sonumber to set
     */
    public void setNew_sonumber(String new_sonumber) {
        this.new_sonumber = new_sonumber;
    }

    /**
     * @return the adp_cid
     */
    public String getAdp_cid() {
        return adp_cid;
    }

    /**
     * @param adp_cid the adp_cid to set
     */
    public void setAdp_cid(String adp_cid) {
        this.adp_cid = adp_cid;
    }

    /**
     * @return the repeat_so
     */
    public String getRepeat_so() {
        return repeat_so;
    }

    /**
     * @param repeat_so the repeat_so to set
     */
    public void setRepeat_so(String repeat_so) {
        this.repeat_so = repeat_so;
    }

    /**
     * @return the total_parts_sent_newso
     */
    public String getTotal_parts_sent_newso() {
        return total_parts_sent_newso;
    }

    /**
     * @param total_parts_sent_newso the total_parts_sent_newso to set
     */
    public void setTotal_parts_sent_newso(String total_parts_sent_newso) {
        this.total_parts_sent_newso = total_parts_sent_newso;
    }

    /**
     * @return the total_so
     */
    public String getTotal_so() {
        return total_so;
    }

    /**
     * @param total_so the total_so to set
     */
    public void setTotal_so(String total_so) {
        this.total_so = total_so;
    }

    /**
     * @return the approver
     */
    public String getApprover() {
        return approver;
    }

    /**
     * @param approver the approver to set
     */
    public void setApprover(String approver) {
        this.approver = approver;
    }

    /**
     * @return the ppsn
     */
    public String getPpsn() {
        return ppsn;
    }

    /**
     * @param ppsn the ppsn to set
     */
    public void setPpsn(String ppsn) {
        this.ppsn = ppsn;
    }

    /**
     * @return the new_vendorso
     */
    public String getNew_vendorso() {
        return new_vendorso;
    }

    /**
     * @param new_vendorso the new_vendorso to set
     */
    public void setNew_vendorso(String new_vendorso) {
        this.new_vendorso = new_vendorso;
    }

    /**
     * @return the Red_Flag
     */
    public String getRed_Flag() {
        return Red_Flag;
    }

    /**
     * @param Red_Flag the Red_Flag to set
     */
    public void setRed_Flag(String Red_Flag) {
        this.Red_Flag = Red_Flag;
    }

    /**
     * @return the CSAT_DSAT
     */
    public String getCSAT_DSAT() {
        return CSAT_DSAT;
    }

    /**
     * @param CSAT_DSAT the CSAT_DSAT to set
     */
    public void setCSAT_DSAT(String CSAT_DSAT) {
        this.CSAT_DSAT = CSAT_DSAT;
    }

    /**
     * @return the CCContactBy
     */
    public String getCCContactBy() {
        return CCContactBy;
    }

    /**
     * @param CCContactBy the CCContactBy to set
     */
    public void setCCContactBy(String CCContactBy) {
        this.CCContactBy = CCContactBy;
    }

    /**
     * @return the WDuration
     */
    public String getWDuration() {
        return WDuration;
    }

    /**
     * @param WDuration the WDuration to set
     */
    public void setWDuration(String WDuration) {
        this.WDuration = WDuration;
    }

    /**
     * @return the SecondIssue
     */
    public String getSecondIssue() {
        return SecondIssue;
    }

    /**
     * @param SecondIssue the SecondIssue to set
     */
    public void setSecondIssue(String SecondIssue) {
        this.SecondIssue = SecondIssue;
    }

    /**
     * @return the ThirdIssue
     */
    public String getThirdIssue() {
        return ThirdIssue;
    }

    /**
     * @param ThirdIssue the ThirdIssue to set
     */
    public void setThirdIssue(String ThirdIssue) {
        this.ThirdIssue = ThirdIssue;
    }

    /**
     * @return the poptechnicalcall
     */
    public String getPoptechnicalcall() {
        return poptechnicalcall;
    }

    /**
     * @param poptechnicalcall the poptechnicalcall to set
     */
    public void setPoptechnicalcall(String poptechnicalcall) {
        this.poptechnicalcall = poptechnicalcall;
    }

    /**
     * @return the lmgrName
     */
    public String getLmgrName() {
        return lmgrName;
    }

    /**
     * @param lmgrName the lmgrName to set
     */
    public void setLmgrName(String lmgrName) {
        this.lmgrName = lmgrName;
    }

    /**
     * @return the Follow_Up
     */
    public String getFollow_Up() {
        return Follow_Up;
    }

    /**
     * @param Follow_Up the Follow_Up to set
     */
    public void setFollow_Up(String Follow_Up) {
        this.Follow_Up = Follow_Up;
    }

    /**
     * @return the Follow_Up_Date
     */
    public String getFollow_Up_Date() {
        return Follow_Up_Date;
    }

    /**
     * @param Follow_Up_Date the Follow_Up_Date to set
     */
    public void setFollow_Up_Date(String Follow_Up_Date) {
        this.Follow_Up_Date = Follow_Up_Date;
    }

    /**
     * @return the callCount
     */
    public String getCallCount() {
        return callCount;
    }

    /**
     * @param callCount the callCount to set
     */
    public void setCallCount(String callCount) {
        this.callCount = callCount;
    }

    /**
     * @return the Call_count
     */
    public String getCall_count() {
        return Call_count;
    }

    /**
     * @param Call_count the Call_count to set
     */
    public void setCall_count(String Call_count) {
        this.Call_count = Call_count;
    }

    /**
     * @return the CustomerCallBack
     */
    public String getCustomerCallBack() {
        return CustomerCallBack;
    }

    /**
     * @param CustomerCallBack the CustomerCallBack to set
     */
    public void setCustomerCallBack(String CustomerCallBack) {
        this.CustomerCallBack = CustomerCallBack;
    }

    /**
     * @return the WarrantyExp45
     */
    public String getWarrantyExp45() {
        return WarrantyExp45;
    }

    /**
     * @param WarrantyExp45 the WarrantyExp45 to set
     */
    public void setWarrantyExp45(String WarrantyExp45) {
        this.WarrantyExp45 = WarrantyExp45;
    }

    /**
     * @return the Lenoogle_ID
     */
    public String getLenoogle_ID() {
        return Lenoogle_ID;
    }

    /**
     * @param Lenoogle_ID the Lenoogle_ID to set
     */
    public void setLenoogle_ID(String Lenoogle_ID) {
        this.Lenoogle_ID = Lenoogle_ID;
    }

    /**
     * @return the Model_name
     */
    public String getModel_name() {
        return Model_name;
    }

    /**
     * @param Model_name the Model_name to set
     */
    public void setModel_name(String Model_name) {
        this.Model_name = Model_name;
    }

    /**
     * @return the AltContact
     */
    public String getAltContact() {
        return AltContact;
    }

    /**
     * @param AltContact the AltContact to set
     */
    public void setAltContact(String AltContact) {
        this.AltContact = AltContact;
    }

    /**
     * @return the Street
     */
    public String getStreet() {
        return Street;
    }

    /**
     * @param Street the Street to set
     */
    public void setStreet(String Street) {
        this.Street = Street;
    }

    /**
     * @return the House_Number
     */
    public String getHouse_Number() {
        return House_Number;
    }

    /**
     * @param House_Number the House_Number to set
     */
    public void setHouse_Number(String House_Number) {
        this.House_Number = House_Number;
    }

    /**
     * @return the Pincode
     */
    public String getPincode() {
        return Pincode;
    }

    /**
     * @param Pincode the Pincode to set
     */
    public void setPincode(String Pincode) {
        this.Pincode = Pincode;
    }

    /**
     * @return the City
     */
    public String getCity() {
        return City;
    }

    /**
     * @param City the City to set
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the Need_To_Create
     */
    public String getNeed_To_Create() {
        return Need_To_Create;
    }

    /**
     * @param Need_To_Create the Need_To_Create to set
     */
    public void setNeed_To_Create(String Need_To_Create) {
        this.Need_To_Create = Need_To_Create;
    }

    /**
     * @return the Case_Type
     */
    public String getCase_Type() {
        return Case_Type;
    }

    /**
     * @param Case_Type the Case_Type to set
     */
    public void setCase_Type(String Case_Type) {
        this.Case_Type = Case_Type;
    }

    
}
