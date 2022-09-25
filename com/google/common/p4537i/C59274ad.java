package com.google.common.p4537i;

import java.io.Serializable;

/* renamed from: com.google.common.i.ad */
/* compiled from: PG */
final class C59274ad extends C59277b implements Serializable {

    /* renamed from: a */
    static final C59290o f157394a = new C59274ad();
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    private final int f157395b = 0;

    static {
        int i = C59294s.f157422b;
    }

    /* renamed from: e */
    public final C59291p mo56748e() {
        return new C59273ac();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C59274ad)) {
            return false;
        }
        int i = ((C59274ad) obj).f157395b;
        return true;
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_128(0)";
    }
}
