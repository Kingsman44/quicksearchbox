package com.google.android.gms.measurement.api.internal;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.measurement.api.internal.ad */
/* compiled from: PG */
abstract class C145183ad implements Runnable {

    /* renamed from: f */
    final long f392430f = System.currentTimeMillis();

    /* renamed from: g */
    final long f392431g = SystemClock.elapsedRealtime();

    /* renamed from: h */
    final boolean f392432h;

    /* renamed from: i */
    final /* synthetic */ C145192am f392433i;

    public C145183ad(C145192am amVar, boolean z) {
        this.f392433i = amVar;
        this.f392432h = z;
    }

    /* renamed from: a */
    public abstract void mo120691a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo120692b() {
    }

    public final void run() {
        if (this.f392433i.f392456e) {
            mo120692b();
            return;
        }
        try {
            mo120691a();
        } catch (Exception e) {
            this.f392433i.mo120701a(e, false, this.f392432h);
            mo120692b();
        }
    }
}
