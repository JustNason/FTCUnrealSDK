package org.ftcunreal.emulator;

import org.firstinspires.ftc.teamcode.Teleop;
import org.ftcunreal.runtime.hardware.HardwareMapImpl;
import org.ftcunreal.runtime.networking.HardwareHandler;
import org.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class Emulator {
    public void main(String[] args) {
        HardwareHandler hardwareHandler = new HardwareHandler();
        LinearOpMode opMode = new Teleop();

        HardwareMapImpl hardwareMap = new HardwareMapImpl(hardwareHandler);
        opMode.hardwareMap = hardwareMap;

        opMode.runOpMode();

    }
}
