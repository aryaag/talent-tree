package com.talent.skill.talenttreeserver.models;

public class UserSkill extends Skill {

    private int level;
    private String isCertified;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getIsCertified() {
        return isCertified;
    }

    public void setIsCertified(String isCertified) {
        this.isCertified = isCertified;
    }

    @Override
    public String toString() {
        return "UserSkill{" +
                "level=" + level +
                ", isCertified='" + isCertified + '\'' +
                "} " + super.toString();
    }
}
