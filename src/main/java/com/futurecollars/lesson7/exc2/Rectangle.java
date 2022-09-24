package com.futurecollars.lesson7.exc2;

public class Rectangle extends Shape{


    @Override
    double getArea(double base, double side) {
        return base * side;
    }

    @Override
    double getPerimeter(double base, double side) {
        return (2 * base) + (2 * side);
    }
}
