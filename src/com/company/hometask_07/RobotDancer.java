package com.company.hometask_07;

public class RobotDancer extends Robot {
    private String name;

    public RobotDancer(String name) {
        super(name);
        this.name = name + "Dancer";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println("Я " + name + " - я просто танцюю");
    }
}