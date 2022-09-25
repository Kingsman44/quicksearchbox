package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gp */
/* compiled from: PG */
final class C145398gp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f393090a;

    /* renamed from: b */
    final /* synthetic */ C145416hg f393091b;

    public C145398gp(C145416hg hgVar, long j) {
        this.f393091b = hgVar;
        this.f393090a = j;
    }

    public final void run() {
        this.f393091b.mo121104r(this.f393090a, true);
        this.f393091b.f393011w.mo120975m().mo121156l(new AtomicReference());
    }
}
