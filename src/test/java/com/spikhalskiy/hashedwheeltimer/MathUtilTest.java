package com.spikhalskiy.hashedwheeltimer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Dmitry Spikhalskiy <dspikhalskiy@pulsepoint.com>
 */
public class MathUtilTest {
    @Test
    public void test() {
        assertEquals(1, MathUtil.divWithRound(5, 4));
        assertEquals(2, MathUtil.divWithRound(7, 4));
        assertEquals(-1, MathUtil.divWithRound(-5, 4));
        assertEquals(-2, MathUtil.divWithRound(-7, 4));
    }
}
