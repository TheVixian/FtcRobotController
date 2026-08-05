package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.teamcode.Intake.State.REVERSE;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.State;

public class Intake {

    DcMotor intake;
    private State state;


    public Intake(HardwareMap hm) {
        this.intake = hm.get(DcMotor.class, "mch0");
    }

    public enum State {

        IDLE,
        INTAKE,
        REVERSE
    }




    public void update(Gamepad gm1) {
        switch (state) {
            case IDLE:
                intake.setPower(0);
            case INTAKE :
                intake.setPower(1);

            case REVERSE :
                intake.setPower(-1);
        }
    }
}
