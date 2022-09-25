package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gs */
/* compiled from: PG */
public final class C145401gs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f393096a;

    /* renamed from: b */
    final /* synthetic */ String f393097b;

    /* renamed from: c */
    final /* synthetic */ String f393098c;

    /* renamed from: d */
    final /* synthetic */ C145416hg f393099d;

    public C145401gs(C145416hg hgVar, AtomicReference atomicReference, String str, String str2) {
        this.f393099d = hgVar;
        this.f393096a = atomicReference;
        this.f393097b = str;
        this.f393098c = str2;
    }

    public final void run() {
        C145456it m = this.f393099d.f393011w.mo120975m();
        AtomicReference atomicReference = this.f393096a;
        String str = this.f393097b;
        String str2 = this.f393098c;
        m.mo120904g();
        m.mo120949a();
        m.mo121159o(new C145447ik(m, atomicReference, str, str2, m.mo121152e(false)));
    }
}
