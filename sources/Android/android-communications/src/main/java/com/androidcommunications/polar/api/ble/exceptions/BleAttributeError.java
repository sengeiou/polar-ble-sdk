package com.androidcommunications.polar.api.ble.exceptions;

/**
 * Error indicating that requested attribute operation failed with error code
 */
public class BleAttributeError extends Exception {
    private int error;

    public BleAttributeError(String message, int error) {
        super(message + " failed with error: " + error);
        this.error = error;
    }

    public int getError() {
        return error;
    }
}
