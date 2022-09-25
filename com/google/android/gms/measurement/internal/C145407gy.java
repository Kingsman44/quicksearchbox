package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gy */
/* compiled from: PG */
final class C145407gy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f393112a;

    /* renamed from: b */
    final /* synthetic */ C145416hg f393113b;

    public C145407gy(C145416hg hgVar, AtomicReference atomicReference) {
        this.f393113b = hgVar;
        this.f393112a = atomicReference;
    }

    public final void run() {
        synchronized (this.f393112a) {
            try {
                AtomicReference atomicReference = this.f393112a;
                C145416hg hgVar = this.f393113b;
                atomicReference.set(Integer.valueOf(hgVar.f393011w.f392937g.mo120768d(hgVar.f393011w.mo120969d().mo120874e(), C145313dl.f392706M)));
                this.f393112a.notify();
            } catch (Throwable th) {
                this.f393112a.notify();
                throw th;
            }
        }
    }
}
