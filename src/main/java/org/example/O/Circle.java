package org.example.O;

public class Circle implements Shape{

    public Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double estimateArea() {
        return Math.PI + Math.sqrt(radius);
    }
}
