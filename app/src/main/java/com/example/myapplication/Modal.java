package com.example.myapplication;

public class Modal {
    int imageId;
    String name, grade;

    public Modal(String name, String grade,int imageId) {
        this.imageId = imageId;
        this.name = name;
        this.grade = grade;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}