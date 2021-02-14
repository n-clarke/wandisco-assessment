# Wandisco Assessment

## Date

14-02-2021

## Author

n-clarke

## Description

This is a submission for the Wan Disco Assessment for "Part I: Programming to Specification" and "Part II: Multithreading" details regarding the assessment are outlined below:

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
```
Java 11
Maven 
junit
Lombok
```
## Pre-Requisites

To install the required dependenices run:
```
mvn clean install
```
## Requirements : Part I: Programming to Specification

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

As an alternative to display the above the getMessage() method will display the input of the shape with it's generated volume. This can be run via the following class:
```
Path from Repository Root : src/main/java/com/wandisco/challenge/one/Application.java
```
## Requirements : Part II: Multithreading

Key: () = to-do, - [x] = complete

- [x] Fix and Solve Problem 1

This was a issue with the SharedInteger class methods not being synchronized an would cause each run to generate a different counter result. One solution would be to update the methods with the synchronized tag, however, I opted for using the AtomicInteger class instead which will provide the same result. 

For more info on the Synchronized issue view : ref: https://docs.oracle.com/javase/tutorial/essential/concurrency/syncmeth.html

- [x] Fix and Solve Problem 2

Issue was with ordering of locking and unlocking which meant that one ReentrantLock is locked and the other would be unlocked causing a failure.  When dealing with locking and unlocking this also needed to be synchronized.

Useful for debugging with thread stack dumps:
You can use jconsole, jvisualvm or jps to get the process id of your program and then run jstack <process-id> to get the thread stack dump: https://javajee.com/lock-ordering-deadlocks-in-java-with-example

- [x] MultithreadingChallenge.java so that the program terminates normally when run via: java -ea MultithreadingChallenge.

Note* when asserts pass and are value the console will return 'Process finished with exit code 0.' if you have any other exit code or error the asserts should also fail.

Two verison of Part II have been done one which is componentised package and the other which contains a single MultithreadingChallenge file.

Componentised Solution

Path from Repository Root : src/main/java/com/wandisco/challenge/two/componentised
```
Single Class Solution
```
Path from Repository Root : src/main/java/com/wandisco/challenge/two/single
```
To be able to run java -ea MultithreadingChallenge from the Single Class Solution:
- First Compile the class using either maven and going to target complied code. Else run the following commands and replace ot remove {PATH} based on your path preference.

Compile Code:
```
javac {PATH}src\main\java\com\wandisco\challenge\two\single\MultithreadingChallenge.java
```
Run Complied Code (with asserts '-ea' flag):
```
java -ea {PATH}src\main\java\com\wandisco\challenge\two\single\MultithreadingChallenge.java
```
