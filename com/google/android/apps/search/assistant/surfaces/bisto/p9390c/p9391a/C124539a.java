package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.a.a */
/* compiled from: PG */
public final class C124539a {

    /* renamed from: a */
    public final BluetoothDevice f343619a;

    public C124539a(BluetoothDevice bluetoothDevice) {
        this.f343619a = bluetoothDevice;
    }

    /* renamed from: a */
    public final void mo106452a(Intent intent) {
        intent.putExtra("extra_device", this.f343619a);
    }

    /* renamed from: b */
    public final void mo106453b(Intent intent) {
        intent.putExtra("android.bluetooth.device.extra.DEVICE", this.f343619a);
    }

    /* renamed from: c */
    public final boolean mo106454c() {
        try {
            return Boolean.TRUE.equals(BluetoothDevice.class.getMethod("isConnected", new Class[0]).invoke(this.f343619a, new Object[0]));
        } catch (Exception unused) {
            return false;
        }
    }
}
