package org.firstinspires.ftc.teamcode.Modules;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.Utilities.MathFunctions;

/**
 * Created by Sohan on 11/26/17.
 */

public class MotorModule {
    private DcMotor _motor = null;
    private double _maxPower = 1.0d;

    public DcMotor getMotor() {
        return _motor;
    }

    public int getCurrentPosition() {
        return _motor.getCurrentPosition();
    }

    public void initialize(HardwareMap hardwareMap, String name, DcMotor.Direction direction) {
        _motor = hardwareMap.get(DcMotor.class, name);
        _motor.setDirection(direction);
    }

    public void setMaxPower(double power) {
        _maxPower = power;
    }

    public void setMode(DcMotor.RunMode mode) {
        _motor.setMode(mode);
    }

    public void setPower(double power) {
        _motor.setPower(MathFunctions.clamp(-_maxPower, _maxPower, power));
    }

    public void setTargetPosition(int position) {
        forward();
        _motor.setTargetPosition(position);
    }

    public void forward() {
        _motor.setPower(1.0d);
    }

    public void reverse() {
        _motor.setPower(-1.0d);
    }

    public void stop() {
        _motor.setPower(0.0d);
    }
}
