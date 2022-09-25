package com.google.android.libraries.directboot;

import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.directboot.b */
/* compiled from: PG */
public final /* synthetic */ class C20672b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f57949a;

    /* renamed from: b */
    public final /* synthetic */ Context f57950b;

    /* renamed from: c */
    public final /* synthetic */ BroadcastReceiver f57951c;

    public /* synthetic */ C20672b(AtomicBoolean atomicBoolean, Context context, BroadcastReceiver broadcastReceiver) {
        this.f57949a = atomicBoolean;
        this.f57950b = context;
        this.f57951c = broadcastReceiver;
    }

    public final void run() {
        AtomicBoolean atomicBoolean = this.f57949a;
        Context context = this.f57950b;
        BroadcastReceiver broadcastReceiver = this.f57951c;
        int i = C20674d.f57955a;
        if (atomicBoolean.compareAndSet(false, true)) {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
