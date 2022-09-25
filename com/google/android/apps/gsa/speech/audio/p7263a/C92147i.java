package com.google.android.apps.gsa.speech.audio.p7263a;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;

/* renamed from: com.google.android.apps.gsa.speech.audio.a.i */
/* compiled from: PG */
final class C92147i implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    final /* synthetic */ C92151m f256917a;

    public C92147i(C92151m mVar) {
        this.f256917a = mVar;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        this.f256917a.mo71738l(new C92150l((BluetoothHeadset) bluetoothProfile));
    }

    public final void onServiceDisconnected(int i) {
        this.f256917a.mo71739m();
    }
}
