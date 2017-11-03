package com.clj.fastble.exception;

//没有找到蓝牙设备
public class NotFoundDeviceException extends BleException {
    public NotFoundDeviceException() {
        super(ERROR_CODE_NOT_FOUND_DEVICE, "Not Found Device Exception Occurred!");
    }
}
