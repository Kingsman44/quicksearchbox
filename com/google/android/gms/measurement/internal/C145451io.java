package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.io */
/* compiled from: PG */
final class C145451io implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ComponentName f393262a;

    /* renamed from: b */
    final /* synthetic */ C145455is f393263b;

    public C145451io(C145455is isVar, ComponentName componentName) {
        this.f393263b = isVar;
        this.f393262a = componentName;
    }

    public final void run() {
        this.f393263b.f393270c.mo121157m(this.f393262a);
    }
}
