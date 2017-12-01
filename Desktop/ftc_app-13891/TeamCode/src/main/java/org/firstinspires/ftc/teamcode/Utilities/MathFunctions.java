package org.firstinspires.ftc.teamcode.Utilities;

/**
 * Created by Sohan on 11/26/17.
 */

public class MathFunctions {
    public static double clamp(double min, double max, double value) {
        return Math.max(min, Math.min(max, value));
    }

    public static int clamp(int min, int max, int value) {
        return Math.max(min, Math.min(max, value));
    }
}
