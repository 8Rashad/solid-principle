package org.example.O;

public class Rectangle implements Shape{

    public Double length;
    public Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double estimateArea() {
        return length * width;
    }
}
