/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coolwind.javablog.bean;

import com.coolwind.javablog.util.DatabaseOperator;
import com.coolwind.javablog.util.MD5Util;

/**
 *
 * @author coolwind
 */
public class RegistrationBean {

    private String username;
    private String password;
    private String email;
    
    private String usrStr;
    private String udStr;
    private String ckStr;

    public RegistrationBean() {

    }

    public RegistrationBean(String username,
            String password, String email
    ) {
        
        this.username = username;
        this.password = MD5Util.getMD5(password);
        this.email = email;
        
        this.usrStr = "insert into user values(NULL,\"" 
                + this.username +"\",\""
                + this.password + "\",\""
                + this.email + "\")";
        
        this.udStr = "insert into user_detail values(NULL,\"" 
                + this.username+"\",0,NULL,\""+this.email+ "\",NULL"+")";
        
        this.ckStr = "insert into user_click values(\"" + this.username +"\",0)";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void insertInto(){
        DatabaseOperator dop = new DatabaseOperator();
        dop.openConnection();
        int rs = dop.execUpdate(usrStr);
        rs = dop.execUpdate(ckStr);
        rs = dop.execUpdate(udStr);
        dop.closeConnection();
    }
}
