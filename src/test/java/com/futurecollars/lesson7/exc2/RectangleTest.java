package com.futurecollars.lesson7.exc2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldGetArea() {
        var rectangle = new Rectangle();
        assertEquals(8, rectangle.getArea());
    }

    @Test
    void shouldGetPerimeter() {
        var rectangle = new Rectangle();
        assertEquals(12, rectangle.getPerimeter());
    }
}