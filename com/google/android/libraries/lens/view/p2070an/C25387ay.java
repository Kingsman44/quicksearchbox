package com.google.android.libraries.lens.view.p2070an;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.lens.view.an.ay */
/* compiled from: PG */
public final class C25387ay {

    /* renamed from: a */
    static final ThreadLocal f69161a = new ThreadLocal();

    /* renamed from: a */
    public static void m46760a() {
        C58838bb.m90884s(Boolean.TRUE.equals(f69161a.get()), "expected to be on query executor");
    }

    /* renamed from: b */
    public static void m46761b(boolean z) {
        if (z) {
            f69161a.set(true);
        } else {
            f69161a.remove();
        }
    }
}
