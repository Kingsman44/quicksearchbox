package com.google.android.apps.p489g.p494d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.g.d.cg */
/* compiled from: PG */
public enum C9198cg implements C62957cd {
    NEUTRAL(0),
    WARNING(1),
    CRITICAL(2),
    GOOD(3);
    

    /* renamed from: e */
    private final int f31763e;

    private C9198cg(int i) {
        this.f31763e = i;
    }

    /* renamed from: a */
    public static C9198cg m23686a(int i) {
        if (i == 0) {
            return NEUTRAL;
        }
        if (i == 1) {
            return WARNING;
        }
        if (i == 2) {
            return CRITICAL;
        }
        if (i != 3) {
            return null;
        }
        return GOOD;
    }

    /* renamed from: b */
    public static C62959cf m23687b() {
        return C9197cf.f31757a;
    }

    public final int getNumber() {
        return this.f31763e;
    }

    public final String toString() {
        return Integer.toString(this.f31763e);
    }
}
