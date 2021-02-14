package com.wandisco.challenge.one.service;

import com.wandisco.challenge.one.constant.ShapeConstants;
import com.wandisco.challenge.one.utils.DecimalUtils;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public final class RegularTetrahedron implements Shape {
    private int edge;

    /**
     * RegularTetrahedron Constructor : sets the edge for RegularTetrahedron
     * IF a negative number has been added; SET this.edge as 0
     * ELSE SET this.edge as input
     *
     * @param edge take in an Integer input to set edge
     **/
    public RegularTetrahedron(int edge) {
        this.edge = Math.max(edge, 0);
    }

    /**
     * A double to compute and return the volume of the Regular Tetrahedron
     *
     * @return {@linkplain double}
     **/
    @Override
    public double getVolume() {
        // Formula (Volume of Regular Tetrahedron) = (√(2) / 12) * e³
        double regularTetrahedronVolume = ((Math.sqrt(2) / 12) * (edge * edge * edge));

        return DecimalUtils.round(regularTetrahedronVolume, 2);
    }

    /**
     * A String to return a message response for the Regular Tetrahedron Edges and Volume
     *
     * @return {@linkplain String}
     **/
    @Override
    public String getMessage() {
        return ShapeConstants.MESSAGE_REGULAR_TETRAHEDRON_EDGE + getEdge() + ShapeConstants.MESSAGE_HAS_VOLUME + getVolume();
    }

}
