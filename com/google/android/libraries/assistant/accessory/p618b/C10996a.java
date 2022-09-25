package com.google.android.libraries.assistant.accessory.p618b;

import android.bluetooth.BluetoothDevice;

/* renamed from: com.google.android.libraries.assistant.accessory.b.a */
/* compiled from: PG */
final class C10996a extends C11000e {

    /* renamed from: a */
    public BluetoothDevice f36145a;

    /* renamed from: b */
    public Integer f36146b;

    public C10996a() {
    }

    public C10996a(C11001f fVar) {
        C10997b bVar = (C10997b) fVar;
        this.f36145a = bVar.f36147a;
        this.f36146b = bVar.f36148b;
    }

    /* renamed from: a */
    public final C11001f mo19370a() {
        Integer num;
        BluetoothDevice bluetoothDevice = this.f36145a;
        if (bluetoothDevice != null && (num = this.f36146b) != null) {
            return new C10997b(bluetoothDevice, num);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f36145a == null) {
            sb.append(" device");
        }
        if (this.f36146b == null) {
            sb.append(" state");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo19371b(Integer num) {
        this.f36146b = num;
    }
}
