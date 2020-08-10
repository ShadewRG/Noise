/*
 * Copyright (c) 2020 RGSW
 * Licensed under Apache 2.0 license
 */

package net.shadew.ptg.noise.util;

import net.shadew.ptg.noise.Noise2D;
import net.shadew.ptg.noise.Noise3D;

/**
 * Functional interface that represents a function of zero or more double values. This function can be used in {@link
 * Noise2D#combine} and {@link Noise3D#combine}
 */
@FunctionalInterface
public interface DoubleFunction {
    /**
     * Combines zero or more double values using a specific function. This may be every function, as long as it results
     * in a double value.
     *
     * @param doubles The double values to combine using the specific function
     * @return The result value
     */
    double combine( double... doubles );
}
