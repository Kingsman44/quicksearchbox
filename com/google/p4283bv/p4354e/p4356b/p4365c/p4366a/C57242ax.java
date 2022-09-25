package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.b.c.a.ax */
/* compiled from: PG */
public enum C57242ax implements C62957cd {
    UNKNOWN_ORIGIN(0),
    CLIENT_SESSION(1),
    CLIENT_CACHE(2);
    

    /* renamed from: d */
    public final int f152806d;

    private C57242ax(int i) {
        this.f152806d = i;
    }

    /* renamed from: a */
    public static C57242ax m88281a(int i) {
        if (i == 0) {
            return UNKNOWN_ORIGIN;
        }
        if (i == 1) {
            return CLIENT_SESSION;
        }
        if (i != 2) {
            return null;
        }
        return CLIENT_CACHE;
    }

    /* renamed from: b */
    public static C62959cf m88282b() {
        return C57241aw.f152801a;
    }

    public final int getNumber() {
        return this.f152806d;
    }

    public final String toString() {
        return Integer.toString(this.f152806d);
    }
}
