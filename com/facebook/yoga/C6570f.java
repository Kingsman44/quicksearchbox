package com.facebook.yoga;

/* renamed from: com.facebook.yoga.f */
/* compiled from: PG */
public enum C6570f {
    INHERIT(0),
    LTR(1),
    RTL(2);
    

    /* renamed from: d */
    public final int f19563d;

    private C6570f(int i) {
        this.f19563d = i;
    }

    /* renamed from: a */
    public static C6570f m17937a(int i) {
        if (i == 0) {
            return INHERIT;
        }
        if (i == 1) {
            return LTR;
        }
        if (i == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }
}
