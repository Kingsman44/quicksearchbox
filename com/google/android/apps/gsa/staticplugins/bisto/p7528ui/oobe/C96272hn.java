package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothProfile;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.hn */
/* compiled from: PG */
final class C96272hn implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    final /* synthetic */ C96273ho f269430a;

    public C96272hn(C96273ho hoVar) {
        this.f269430a = hoVar;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        this.f269430a.f269434p.put(i, bluetoothProfile);
        this.f269430a.mo90041p();
    }

    public final void onServiceDisconnected(int i) {
        this.f269430a.f269434p.remove(i);
    }
}
