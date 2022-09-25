package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.eh */
/* compiled from: PG */
public final class C58418eh extends C58419ei implements Serializable {

    /* renamed from: a */
    public static final C58418eh f156030a = new C58418eh();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f156030a;
    }

    /* renamed from: a */
    public final Integer mo55220a(Integer num) {
        int intValue = num.intValue();
        if (intValue == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(intValue + 1);
    }

    /* renamed from: b */
    public final Integer mo55221b(Integer num) {
        int intValue = num.intValue();
        if (intValue == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(intValue - 1);
    }

    public final String toString() {
        return "DiscreteDomain.integers()";
    }
}
