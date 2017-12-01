package org.firstinspires.ftc.teamcode.Modules.Drives;

import org.firstinspires.ftc.teamcode.Modules.MotorModule;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
/**
 * Created by Sohan on 11/26/17.
 */

public class DriveModule {
    private MotorModule _backLeftMotor = new MotorModule();
    private MotorModule _backRightMotor = new MotorModule();
    private MotorModule _frontLeftMotor = new MotorModule();
    private MotorModule _frontRightMotor = new MotorModule();

    public void initialize(HardwareMap hardwareMap) {
        _backLeftMotor.initialize(hardwareMap, "backLeft", DcMotor.Direction.FORWARD);
        _backRightMotor.initialize(hardwareMap, "backRight", DcMotor.Direction.REVERSE);
        _frontLeftMotor.initialize(hardwareMap, "frontLeft", DcMotor.Direction.FORWARD);
        _frontRightMotor.initialize(hardwareMap, "frontRight", DcMotor.Direction.REVERSE);

        setMaxPower(1.0d);
        setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        stop();
    }

    public void setMaxPower(double power) {
        _backLeftMotor.setMaxPower(power);
        _backRightMotor.setMaxPower(power);
        _frontLeftMotor.setMaxPower(power);
        _frontRightMotor.setMaxPower(power);
    }

    public void setMode(DcMotor.RunMode mode) {
        _backLeftMotor.setMode(mode);
        _backRightMotor.setMode(mode);
        _frontLeftMotor.setMode(mode);
        _frontRightMotor.setMode(mode);
    }

    public void setPower(double power) {
        setPower(power, power);
    }

    public void setPower(double left, double right) {
        setPower(left, left, right, right);
    }

    public void setPower(double backLeft, double frontLeft, double backRight, double frontRight) {
        _backLeftMotor.setPower(backLeft);
        _backRightMotor.setPower(backRight);
        _frontLeftMotor.setPower(frontLeft);
        _frontRightMotor.setPower(frontRight);
    }

    public void stop() {
        setPower(0.0d);
    }
}
