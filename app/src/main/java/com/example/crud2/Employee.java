package com.example.crud2;

import com.google.firebase.database.Exclude;

import java.io.Serializable;

public class Employee implements Serializable {

    @Exclude
    private String key;
    private String name;
    private String position;
    private String age;
    public Employee(){}
    public Employee(String name, String position, String age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
