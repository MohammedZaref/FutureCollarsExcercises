package com.futurecollars.lesson7.exc2;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape c1 = new Circle("Circle", 8);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(((Circle) c1).getRadiusValue());
        Shape s1 = new Square("Square", 8);
        System.out.println(s1);
    }
}
