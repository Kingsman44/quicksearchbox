package com.google.android.apps.gsa.speech.audio.p7263a;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

/* renamed from: com.google.android.apps.gsa.speech.audio.a.j */
/* compiled from: PG */
public final class C92148j {

    /* renamed from: a */
    public final BluetoothAdapter f256918a;

    public C92148j(BluetoothAdapter bluetoothAdapter) {
        this.f256918a = bluetoothAdapter;
    }

    /* renamed from: a */
    public final boolean mo86811a(Context context, C92151m mVar) {
        return this.f256918a.getProfileProxy(context, new C92147i(mVar), 1);
    }
}
