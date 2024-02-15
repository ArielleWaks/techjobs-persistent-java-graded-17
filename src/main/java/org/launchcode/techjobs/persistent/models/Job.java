package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    //    @NotNull(message = "Employer is required")
    @ManyToOne
    private Employer employer;


    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    public Job() {}

    // Initialize the id and value fields.
    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

//    public void addSkill(Skill skill) {
//        this.skills.add(skill);
//    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

}
