package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ip */
/* compiled from: PG */
final class C145452ip implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145316do f393264a;

    /* renamed from: b */
    final /* synthetic */ C145455is f393265b;

    public C145452ip(C145455is isVar, C145316do doVar) {
        this.f393265b = isVar;
        this.f393264a = doVar;
    }

    public final void run() {
        synchronized (this.f393265b) {
            this.f393265b.f393268a = false;
            if (!this.f393265b.f393270c.mo121165u()) {
                this.f393265b.f393270c.f393011w.mo120965ar().f392802j.mo120894a("Connected to remote service");
                this.f393265b.f393270c.mo121164t(this.f393264a);
            }
        }
    }
}
