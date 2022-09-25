package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.q */
/* compiled from: PG */
public enum C32871q implements C62957cd {
    UNKNOWN(0),
    STATIC_CACHE(1),
    SYNCHRONIZED_CACHE(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f88104e;

    private C32871q(int i) {
        this.f88104e = i;
    }

    /* renamed from: a */
    public static C32871q m60836a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return STATIC_CACHE;
        }
        if (i != 2) {
            return null;
        }
        return SYNCHRONIZED_CACHE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f88104e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
