package com.example.tms_security;

public class Model {
    String Visitor_Id,Guest_full_name, Guest_Date,Guest_Time,Guest_Contact,Door_No,Resident_full_name,Resident_ph_no;

    public Model() {
    }

    public Model(String visitor_Id, String guest_full_name, String guest_Date, String guest_Time, String guest_Contact, String door_No, String resident_full_name, String resident_ph_no) {
        Visitor_Id = visitor_Id;
        Guest_full_name = guest_full_name;
        Guest_Date = guest_Date;
        Guest_Time = guest_Time;
        Guest_Contact = guest_Contact;
        Door_No = door_No;
        Resident_full_name = resident_full_name;
        Resident_ph_no = resident_ph_no;
    }

    public String getVisitor_Id() {
        return Visitor_Id;
    }

    public void setVisitor_Id(String visitor_Id) {
        Visitor_Id = visitor_Id;
    }

    public String getGuest_full_name() {
        return Guest_full_name;
    }

    public void setGuest_full_name(String guest_full_name) {
        Guest_full_name = guest_full_name;
    }

    public String getGuest_Date() {
        return Guest_Date;
    }

    public void setGuest_Date(String guest_Date) {
        Guest_Date = guest_Date;
    }

    public String getGuest_Time() {
        return Guest_Time;
    }

    public void setGuest_Time(String guest_Time) {
        Guest_Time = guest_Time;
    }

    public String getGuest_Contact() {
        return Guest_Contact;
    }

    public void setGuest_Contact(String guest_Contact) {
        Guest_Contact = guest_Contact;
    }

    public String getDoor_No() {
        return Door_No;
    }

    public void setDoor_No(String door_No) {
        Door_No = door_No;
    }

    public String getResident_full_name() {
        return Resident_full_name;
    }

    public void setResident_full_name(String resident_full_name) {
        Resident_full_name = resident_full_name;
    }

    public String getResident_ph_no() {
        return Resident_ph_no;
    }

    public void setResident_ph_no(String resident_ph_no) {
        Resident_ph_no = resident_ph_no;
    }
}






