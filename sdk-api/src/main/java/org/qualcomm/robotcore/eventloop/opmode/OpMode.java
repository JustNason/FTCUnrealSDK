package org.qualcomm.robotcore.eventloop.opmode;

import org.qualcomm.robotcore.hardware.HardwareMap;

public abstract class OpMode {
    public volatile HardwareMap hardwareMap;

    public abstract void internalRunOpMode();


}
