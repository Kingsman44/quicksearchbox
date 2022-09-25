package com.google.android.libraries.lens.view.p2113h.p2114a;

import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.h.a.f */
/* compiled from: PG */
public abstract class C26645f {
    /* renamed from: d */
    public static C26645f m49231d() {
        return new C26640a(0.0f, 0.0f, 0);
    }

    /* renamed from: a */
    public abstract float mo31920a();

    /* renamed from: b */
    public abstract float mo31921b();

    /* renamed from: c */
    public abstract long mo31922c();

    public final String toString() {
        return String.format(Locale.US, "AvgMax: (%d: %.3f %.3f)", new Object[]{Long.valueOf(mo31922c()), Float.valueOf(mo31920a()), Float.valueOf(mo31921b())});
    }
}
