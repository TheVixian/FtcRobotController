package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.robotmodules.Brake;
import org.firstinspires.ftc.teamcode.robotmodules.Dropdown;
import org.firstinspires.ftc.teamcode.robotmodules.Intake;

@TeleOp
public class OpMode extends LinearOpMode {
    Brake brake;
    Chassis chassis;
    Intake intake;
    Dropdown dropdown;

    @Override
    public void runOpMode() throws InterruptedException {
        chassis = new Chassis(hardwareMap);
        intake = new Intake(hardwareMap);
        brake = new Brake(hardwareMap);
        dropdown = new Dropdown(hardwareMap);

        waitForStart();

        while(opModeIsActive()){
            chassis.update(gamepad1);
            intake.update(gamepad1);
            brake.update(gamepad1);
            dropdown.update(gamepad1);
        }
    }

}
