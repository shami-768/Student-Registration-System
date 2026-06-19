package com.training.Model;

public class Student {
    private int id;
    private String Name;

    public Student(int id,String Name) {
        this.id = id;
        this.Name=Name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
}
