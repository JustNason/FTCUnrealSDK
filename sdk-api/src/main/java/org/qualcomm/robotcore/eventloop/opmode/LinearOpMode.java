package org.qualcomm.robotcore.eventloop.opmode;

import org.qualcomm.robotcore.hardware.Gamepad;
import org.qualcomm.robotcore.hardware.HardwareMap;

public abstract class LinearOpMode {


    public abstract void runOpMode();

    public final boolean opModeIsActive() {
       return true;
    }
    public final void waitForStart() {

    }
    public volatile HardwareMap hardwareMap;

    public volatile Gamepad gamepad1 = null;
    public volatile Gamepad gamepad2 = null;

}
