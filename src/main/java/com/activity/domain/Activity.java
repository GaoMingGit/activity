package com.activity.domain;

/**
 * @author 高铭
 * @date 2019/9/2 - 22:03
 */
public class Activity {
    private Integer aid;
    private Integer uid;
    private Integer activitypeople;
    private String activitytitle;
    private String activitycontent;
    private String activityendtime;
    private String activitystatus;
    private String activitytype;
    private String activitycreatetime;
    private String activityaddress;

    public Activity() {
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getActivitypeople() {
        return activitypeople;
    }

    public void setActivitypeople(Integer activitypeople) {
        this.activitypeople = activitypeople;
    }

    public String getActivitytitle() {
        return activitytitle;
    }

    public void setActivitytitle(String activitytitle) {
        this.activitytitle = activitytitle;
    }

    public String getActivitycontent() {
        return activitycontent;
    }

    public void setActivitycontent(String activitycontent) {
        this.activitycontent = activitycontent;
    }

    public String getActivityendtime() {
        return activityendtime;
    }

    public void setActivityendtime(String activityendtime) {
        this.activityendtime = activityendtime;
    }

    public String getActivitystatus() {
        return activitystatus;
    }

    public void setActivitystatus(String activitystatus) {
        this.activitystatus = activitystatus;
    }

    public String getActivitytype() {
        return activitytype;
    }

    public void setActivitytype(String activitytype) {
        this.activitytype = activitytype;
    }

    public String getActivitycreatetime() {
        return activitycreatetime;
    }

    public void setActivitycreatetime(String activitycreatetime) {
        this.activitycreatetime = activitycreatetime;
    }

    public String getActivityaddress() {
        return activityaddress;
    }

    public void setActivityaddress(String activityaddress) {
        this.activityaddress = activityaddress;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "aid=" + aid +
                ", uid=" + uid +
                ", activitypeople=" + activitypeople +
                ", activitytitle='" + activitytitle + '\'' +
                ", activitycontent='" + activitycontent + '\'' +
                ", activityendtime='" + activityendtime + '\'' +
                ", activitystatus='" + activitystatus + '\'' +
                ", activitytype='" + activitytype + '\'' +
                ", activitycreatetime='" + activitycreatetime + '\'' +
                ", activityaddress='" + activityaddress + '\'' +
                '}';
    }
}
