package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothProfile;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.a */
/* compiled from: PG */
final class C95322a implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    final /* synthetic */ C95349b f266706a;

    public C95322a(C95349b bVar) {
        this.f266706a = bVar;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        if (i == 2) {
            synchronized (this.f266706a) {
                this.f266706a.f266780a = (BluetoothA2dp) bluetoothProfile;
            }
        }
    }

    public final void onServiceDisconnected(int i) {
    }
}
