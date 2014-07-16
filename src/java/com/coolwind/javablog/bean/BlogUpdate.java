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
public class BlogUpdate {
    private String username = null;
    private String content = null;
    private String label = null;
    private String privilege = null; 
    private String bid = null;
    private Date date = null;
    String sql = "";

    public BlogUpdate(String username, String label, String content, String privilege, String bid) {
        this.username = username;
        this.label = label;
        this.content = content;
        this.privilege = privilege;
        this.bid = bid;
        this.date = new Date();
        
        SimpleDateFormat dateformat1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dt = dateformat1.format(date);
        
        sql = "update blog_content set bkind = \"" +
                this.label + "\", bcontent = \'" + this.content+
                "\', bprivilege = \'" + this.privilege + 
                "\',bdate = \'" + dt + "\' where bid = " + this.bid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    public void update(){
        DatabaseOperator dop = new DatabaseOperator();
        dop.openConnection();
        int rs = dop.execUpdate(sql);
        dop.closeConnection();
    }
    
}
