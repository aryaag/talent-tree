package com.talent.skill.talenttreeserver.models;

public class User {

    private String geid;
    private String soeid;
    private String name;

    public String getGeid() {
        return geid;
    }

    public void setGeid(String geid) {
        this.geid = geid;
    }

    public String getSoeid() {
        return soeid;
    }

    public void setSoeid(String soeid) {
        this.soeid = soeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "geid='" + geid + '\'' +
                ", soeid='" + soeid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
