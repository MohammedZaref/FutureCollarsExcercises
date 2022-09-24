package com.futurecollars.lesson7.exc2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldGtArea() {
        var triangle = new Triangle();
        assertEquals(30, triangle.getArea());
    }

    @Test
    void shouldGetPerimeter() {
        var triangle = new Triangle();
        assertEquals(24, triangle.getPerimeter());
    }
}