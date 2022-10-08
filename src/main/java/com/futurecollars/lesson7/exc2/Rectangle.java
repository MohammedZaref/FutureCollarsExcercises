package com.futurecollars.lesson7.exc2;

public class Rectangle extends Shape {
    static double width;
    double length;

    public Rectangle() {
        super();
        width = 2;
        length = 4;
    }

        public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Base = " + width +
                ",Side = " + length +
                ", Name = " + name + '\'' +
                '}';
    }
}
