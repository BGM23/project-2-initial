package com.csc205.project2;

public class Project2 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(2.0);
        Cube cube = new Cube(5.0);
        Cylinder cylinder = new Cylinder(4.0, 1.0);
        Cone cone = new Cone(3.0, 4.0);

        System.out.println(sphere);
        System.out.println(cube);
        System.out.println(cylinder);
        System.out.println(cone);
    }
}
