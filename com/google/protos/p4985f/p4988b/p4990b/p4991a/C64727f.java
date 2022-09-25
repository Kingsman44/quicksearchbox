package com.google.protos.p4985f.p4988b.p4990b.p4991a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.protos.f.b.b.a.f */
/* compiled from: PG */
public enum C64727f implements C62957cd {
    UNKNOWN_STICKINESS(0),
    DEFAULT(1),
    STICKY(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f175454e;

    private C64727f(int i) {
        this.f175454e = i;
    }

    /* renamed from: a */
    public static C64727f m96444a(int i) {
        if (i == 0) {
            return UNKNOWN_STICKINESS;
        }
        if (i == 1) {
            return DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return STICKY;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f175454e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
