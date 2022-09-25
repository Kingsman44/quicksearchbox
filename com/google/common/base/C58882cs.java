package com.google.common.base;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.base.cs */
/* compiled from: PG */
public final class C58882cs implements Serializable, C58881cr {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58881cr f156719a;

    /* renamed from: b */
    final long f156720b;

    /* renamed from: c */
    volatile transient Object f156721c;

    /* renamed from: d */
    volatile transient long f156722d;

    public C58882cs(C58881cr crVar, long j, TimeUnit timeUnit) {
        crVar.getClass();
        this.f156719a = crVar;
        this.f156720b = timeUnit.toNanos(j);
        C58838bb.m90876k(j > 0, "duration (%s %s) must be > 0", j, timeUnit);
    }

    /* renamed from: a */
    public final Object mo6453a() {
        long j = this.f156722d;
        long a = C58837ba.m90852a();
        if (j == 0 || a - j >= 0) {
            synchronized (this) {
                if (j == this.f156722d) {
                    Object a2 = this.f156719a.mo6453a();
                    this.f156721c = a2;
                    long j2 = a + this.f156720b;
                    if (j2 == 0) {
                        j2 = 1;
                    }
                    this.f156722d = j2;
                    return a2;
                }
            }
        }
        return this.f156721c;
    }

    public final String toString() {
        return "Suppliers.memoizeWithExpiration(" + this.f156719a + ", " + this.f156720b + ", NANOS)";
    }
}
