package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.bo */
/* compiled from: PG */
public enum C32820bo implements C62957cd {
    UNKNOWN(0),
    STATIC_CACHE(1),
    SYNCHRONIZED_CACHE(2),
    CONTEXT_PROVIDER(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f88013f;

    private C32820bo(int i) {
        this.f88013f = i;
    }

    /* renamed from: a */
    public static C32820bo m60788a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return STATIC_CACHE;
        }
        if (i == 2) {
            return SYNCHRONIZED_CACHE;
        }
        if (i != 3) {
            return null;
        }
        return CONTEXT_PROVIDER;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f88013f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
