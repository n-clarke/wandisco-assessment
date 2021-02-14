package com.wandisco.challenge.one.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Performing a Unit Test For Regular Tetrahedron Volume to 2 Decimal Places")
public class RegularTetrahedronTest {

    @Nested
    @DisplayName("Valid ")
    class ValidTest {
        @Test
        @DisplayName("Case 1: Regular Tetrahedron With Edge One")
        @Tag("Validation")
        void testValidCase1RegularTetrahedronOfRadiusOne() {
            double expected = 0.12;
            double actual = new RegularTetrahedron(1).getVolume();
            assertEquals(expected, actual,
                    "method should return " + expected + "\n The Actual Result is\n" + actual);
        }

        @Test
        @DisplayName("Case 2: Regular Tetrahedron With Edge Five")
        @Tag("Validation")
        void testValidCase2RegularTetrahedronOfRadiusFive() {
            double expected = 14.73;
            double actual = new RegularTetrahedron(5).getVolume();
            assertEquals(expected, actual,
                    "method should return " + expected + "\n The Actual Result is\n" + actual);
        }
    }

    @Nested
    @DisplayName("Invalid ")
    class InvalidTest {
        @Test
        @DisplayName("Case 1: Regular Tetrahedron With Edge Zero")
        @Tag("Validation")
        void testInvalidCase1RegularTetrahedronOfRadiusZero() {
            double expected = 0.00;
            double actual = new RegularTetrahedron(0).getVolume();
            assertEquals(expected, actual,
                    "method should return " + expected + "\n The Actual Result is\n" + actual);
        }

        @Test
        @DisplayName("Case 2: Regular Tetrahedron With Edge Negative One")
        @Tag("Validation")
        void testInvalidCase2RegularTetrahedronOfRadiusNegativeOne() {
            double expected = 0.00;
            double actual = new RegularTetrahedron(-1).getVolume();
            assertEquals(expected, actual,
                    "method should return " + expected + "\n The Actual Result is\n" + actual);
        }
        
        @Test
        @DisplayName("Case 3: Regular Tetrahedron With Edge Negative Five")
        @Tag("Validation")
        void testInvalidCase2RegularTetrahedronOfRadiusNegativeFive() {
            double expected = 0.00;
            double actual = new RegularTetrahedron(-5).getVolume();
            assertEquals(expected, actual,
                    "method should return " + expected + "\n The Actual Result is\n" + actual);
        }
    }
}
