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
public class BlogSubmit {
    private String title = null;
    private String label = null;
    private String privilege = null;
    private String content = null;
    private String username = null;
    private Date date = null;
    
    private String sql = null;
    
    public BlogSubmit(String title, String label, String privilege, String content, String username){
        this.title = title;
        this.label = label;
        this.privilege = privilege;
        this.content = content;
        this.username = username;
        this.date = new Date();
        
        SimpleDateFormat dateformat1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dt = dateformat1.format(date);
        sql = "insert into blog_content values(NULL,\"" 
                +this.username +"\",\""+this.title+"\","+this.privilege+",\""+
                dt +"\",\"" +this.label+"\",'" +this.content+"',0"+")";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public void insertInto(){
        DatabaseOperator dop = new DatabaseOperator();
        dop.openConnection();
        int rs = dop.execUpdate(sql);
        dop.closeConnection();
    }
}
