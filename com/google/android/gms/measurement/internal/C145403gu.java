package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gu */
/* compiled from: PG */
public final class C145403gu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f393102a;

    /* renamed from: b */
    final /* synthetic */ String f393103b;

    /* renamed from: c */
    final /* synthetic */ String f393104c;

    /* renamed from: d */
    final /* synthetic */ boolean f393105d;

    /* renamed from: e */
    final /* synthetic */ C145416hg f393106e;

    public C145403gu(C145416hg hgVar, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f393106e = hgVar;
        this.f393102a = atomicReference;
        this.f393103b = str;
        this.f393104c = str2;
        this.f393105d = z;
    }

    public final void run() {
        C145456it m = this.f393106e.f393011w.mo120975m();
        AtomicReference atomicReference = this.f393102a;
        String str = this.f393103b;
        String str2 = this.f393104c;
        boolean z = this.f393105d;
        m.mo120904g();
        m.mo120949a();
        m.mo121159o(new C145449im(m, atomicReference, str, str2, m.mo121152e(false), z));
    }
}
