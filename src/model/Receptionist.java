package model;

import javax.swing.*;

public class Receptionist {
    //    private int manId;
    private int custId;
    private String name;
    private String username;
    private String email;
    private String password;
    private String address;
    private String gender;
    private String contact;
    private String data2;
    private int receptionistId;

    public Receptionist (int receptionistId, String name, String username, String email, String passwords, String data2) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password=passwords;
        this.data2 = data2;
        this.receptionistId = receptionistId;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public int getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(int receptionistId) {
        this.receptionistId = receptionistId;
    }

    public Receptionist (int receptionistId, String name, String username, String email, String address, String gender, String contact) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.contact = contact;


    }
    public Receptionist(int receptionistId,String password){
        this.password = password;
        this.receptionistId = receptionistId;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    public  Receptionist () {

    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public Receptionist(int custId, String name,String username, String password){
        this.custId = custId;
        this.name = name;
        this.username= username;
        this.password = password;

    }

    public Receptionist (String name, String username, String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }






//    public int getManId() {
//        return manId;
//    }
//
//    public void setManId(int manId) {
//        this.manId = manId;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}