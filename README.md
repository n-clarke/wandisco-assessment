# Wandisco Assessment

## Date

14-02-2021

## Author

n-clarke

## Description

This is a submission for the Wan Disco Assessment for "Part I: Programming to Specification" and "This is a submission for the Wan Disco Assessment for "Part I: Programming to Specification" and "Part II: Multithreading" details regarding the assessment are outlined below:

### Part I: Programming to Specification

Write a Java program or programs to calculate the volume of:

1. A sphere
2. A cube
3. A regular tetrahedron

Use your program to verify to 2 decimal places that:

1. A sphere of radius 1 has volume 4.19
2. A sphere of radius 5 has volume 523.6
3. A cube of width 1 has volume 1
4. A cube of width 5 has volume 125
5. A regular tetrahedron with edge 1 has volume 0.12
6. A regular tetrahedron with edge 5 has volume 14.73

### Part II: Multithreading

The attached MultithreadingChallenge.java entails two problems, exhibited by the methods MultithreadingChallenge.problem1 and respectively MultithreadingChallenge.problem2. Your task is to provide the necessary changes to MultithreadingChallenge.java so that the program terminates normally when run via: java -ea MultithreadingChallenge.

## Technologies Used

Java 11
Maven 
junit
Lombok

## Pre-Requisites

mvn clean install

## Requirements

### Part I: Programming to Specification
Key: () = to-do, - [x] = complete

- [x] Create a shape interface which can be implemented by a Cube, Sphere, Regular Tetrahedron.

The shape interface includes the following functions: getVolume(), getMessage();

- [x] Create Classes for Cube, Sphere, Regular Tetrahedron which implements the Shape Interface and get the Volume of the Shape using the formulas below:

Volume of Cube = (width * width * width)
Volume of Sphere = ((4/3) * π * r³)
Volume of Regular Tetrahedron = ((√(2) / 12) * e³)

- [x] Verify to 2 decimal places the volume of each shape given:
1. A sphere of radius 1 has volume 4.19
2. A sphere of radius 5 has volume 523.6
3. A cube of width 1 has volume 1
4. A cube of width 5 has volume 125
5. A regular tetrahedron with edge 1 has volume 0.12
6. A regular tetrahedron with edge 5 has volume 14.73

This has been verified and tested using unit tests in the following package:
Path from Repository Root : src/test/java/com/wandisco/challenge/one/service

As an alternative to display the above the getMessage() method will display the input of the shape with it's generated volume.
