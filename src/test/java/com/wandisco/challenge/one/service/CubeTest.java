package com.wandisco.challenge.one.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Performing a Unit Test For Cube Volume to 2 Decimal Places")
public class CubeTest {

    @Nested
    @DisplayName("Valid ")
    class ValidTest {
        @Test
        @DisplayName("Case 1: Cube Of Width One")
        @Tag("Validation")
        void testValidCase1CubeOfWidthOne() {
            double expected = 1.00;
            double actual = new Cube(1).getVolume();
            assertEquals(expected, actual,
                    "method should return " + expected + "\n The Actual Result is\n" + actual);
        }

        @Test
        @DisplayName("Case 2: Cube Of Width Five")
        @Tag("Validation")
        void testValidCase2CubeOfWidthFive() {
            double expected = 125.00;
            double actual = new Cube(5).getVolume();
            assertEquals(expected, actual,
                    "method should return " + expected + "\n The Actual Result is\n" + actual);
        }
    }

    @Nested
    @DisplayName("Invalid ")
    class InvalidTest {
        @Test
        @DisplayName("Case 1: Cube Of Width Zero")
        @Tag("Validation")
        void testInvalidCase1CubeOfWidthZero() {
            double expected = 0.00;
            double actual = new Cube(0).getVolume();
            assertEquals(expected, actual,
                    "method should return " + expected + "\n The Actual Result is\n" + actual);
        }

        @Test
        @DisplayName("Case 2: Cube Of Width Negative One")
        @Tag("Validation")
        void testInvalidCase2CubeOfWidthNegativeOne() {
            double expected = 0.00;
            double actual = new Cube(-1).getVolume();
            assertEquals(expected, actual,
                    "method should return " + expected + "\n The Actual Result is\n" + actual);
        }

        @Test
        @DisplayName("Case 3: Cube Of Width Negative Five")
        @Tag("Validation")
        void testInvalidCase2CubeOfWidthNegativeFive() {
            double expected = 0.00;
            double actual = new Cube(-5).getVolume();
            assertEquals(expected, actual,
                    "method should return " + expected + "\n The Actual Result is\n" + actual);
        }
    }
}
