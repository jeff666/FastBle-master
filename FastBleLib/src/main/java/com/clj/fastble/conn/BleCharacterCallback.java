package com.clj.fastble.conn;

import android.bluetooth.BluetoothGattCharacteristic;

//ble通道传值 返回值

public abstract class BleCharacterCallback extends BleCallback {
    public abstract void onSuccess(BluetoothGattCharacteristic characteristic);
}