package com.talent.skill.talenttreeserver.models;

public class User {

    private String geid;
    private String soeid;
    private String name;
    private String location;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "geid='" + geid + '\'' +
                ", soeid='" + soeid + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
