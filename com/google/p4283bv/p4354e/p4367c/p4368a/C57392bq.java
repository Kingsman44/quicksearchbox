package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.c.a.bq */
/* compiled from: PG */
public enum C57392bq implements C62957cd {
    OVERFLOW_UNSPECIFIED(0),
    OVERFLOW_HIDDEN(1),
    OVERFLOW_SCROLL(2);
    

    /* renamed from: d */
    private final int f153310d;

    private C57392bq(int i) {
        this.f153310d = i;
    }

    /* renamed from: a */
    public static C57392bq m88340a(int i) {
        if (i == 0) {
            return OVERFLOW_UNSPECIFIED;
        }
        if (i == 1) {
            return OVERFLOW_HIDDEN;
        }
        if (i != 2) {
            return null;
        }
        return OVERFLOW_SCROLL;
    }

    /* renamed from: b */
    public static C62959cf m88341b() {
        return C57391bp.f153305a;
    }

    public final int getNumber() {
        return this.f153310d;
    }

    public final String toString() {
        return Integer.toString(this.f153310d);
    }
}
