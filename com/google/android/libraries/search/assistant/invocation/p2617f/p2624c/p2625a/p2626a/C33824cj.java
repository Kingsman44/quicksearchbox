package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.cj */
/* compiled from: PG */
public enum C33824cj implements C62957cd {
    PROCESS_UNKNOWN(0),
    PROCESS_SEARCH(1),
    PROCESS_INTERACTOR(2),
    PROCESS_MAIN(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f90288f;

    private C33824cj(int i) {
        this.f90288f = i;
    }

    /* renamed from: a */
    public static C33824cj m62430a(int i) {
        if (i == 0) {
            return PROCESS_UNKNOWN;
        }
        if (i == 1) {
            return PROCESS_SEARCH;
        }
        if (i == 2) {
            return PROCESS_INTERACTOR;
        }
        if (i != 3) {
            return null;
        }
        return PROCESS_MAIN;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f90288f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
