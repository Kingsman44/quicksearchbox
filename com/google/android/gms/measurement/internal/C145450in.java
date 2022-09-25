package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.in */
/* compiled from: PG */
final class C145450in implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145316do f393260a;

    /* renamed from: b */
    final /* synthetic */ C145455is f393261b;

    public C145450in(C145455is isVar, C145316do doVar) {
        this.f393261b = isVar;
        this.f393260a = doVar;
    }

    public final void run() {
        synchronized (this.f393261b) {
            this.f393261b.f393268a = false;
            if (!this.f393261b.f393270c.mo121165u()) {
                this.f393261b.f393270c.f393011w.mo120965ar().f392803k.mo120894a("Connected to service");
                this.f393261b.f393270c.mo121164t(this.f393260a);
            }
        }
    }
}
