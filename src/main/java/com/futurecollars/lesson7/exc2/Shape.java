package com.futurecollars.lesson7.exc2;

public abstract class Shape {
    String name;

    public Shape() {
        this.name = "no name";
    }

    public Shape(String name) {
        this.name = name;
    }


    public abstract double getArea();

    public abstract double getPerimeter();
}
