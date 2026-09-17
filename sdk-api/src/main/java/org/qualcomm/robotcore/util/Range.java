package org.qualcomm.robotcore.util;

public class Range {
    public static double clip(double number, double min, double max) {
        if (number < min) return min;
        if (number > max) return max;
        return number;
    }
}
