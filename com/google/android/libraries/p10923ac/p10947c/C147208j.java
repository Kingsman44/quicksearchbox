package com.google.android.libraries.p10923ac.p10947c;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.ac.c.j */
/* compiled from: PG */
public abstract class C147208j {
    static {
        m240058d(0, (Long) null, (Long) null);
    }

    /* renamed from: d */
    public static C147208j m240058d(int i, Long l, Long l2) {
        boolean z = false;
        C58838bb.m90869d(i >= 0, "num must be >= 0");
        if (l2 == null || l == null || l2.longValue() >= l.longValue()) {
            z = true;
        }
        C58838bb.m90869d(z, "if max and min are set, then max must be >= min");
        return new C147201c(i, l, l2);
    }

    /* renamed from: a */
    public abstract int mo124023a();

    /* renamed from: b */
    public abstract Long mo124024b();

    /* renamed from: c */
    public abstract Long mo124025c();
}
