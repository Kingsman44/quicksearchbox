package com.google.android.p10723g.p10724a;

import android.content.Context;

/* renamed from: com.google.android.g.a.d */
/* compiled from: PG */
public final class C142651d {

    /* renamed from: b */
    private static volatile C142651d f387087b;

    /* renamed from: a */
    public final Context f387088a;

    private C142651d(Context context) {
        this.f387088a = context;
    }

    /* renamed from: a */
    public static C142651d m231442a() {
        C142651d dVar = f387087b;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: b */
    public static void m231443b(Context context) {
        if (f387087b == null) {
            synchronized (C142651d.class) {
                if (f387087b == null) {
                    f387087b = new C142651d(context);
                }
            }
        }
    }
}
