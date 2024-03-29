package com.cy.java.pojo;

public class Person {
    private String name;
    private int age;
    private boolean sex;
    
    public Person() { }

    public Person(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public boolean isSex() { return sex; }

    public void setSex(boolean sex) { this.sex = sex; }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", sex=" + sex +
            '}';
    }
}
