package org.firstinspires.ftc.teamcode.Inputs;

/**
 * Created by Sohan on 11/26/17.
 */
import com.qualcomm.robotcore.hardware.Gamepad;

public class Joystick {
    private double _left = 0.0d;
    private double _right = 0.0d;

    public Joystick(Gamepad gamepad) {
        _left = -gamepad.left_stick_y;
        _right = -gamepad.right_stick_y;
    }

    public Joystick(double left, double right) {
        _left = left;
        _right = right;
    }

    public double getLeft() {
        return _left;
    }

    public double getRight() {
        return _right;
    }
}
