package com.example.demo.model;

import java.util.Date;

public class Student {

    private Integer id;
    private String name;
    private Double score;
    private boolean graduate;
    private Date createDate;

    public Integer getId() {
        return id;
    }

    public Student setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Double getScore() {
        return score;
    }

    public Student setScore(Double score) {
        this.score = score;
        return this;
    }

    public boolean isGraduate() {
        return graduate;
    }

    public Student setGraduate(boolean graduate) {
        this.graduate = graduate;
        return this;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Student setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }
}
