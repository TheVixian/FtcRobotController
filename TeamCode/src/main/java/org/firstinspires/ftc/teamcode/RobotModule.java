package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public interface RobotModule {

    default void init(HardwareMap hm) {}
    default void update(Gamepad gamepad1, Gamepad gamepad2) {}
    default void update() {}

}
