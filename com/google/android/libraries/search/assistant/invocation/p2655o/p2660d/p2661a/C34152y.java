package com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.d.a.y */
/* compiled from: PG */
public enum C34152y implements C62957cd {
    UNKNOWN(0),
    LEGACY(1),
    HDM(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f90923e;

    private C34152y(int i) {
        this.f90923e = i;
    }

    /* renamed from: a */
    public static C34152y m62768a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return LEGACY;
        }
        if (i != 2) {
            return null;
        }
        return HDM;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f90923e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
