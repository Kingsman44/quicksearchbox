package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146821r;

/* renamed from: com.google.android.libraries.ac.b.e.dg */
/* compiled from: PG */
public abstract class C146958dg {
    /* renamed from: e */
    public static C146958dg m239554e(C146821r rVar, long j) {
        Long l;
        Long b = rVar.mo123700b();
        Long c = rVar.mo123701c();
        Long l2 = null;
        if (b == null) {
            l = null;
        } else {
            l = Long.valueOf(b.longValue() + j);
        }
        if (c != null) {
            l2 = Long.valueOf(c.longValue() + j);
        }
        return new C146826a(l, l2, (long) rVar.mo123699a(), j);
    }

    /* renamed from: a */
    public abstract long mo123719a();

    /* renamed from: b */
    public abstract long mo123720b();

    /* renamed from: c */
    public abstract Long mo123721c();

    /* renamed from: d */
    public abstract Long mo123722d();
}
