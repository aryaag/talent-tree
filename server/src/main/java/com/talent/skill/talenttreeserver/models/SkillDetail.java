package com.talent.skill.talenttreeserver.models;

import java.util.List;

public class SkillDetail extends Skill {

    private List<Challenge> challenges;

    public List<Challenge> getChallenges() {
        return challenges;
    }

    public void setChallenges(List<Challenge> challenges) {
        this.challenges = challenges;
    }

    @Override
    public String toString() {
        return "SkillDetail{" +
                "challenges=" + challenges +
                "} " + super.toString();
    }
}
