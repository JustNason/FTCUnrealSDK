package org.qualcomm.robotcore.eventloop.opmode;

import org.qualcomm.robotcore.hardware.HardwareMap;
import org.ftcunreal.runtime.opmode.OpMode;

public abstract class LinearOpMode extends OpMode {


    public abstract void runOpMode();

    @Override
    public void internalRunOpMode() {
        runOpMode();
    }


}
