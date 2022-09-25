package com.google.p4152bb.p4153a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bb.a.gr */
/* compiled from: PG */
public enum C55122gr implements C62957cd {
    UNKNOWN_DEVICE(0),
    PRIMARY(1),
    COMPANION(2),
    CLOUD_SERVICE(3);
    

    /* renamed from: e */
    public final int f145060e;

    private C55122gr(int i) {
        this.f145060e = i;
    }

    /* renamed from: a */
    public static C55122gr m87596a(int i) {
        if (i == 0) {
            return UNKNOWN_DEVICE;
        }
        if (i == 1) {
            return PRIMARY;
        }
        if (i == 2) {
            return COMPANION;
        }
        if (i != 3) {
            return null;
        }
        return CLOUD_SERVICE;
    }

    /* renamed from: b */
    public static C62959cf m87597b() {
        return C55121gq.f145054a;
    }

    public final int getNumber() {
        return this.f145060e;
    }

    public final String toString() {
        return Integer.toString(this.f145060e);
    }
}
