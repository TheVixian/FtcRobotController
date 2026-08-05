package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class OpMode extends LinearOpMode {

    Chassis chassis;
    Intake intake;
    @Override
    public void runOpMode() throws InterruptedException {
        chassis = new Chassis(hardwareMap);
        intake = new Intake(hardwareMap);
        waitForStart();
        while(opModeIsActive()){
            chassis.update(gamepad1);
            intake.update(gamepad1);
        }
    }

}
