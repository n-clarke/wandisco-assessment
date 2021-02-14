package com.wandisco.challenge.one.service;

import com.wandisco.challenge.one.constant.ShapeConstants;
import com.wandisco.challenge.one.utils.DecimalUtils;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public final class Cube implements Shape {
    private int width;

    /**
     * Cube Constructor : sets the width for a Cube
     * IF a negative number has been added; SET this.width as 0
     * ELSE SET this.width as input
     *
     * @param width take in an Integer input to set width
     **/
    public Cube(int width) {
        this.width = Math.max(width, 0);
    }

    /**
     * A double to compute and return the volume of the Cube
     *
     * @return {@linkplain double}
     **/
    @Override
    public double getVolume() {
        // Formula (Volume of Cube) = width * width * width
        double cubeVolume = width * width * width;

        return DecimalUtils.round(cubeVolume, 2);
    }

    /**
     * A String to return a message response for the Cube Width and Volume
     *
     * @return {@linkplain String}
     **/
    public String getMessage() {
        return ShapeConstants.MESSAGE_CUBE_WIDTH + getWidth() + ShapeConstants.MESSAGE_HAS_VOLUME + (int) getVolume();
    }
}
