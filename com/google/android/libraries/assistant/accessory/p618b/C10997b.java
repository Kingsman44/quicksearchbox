package com.google.android.libraries.assistant.accessory.p618b;

import android.bluetooth.BluetoothDevice;

/* renamed from: com.google.android.libraries.assistant.accessory.b.b */
/* compiled from: PG */
final class C10997b extends C11001f {

    /* renamed from: a */
    public final BluetoothDevice f36147a;

    /* renamed from: b */
    public final Integer f36148b;

    public C10997b(BluetoothDevice bluetoothDevice, Integer num) {
        this.f36147a = bluetoothDevice;
        this.f36148b = num;
    }

    /* renamed from: a */
    public final BluetoothDevice mo19372a() {
        return this.f36147a;
    }

    /* renamed from: b */
    public final C11000e mo19373b() {
        return new C10996a(this);
    }

    /* renamed from: c */
    public final Integer mo19374c() {
        return this.f36148b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11001f) {
            C11001f fVar = (C11001f) obj;
            return this.f36147a.equals(fVar.mo19372a()) && this.f36148b.equals(fVar.mo19374c());
        }
    }

    public final int hashCode() {
        return ((this.f36147a.hashCode() ^ 1000003) * 1000003) ^ this.f36148b.hashCode();
    }

    public final String toString() {
        String obj = this.f36147a.toString();
        Integer num = this.f36148b;
        return "BluetoothDeviceState{device=" + obj + ", state=" + num + "}";
    }
}
