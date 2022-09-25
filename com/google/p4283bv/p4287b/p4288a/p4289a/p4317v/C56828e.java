package com.google.p4283bv.p4287b.p4288a.p4289a.p4317v;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.b.a.a.v.e */
/* compiled from: PG */
public enum C56828e implements C62957cd {
    UNKNOWN(0),
    ON(1),
    OFF(2);
    

    /* renamed from: d */
    public final int f151627d;

    private C56828e(int i) {
        this.f151627d = i;
    }

    /* renamed from: a */
    public static C56828e m88227a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ON;
        }
        if (i != 2) {
            return null;
        }
        return OFF;
    }

    /* renamed from: b */
    public static C62959cf m88228b() {
        return C56827d.f151622a;
    }

    public final int getNumber() {
        return this.f151627d;
    }

    public final String toString() {
        return Integer.toString(this.f151627d);
    }
}
