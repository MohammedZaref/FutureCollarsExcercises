package com.futurecollars.lesson7.exc2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldCalculateTheArea() {
        var circle = new Circle();
        assertEquals(113.09733552923255, circle.getArea());
    }

    @Test
    void shouldGetThePerimeter() {
        var circle = new Circle();
        assertEquals(37.69911184307752, circle.getPerimeter());
    }
}