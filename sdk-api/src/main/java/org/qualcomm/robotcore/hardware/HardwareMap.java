package org.qualcomm.robotcore.hardware;

public interface HardwareMap {
    <T> T get(Class<T> deviceType, String name);
}
