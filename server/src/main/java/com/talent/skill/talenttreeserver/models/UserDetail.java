package com.talent.skill.talenttreeserver.models;

import java.util.List;

public class UserDetail extends User {

    private List<UserSkill> skills;

    public List<UserSkill> getSkills() {
        return skills;
    }

    public void setSkills(List<UserSkill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "skills=" + skills +
                "} " + super.toString();
    }
}
