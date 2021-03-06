package com.company.hometask_16;

import java.util.Objects;
import java.util.Scanner;

public class Person {

    private String name;
    private Integer age;

    Scanner scan = new Scanner(System.in);

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        System.out.println("Enter person's name:");
        this.name = scan.next();
        System.out.println("Enter person's age:");
        this.age = scan.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && age.equals(person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
