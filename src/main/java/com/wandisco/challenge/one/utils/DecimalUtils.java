package com.wandisco.challenge.one.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalUtils {

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bigDecimal = BigDecimal.valueOf(value);
        bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

}
