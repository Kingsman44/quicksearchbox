package com.google.android.apps.gsa.speech.audio.p7263a;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.audio.a.k */
/* compiled from: PG */
public final class C92149k {

    /* renamed from: a */
    public final BluetoothDevice f256919a;

    static {
        try {
            BluetoothDevice.class.getMethod("getAlias", new Class[0]);
            BluetoothDevice.class.getMethod("getAliasName", new Class[0]);
        } catch (NoSuchMethodException e) {
            C59104x c = C92154p.f256923a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VS.BluetoothShim");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(12145)).mo56386p("Error locating alias methods");
        }
    }

    public C92149k(BluetoothDevice bluetoothDevice) {
        this.f256919a = bluetoothDevice;
    }

    /* renamed from: a */
    public final int mo86812a() {
        BluetoothClass bluetoothClass = this.f256919a.getBluetoothClass();
        if (bluetoothClass == null) {
            return -1;
        }
        return bluetoothClass.getDeviceClass();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C92149k) {
            return this.f256919a.equals(((C92149k) obj).f256919a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f256919a.hashCode();
    }

    public final String toString() {
        return this.f256919a.toString();
    }
}
