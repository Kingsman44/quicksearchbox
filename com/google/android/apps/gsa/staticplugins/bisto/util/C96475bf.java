package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.bluetooth.BluetoothDevice;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.bf */
/* compiled from: PG */
public final /* synthetic */ class C96475bf implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C96476bg f269909a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f269910b;

    public /* synthetic */ C96475bf(C96476bg bgVar, BluetoothDevice bluetoothDevice) {
        this.f269909a = bgVar;
        this.f269910b = bluetoothDevice;
    }

    public final void run() {
        this.f269909a.mo90170b(this.f269910b, true);
    }
}
