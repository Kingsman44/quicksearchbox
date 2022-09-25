package com.google.common.p4543n.p4546c;

import com.google.common.base.C58838bb;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58557jl;
import java.io.Serializable;
import p3186j$.time.Duration;

/* renamed from: com.google.common.n.c.o */
/* compiled from: PG */
public abstract class C59407o implements Serializable {
    /* renamed from: d */
    public static long m92308d(Duration duration) {
        if (duration.compareTo(Duration.ofMillis(Long.MAX_VALUE)) >= 0) {
            return Long.MAX_VALUE;
        }
        if (duration.compareTo(Duration.ofMillis(Long.MIN_VALUE)) <= 0) {
            return Long.MIN_VALUE;
        }
        try {
            return duration.toMillis();
        } catch (ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }

    /* renamed from: e */
    public static C59407o m92309e(long j, int i) {
        if (j == 0) {
            return new C59400h(i);
        }
        return new C59399g(j, i);
    }

    /* renamed from: g */
    public static void m92310g(int i) {
        C58838bb.m90877l(i >= 0, "%s (%s) must be >= 0", "tries", i);
    }

    /* renamed from: h */
    public static void m92311h(long j, String str) {
        C58838bb.m90878m(j >= 0, "%s (%s) must be >= 0", str, j);
    }

    /* renamed from: i */
    public static void m92312i(int i) {
        C58838bb.m90877l(i > 0, "%s (%s) must be > 0", "numAttempts", i);
    }

    /* renamed from: j */
    public static void m92313j(long j, String str) {
        C58838bb.m90878m(j > 0, "%s (%s) must be > 0", str, j);
    }

    @Deprecated
    /* renamed from: a */
    public abstract long mo56909a(int i);

    /* renamed from: b */
    public boolean mo56912b(int i) {
        return mo56909a(i) >= 0;
    }

    @Deprecated
    /* renamed from: c */
    public long mo56917c(int i, long j) {
        if (!mo56912b(i)) {
            return -1;
        }
        return mo56909a(i);
    }

    /* renamed from: f */
    public final Iterable mo56924f(C58889cz czVar) {
        return C58557jl.m90127h(new C59398f(this, czVar), C59396d.f157602a);
    }
}
