package com.example.mlab5;

import androidx.annotation.NonNull;

public class StudentMod {
    private int id;
    private String name;
    private int age;

    public StudentMod(){

    }

    public StudentMod(int id , String Name , int age){
        this.id = id;
        this.name = Name;
        this.age = age;
    }




    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "StudentMod{" +
                "ID=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
