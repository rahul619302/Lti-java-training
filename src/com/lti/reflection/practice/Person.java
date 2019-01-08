package com.lti.reflection.practice;

import java.io.Serializable;

public class Person implements Serializable, Cloneable {

    private int id;
    private String name;
    public String fatherName;

    private int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.setSecurityManager(new SecurityManager());//Once this line execute than it will not allow to access other member
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
