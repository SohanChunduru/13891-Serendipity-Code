package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


// Created by vagmi on 11/24/2017.

@TeleOp(name="GamePad Drive", group="Trial 1")

abstract public class GamePad_Drive_TeleOp extends OpMode {


    DcMotor leftTopWheel;
    DcMotor rightTopWheel;
    DcMotor leftBottomWheel;
    DcMotor rightBottomWheel;


    double leftTopWheelPower;
    double rightTopWheelPower;
    double leftBottomWheelPower;
    double rightBottomWheelPower;

    // delete this part if using float part


    @Override
    public void init() {

        leftBottomWheel = hardwareMap.dcMotor.get("left_Wheel");
        rightBottomWheel = hardwareMap.dcMotor.get("right_Wheel");
        leftTopWheel = hardwareMap.dcMotor.get("left_Wheel");
        rightTopWheel = hardwareMap.dcMotor.get("right_Wheel");

        rightTopWheel.setDirection(DcMotor.Direction.REVERSE);
        rightBottomWheel.setDirection(DcMotor.Direction.REVERSE);
        // might need to make left wheel go reverse instead of right.

        leftTopWheelPower = gamepad1.left_stick_y;
        rightTopWheelPower = gamepad1.right_stick_y;
        leftBottomWheelPower = gamepad1.left_stick_y;
        rightBottomWheelPower = gamepad1.right_stick_y;

        leftTopWheel.setPower(.5);
        rightTopWheel.setPower(.5);
        leftBottomWheel.setPower(.5);
        rightBottomWheel.setPower(.5);


        if (gamepad1.a) {
            leftTopWheel.setPower(0.25);
            rightTopWheel.setPower(0.25);
            leftBottomWheel.setPower(0.25);
            rightBottomWheel.setPower(0.25);

        } else if (gamepad1.b) {

            leftTopWheel.setPower(.5);
            rightTopWheel.setPower(.5);
            leftBottomWheel.setPower(.5);
            rightBottomWheel.setPower(.5);
        } else if (gamepad1.x) {

            leftTopWheel.setPower(.75);
            rightTopWheel.setPower(.75);
            leftBottomWheel.setPower(.75);
            rightBottomWheel.setPower(.75);
        } else if (gamepad1.y) {

            leftTopWheel.setPower(1.0);
            rightTopWheel.setPower(1.0);
            leftBottomWheel.setPower(1.0);
            rightBottomWheel.setPower(1.0);

        }

         }
}

    //float leftTopWheelPower = gamepad1.left_stick_y - gamepad1.left_stick_x;
    //float leftBottomWheelPower = gamepad1.left_stick_y + gamepad1.left_stick_x;
    //float rightTopWheelPower = gamepad1.right_stick_y + gamepad1.right_stick_x;
    //float rightBottomWheelPower = gamepad1.right_stick_y + gamepad1.right_stick_x;

    // if we use this delete the double part above first overrde