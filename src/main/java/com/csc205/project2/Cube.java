package com.csc205.project2;

public class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return "Cube {side=" + side + ", surface area=" + getSurfaceArea() + ", volume=" + getVolume() + "}";
    }
}

