/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coolwind.javablog.bean;

import com.coolwind.javablog.util.DatabaseOperator;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author coolwind
 */
public class BlogComment {

    private String username = null;
    private String bid = null;
    private String content = null;
    private Date date = null;

    private String bcsql = null;

    public BlogComment(String uname, String bid, String content) {
        this.username = uname;
        this.bid = bid;
        this.content = content;
        this.date = new Date();

        SimpleDateFormat dateformat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dt = dateformat1.format(date);

        this.bcsql = "insert into blog_comment values( NULL, \""
                + this.username + "\"," + this.bid + ",'" + this.content + "', NULL, \"" + dt + "\")";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void insertInto() {
        DatabaseOperator dop = new DatabaseOperator();
        dop.openConnection();
        int rs = dop.execUpdate(this.bcsql);
        dop.closeConnection();
    }
}
