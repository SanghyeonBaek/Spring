package com.sparta.week01.prac;

public class Tutor {
    private String name;
    private String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    //기본생성자
    public Tutor() {

    }
    //입력받는 생성자
    public Tutor(String name1,String bio1) {
        this.name =name1;
        this.bio=bio1;

    }
}
