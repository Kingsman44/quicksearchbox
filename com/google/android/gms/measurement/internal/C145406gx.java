package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gx */
/* compiled from: PG */
final class C145406gx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f393110a;

    /* renamed from: b */
    final /* synthetic */ C145416hg f393111b;

    public C145406gx(C145416hg hgVar, AtomicReference atomicReference) {
        this.f393111b = hgVar;
        this.f393110a = atomicReference;
    }

    public final void run() {
        synchronized (this.f393110a) {
            try {
                AtomicReference atomicReference = this.f393110a;
                C145416hg hgVar = this.f393111b;
                atomicReference.set(Long.valueOf(hgVar.f393011w.f392937g.mo120771h(hgVar.f393011w.mo120969d().mo120874e(), C145313dl.f392705L)));
                this.f393110a.notify();
            } catch (Throwable th) {
                this.f393110a.notify();
                throw th;
            }
        }
    }
}
