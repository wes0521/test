package com.json;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;

public class Grade {
    private int id;
    @JsonIgnore
    private String name;
    private ArrayList<Student> stu;

    public Grade() {
    }

    public Grade(int id, String name, ArrayList<Student> stu) {
        this.id = id;
        this.name = name;
        this.stu = stu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStu() {
        return stu;
    }

    public void setStu(ArrayList<Student> stu) {
        this.stu = stu;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stu=" + stu +
                '}';
    }
}
