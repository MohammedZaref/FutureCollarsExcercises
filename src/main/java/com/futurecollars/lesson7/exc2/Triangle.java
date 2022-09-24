package com.futurecollars.lesson7.exc2;

public class Triangle extends Rectangle{
    double height;

    public Triangle() {
        super();
        width = 5; // refers to the base of triangle
        length = 7;
        height = 12;
    }

    public Triangle(double width, double length, double height) {
        super(width, length);
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Triangle(String name, double width, double length, double height) {
        super(name, width, length);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    @Override
    public double getArea() {
        return (height * width) / 2;
    }

    @Override
    public double getPerimeter() {
        return height + width + length;
    }
}
