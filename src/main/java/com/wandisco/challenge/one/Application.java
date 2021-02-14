package com.wandisco.challenge.one;

import com.wandisco.challenge.one.service.Cube;
import com.wandisco.challenge.one.service.RegularTetrahedron;
import com.wandisco.challenge.one.service.Sphere;

public class Application {

    public static void main(String[] args) {
        // Console Log Shape : Sphere
        Sphere sphereOfRadiusOne = new Sphere(1);
        System.out.println(sphereOfRadiusOne.getMessage());

        Sphere sphereOfRadiusFive = new Sphere(5);
        System.out.println(sphereOfRadiusFive.getMessage());

        // Console Log Shape : Cube
        Cube cubeOfWidthOne = new Cube(1);
        System.out.println(cubeOfWidthOne.getMessage());

        Cube cubeOfWidthFive = new Cube(5);
        System.out.println(cubeOfWidthFive.getMessage());

        // Console Log : Regular Tetrahedron
        RegularTetrahedron regularTetrahedronWithOneEdge = new RegularTetrahedron(1);
        System.out.println(regularTetrahedronWithOneEdge.getMessage());

        RegularTetrahedron regularTetrahedronWithFiveEdges = new RegularTetrahedron(5);
        System.out.println(regularTetrahedronWithFiveEdges.getMessage());
    }
}
