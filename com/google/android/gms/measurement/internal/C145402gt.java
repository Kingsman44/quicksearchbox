package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gt */
/* compiled from: PG */
final class C145402gt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f393100a;

    /* renamed from: b */
    final /* synthetic */ C145416hg f393101b;

    public C145402gt(C145416hg hgVar, AtomicReference atomicReference) {
        this.f393101b = hgVar;
        this.f393100a = atomicReference;
    }

    public final void run() {
        synchronized (this.f393100a) {
            try {
                AtomicReference atomicReference = this.f393100a;
                C145416hg hgVar = this.f393101b;
                atomicReference.set(Boolean.valueOf(hgVar.f393011w.f392937g.mo120776m(hgVar.f393011w.mo120969d().mo120874e(), C145313dl.f392703J)));
                this.f393100a.notify();
            } catch (Throwable th) {
                this.f393100a.notify();
                throw th;
            }
        }
    }
}
