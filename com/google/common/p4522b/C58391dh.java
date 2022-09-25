package com.google.common.p4522b;

import com.google.common.p4575r.C60745b;
import com.google.common.p4575r.C60757n;
import java.util.Comparator;

/* renamed from: com.google.common.b.dh */
/* compiled from: PG */
public final class C58391dh extends C58393dj {
    /* renamed from: g */
    public static final C58393dj m89477g(int i) {
        return i < 0 ? C58393dj.f155990c : i > 0 ? C58393dj.f155991d : C58393dj.f155989b;
    }

    /* renamed from: a */
    public final int mo55134a() {
        return 0;
    }

    /* renamed from: b */
    public final C58393dj mo55135b(int i, int i2) {
        return m89477g(C60757n.m92741b(i, i2));
    }

    /* renamed from: c */
    public final C58393dj mo55136c(Comparable comparable, Comparable comparable2) {
        return m89477g(comparable.compareTo(comparable2));
    }

    /* renamed from: d */
    public final C58393dj mo55137d(Object obj, Object obj2, Comparator comparator) {
        return m89477g(comparator.compare(obj, obj2));
    }

    /* renamed from: e */
    public final C58393dj mo55138e(boolean z, boolean z2) {
        return m89477g(C60745b.m92716a(z, z2));
    }

    /* renamed from: f */
    public final C58393dj mo55139f(boolean z, boolean z2) {
        return m89477g(C60745b.m92716a(z2, z));
    }
}
