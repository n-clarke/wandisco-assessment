package com.wandisco.challenge.one.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Performing a Unit Test For Sphere Volume to 2 Decimal Places")
public class SphereTest {

    @Nested
    @DisplayName("Valid ")
    class ValidTest {
        @Test
        @DisplayName("Case 1: Sphere Of Radius One")
        @Tag("Validation")
        void testValidCase1SphereOfRadiusOne() {
            double expected = 4.19;
            double actual = new Sphere(1).getVolume();
            assertEquals(expected, actual,
                    "method should return " + expected + "\n The Actual Result is\n" + actual);
        }

        @Test
        @DisplayName("Case 2: Sphere Of Radius Five")
        @Tag("Validation")
        void testValidCase2SphereOfRadiusFive() {
            double expected = 523.60;
            double actual = new Sphere(5).getVolume();
            assertEquals(expected, actual,
                    "method should return " + expected + "\n The Actual Result is\n" + actual);
        }
    }

    @Nested
    @DisplayName("Invalid ")
    class InvalidTest {
        @Test
        @DisplayName("Case 1: Sphere Of Radius Zero")
        @Tag("Validation")
        void testInvalidCase1SphereOfRadiusZero() {
            double expected = 0.00;
            double actual = new Sphere(0).getVolume();
            assertEquals(expected, actual,
                    "method should return " + expected + "\n The Actual Result is\n" + actual);
        }

        @Test
        @DisplayName("Case 2: Sphere Of Radius Negative One")
        @Tag("Validation")
        void testInvalidCase2SphereOfRadiusNegativeOne() {
            double expected = 0.00;
            double actual = new Sphere(-1).getVolume();
            assertEquals(expected, actual,
                    "method should return " + expected + "\n The Actual Result is\n" + actual);
        }
        
        @Test
        @DisplayName("Case 3: Sphere Of Radius Negative Five")
        @Tag("Validation")
        void testInvalidCase2SphereOfRadiusNegativeFive() {
            double expected = 0.00;
            double actual = new Sphere(-5).getVolume();
            assertEquals(expected, actual,
                    "method should return " + expected + "\n The Actual Result is\n" + actual);
        }
    }
}
