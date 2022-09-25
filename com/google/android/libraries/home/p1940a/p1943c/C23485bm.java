package com.google.android.libraries.home.p1940a.p1943c;

import java.util.LinkedHashMap;
import p5462h.p5463a.C69505av;

/* renamed from: com.google.android.libraries.home.a.c.bm */
/* compiled from: PG */
public enum C23485bm {
    UNKNOWN_ACTIVITY_STATE(0),
    INACTIVE(1),
    ACTIVE(2),
    STANDBY(3);
    

    /* renamed from: e */
    public final int f64231e;

    static {
        int i;
        int b = C69505av.m100860b(r1);
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (C23485bm bmVar : values()) {
            linkedHashMap.put(Integer.valueOf(bmVar.f64231e), bmVar);
        }
    }

    private C23485bm(int i) {
        this.f64231e = i;
    }
}
