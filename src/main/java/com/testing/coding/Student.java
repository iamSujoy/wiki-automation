package com.testing.coding;

public class Student {
    private int roll;
    private String name;
    private int age;
    private double grade;

    public Student(int roll, String name, int age, double grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
