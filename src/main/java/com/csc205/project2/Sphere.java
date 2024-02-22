package com.csc205.project2;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere {radius=" + radius + ", surface area=" + getSurfaceArea() + ", volume=" + getVolume() + "}";
    }
}
