package com.example.smartattendance.Model;

public class Student {
    String rollNo, name;
    boolean present;

    public Student(String rollNo, String name, boolean present) {
        this.rollNo = rollNo;
        this.name = name;
        this.present = present;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
}
