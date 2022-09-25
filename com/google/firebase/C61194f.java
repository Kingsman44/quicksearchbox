package com.google.firebase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.f */
/* compiled from: PG */
final class C61194f extends BroadcastReceiver {

    /* renamed from: a */
    public static final AtomicReference f165542a = new AtomicReference();

    /* renamed from: b */
    private final Context f165543b;

    public C61194f(Context context) {
        this.f165543b = context;
    }

    public final void onReceive(Context context, Intent intent) {
        synchronized (C61204g.f165553a) {
            for (C61204g g : C61204g.f165554b.values()) {
                g.mo57771g();
            }
        }
        this.f165543b.unregisterReceiver(this);
    }
}
