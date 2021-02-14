package com.wandisco.challenge.one.service;

import com.wandisco.challenge.one.constant.ShapeConstants;
import com.wandisco.challenge.one.utils.DecimalUtils;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public final class Sphere implements Shape {

    private int radius;

    /**
     * Sphere Constructor : sets the radius for sphere
     * IF a negative number has been added set this.radius as 0
     * Else set this.radius as input
     *
     * @param radius take in an Integer input to set radius
     **/
    public Sphere(int radius) {
        // IF radius input EQUALS OR LESS THAN 0 SET AS 0
        this.radius = Math.max(radius, 0);
    }

    /**
     * A double to compute and return the volume of the Sphere
     *
     * @return {@linkplain double}
     **/
    @Override
    public double getVolume() {
        // Formula (Volume of Sphere) = 4/3 πr³
        double sphereVolume = ((4.0 / 3.0) * Math.PI * (radius * radius * radius));

        return DecimalUtils.round(sphereVolume, 2);
    }

    /**
     * A String to return a message response for the Sphere Radius and Volume
     *
     * @return {@linkplain String}
     **/
    @Override
    public String getMessage() {
        return ShapeConstants.MESSAGE_SPHERE_RADIUS + getRadius() + ShapeConstants.MESSAGE_HAS_VOLUME + getVolume();
    }
}
