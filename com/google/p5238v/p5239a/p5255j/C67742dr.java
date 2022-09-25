package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.v.a.j.dr */
/* compiled from: PG */
public enum C67742dr implements C62957cd {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f183796g;

    private C67742dr(int i) {
        this.f183796g = i;
    }

    /* renamed from: a */
    public static C67742dr m97851a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f183796g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
