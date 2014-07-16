/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coolwind.javablog.bean;

import com.coolwind.javablog.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author coolwind
 */
public class LoginBean {

    private String username;
    private String password;
    private String uid = null;

    public LoginBean() {

    }

    public LoginBean(String username, String password) {
        this.username = username;
        this.password = MD5Util.getMD5(password);
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

    public boolean checkValid() {
        String sql = "select uid from user where username = '" + this.username + "' and password ='" + this.password
                + "'";
        DatabaseOperator dop = new DatabaseOperator();
        dop.openConnection();
        ResultSet rs = dop.execQuery(sql);
        boolean ok = false;
        try {
            while(rs.next()){
                this.uid = rs.getString("uid");
            }
            
            if(uid != null)
                ok = true;
            else
                ok = false;
            System.out.println("Check:" + ok);
        } catch (SQLException ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            ok = false;
        }
        dop.closeConnection();
        return ok;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}
