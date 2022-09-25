package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.b.c.a.dt */
/* compiled from: PG */
public enum C57319dt implements C62957cd {
    UNKNOWN_BUILD_TYPE(0),
    DEV(1),
    ALPHA(2),
    BETA(3),
    RELEASE(4);
    

    /* renamed from: f */
    public final int f153008f;

    private C57319dt(int i) {
        this.f153008f = i;
    }

    /* renamed from: a */
    public static C57319dt m88312a(int i) {
        if (i == 0) {
            return UNKNOWN_BUILD_TYPE;
        }
        if (i == 1) {
            return DEV;
        }
        if (i == 2) {
            return ALPHA;
        }
        if (i == 3) {
            return BETA;
        }
        if (i != 4) {
            return null;
        }
        return RELEASE;
    }

    /* renamed from: b */
    public static C62959cf m88313b() {
        return C57318ds.f153001a;
    }

    public final int getNumber() {
        return this.f153008f;
    }

    public final String toString() {
        return Integer.toString(this.f153008f);
    }
}
