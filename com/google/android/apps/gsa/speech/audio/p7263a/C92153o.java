package com.google.android.apps.gsa.speech.audio.p7263a;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.speech.audio.a.o */
/* compiled from: PG */
public abstract class C92153o extends BroadcastReceiver {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo71725a(Intent intent, C92149k kVar);

    public final void onReceive(Context context, Intent intent) {
        mo71725a(intent, intent.hasExtra("android.bluetooth.device.extra.DEVICE") ? new C92149k((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) : null);
    }
}
