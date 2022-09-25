package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.v.a.j.cw */
/* compiled from: PG */
public enum C67720cw implements C62957cd {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f183739g;

    private C67720cw(int i) {
        this.f183739g = i;
    }

    /* renamed from: a */
    public static C67720cw m97847a(int i) {
        if (i == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i == 1) {
            return SYMMETRIC;
        }
        if (i == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i != 4) {
            return null;
        }
        return REMOTE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f183739g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
