package com.futurecollars.lesson7.exc2;

public class Square extends Rectangle{
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String name, double side) {
        super(name, side, side);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        length = width = side;

    }
    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "Side = " + length +
                ", Name = " + name + '\'' +
                '}';
    }
}
