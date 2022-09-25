package com.google.android.p10712d;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.d.hq */
/* compiled from: PG */
public enum C142500hq implements C62957cd {
    UNKNOWN_SERVICE(0),
    TRANSLATE(1),
    HOTLINE(2),
    DUO(3),
    MAESTRO(4),
    AIAI(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f386703h;

    private C142500hq(int i) {
        this.f386703h = i;
    }

    /* renamed from: a */
    public static C142500hq m231092a(int i) {
        if (i == 0) {
            return UNKNOWN_SERVICE;
        }
        if (i == 1) {
            return TRANSLATE;
        }
        if (i == 2) {
            return HOTLINE;
        }
        if (i == 3) {
            return DUO;
        }
        if (i == 4) {
            return MAESTRO;
        }
        if (i != 5) {
            return null;
        }
        return AIAI;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f386703h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
