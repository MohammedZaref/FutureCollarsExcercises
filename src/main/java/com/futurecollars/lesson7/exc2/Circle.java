package com.futurecollars.lesson7.exc2;

public class Circle extends Shape {

    double radiusValue;

    public Circle() {
        super();
        radiusValue = 6;
    }

    public Circle(double radiusValue) {
        super();
        this.radiusValue = radiusValue;
    }

    public Circle(String name, double radiusValue) {
        super(name);
        this.radiusValue = radiusValue;
    }

    public double getRadiusValue() {
        return radiusValue;
    }

    public void setRadiusValue(double radiusValue) {
        this.radiusValue = radiusValue;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radiusValue, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radiusValue;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius = " + radiusValue +
                ", Name = " + name + '\'' +
                '}';
    }
}
