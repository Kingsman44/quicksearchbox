package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.j.a */
/* compiled from: PG */
public final class C95010a {

    /* renamed from: a */
    public final BluetoothDevice f265818a;

    /* renamed from: b */
    private final C95014e f265819b;

    public C95010a(C95014e eVar, BluetoothDevice bluetoothDevice) {
        this.f265818a = bluetoothDevice;
        this.f265819b = eVar;
    }

    /* renamed from: a */
    public final C95013d mo88917a(Context context, BluetoothGattCallback bluetoothGattCallback) {
        BluetoothGatt connectGatt = this.f265818a.connectGatt(context, false, bluetoothGattCallback, 2);
        if (connectGatt == null) {
            return null;
        }
        C95014e eVar = this.f265819b;
        C95011b bVar = (C95011b) eVar.f265826b.mo17428b();
        bVar.getClass();
        C90851k kVar = (C90851k) eVar.f265825a.mo17428b();
        kVar.getClass();
        return new C95013d(bVar, kVar, connectGatt);
    }
}
