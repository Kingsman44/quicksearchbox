package com.google.android.libraries.search.p2904c.p2908b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.b.h */
/* compiled from: PG */
public enum C37384h implements C62957cd {
    BISTO(0),
    WEB_LAYER(1),
    SODA(2),
    TEST(100);
    

    /* renamed from: e */
    public final int f99301e;

    private C37384h(int i) {
        this.f99301e = i;
    }

    /* renamed from: a */
    public static C37384h m66405a(int i) {
        if (i == 0) {
            return BISTO;
        }
        if (i == 1) {
            return WEB_LAYER;
        }
        if (i == 2) {
            return SODA;
        }
        if (i != 100) {
            return null;
        }
        return TEST;
    }

    /* renamed from: b */
    public static C62959cf m66406b() {
        return C37383g.f99295a;
    }

    public final int getNumber() {
        return this.f99301e;
    }

    public final String toString() {
        return Integer.toString(this.f99301e);
    }
}
