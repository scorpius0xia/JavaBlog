/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coolwind.javablog.util;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author coolwind
 */
public class DatabaseOperator {

    private Connection connection = null;
    private Statement statement = null;

    private String username = null;
    private String password = null;
    private String url = null;

    public DatabaseOperator() {
        username = "javablog";
        password = "123456";
        url = "jdbc:mysql://localhost:3306/javablog?user=" + username + "&password=" + 
                password + "&useUnicode=true&characterEncoding=utf8";
    }

    public boolean openConnection() {

        boolean ok = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseOperator.class.getName()).log(Level.SEVERE, null, ex);
            ok = false;
        }
        try {
            this.connection = DriverManager.getConnection(url);
            this.statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseOperator.class.getName()).log(Level.SEVERE, null, ex);
            ok = false;
        }

        return ok;
    }
    
    public void closeConnection(){
        try {
            this.statement.close();
            this.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseOperator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet execQuery(String sql){
        ResultSet rs = null;
        System.out.println(sql);
        try {
            rs = this.statement.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseOperator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public int execUpdate(String sql){
        int rs = 0;
        System.out.println(sql);
        //sql = sql.replace("@", "@");
        try {
            rs = this.statement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseOperator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
