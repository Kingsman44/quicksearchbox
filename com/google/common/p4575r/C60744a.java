package com.google.common.p4575r;

import java.util.Comparator;

/* renamed from: com.google.common.r.a */
/* compiled from: PG */
public enum C60744a implements Comparator {
    TRUE_FIRST(1, "Booleans.trueFirst()"),
    FALSE_FIRST(-1, "Booleans.falseFirst()");
    

    /* renamed from: d */
    private final int f164786d;

    /* renamed from: e */
    private final String f164787e;

    private C60744a(int i, String str) {
        this.f164786d = i;
        this.f164787e = str;
    }

    public final String toString() {
        return this.f164787e;
    }
}
