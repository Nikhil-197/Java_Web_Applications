package com.entities;

import java.sql.Timestamp;

public class Post {

    private int pid, catId,userId;
    private String pTitle, pContent, pCode, pPic;
    private Timestamp pDate;

    public Post() {
    }

    public Post(int pid, int catId, int userId, String pTitle, String pContent, String pCode, String pPic, Timestamp pDate) {
        this.pid = pid;
        this.catId = catId;
        this.userId = userId;
        this.pTitle = pTitle;
        this.pContent = pContent;
        this.pCode = pCode;
        this.pPic = pPic;
        this.pDate = pDate;
    }

    public Post(int catId, int userId, String pTitle, String pContent, String pCode, String pPic) {
        this.catId = catId;
        this.userId = userId;
        this.pTitle = pTitle;
        this.pContent = pContent;
        this.pCode = pCode;
        this.pPic = pPic;
    }
    

    
    
    

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getpTitle() {
        return pTitle;
    }

    public void setpTitle(String pTitle) {
        this.pTitle = pTitle;
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getpPic() {
        return pPic;
    }

    public void setpPic(String pPic) {
        this.pPic = pPic;
    }

    public Timestamp getpDate() {
        return pDate;
    }

    public void setpDate(Timestamp pDate) {
        this.pDate = pDate;
    }
    
    

    
}
