package com.google.android.libraries.search.assistant.invocation.p2636j.p2637a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.j.a.b */
/* compiled from: PG */
public enum C33891b implements C62957cd {
    INVOCATION_STATE_UNSPECIFIED(0),
    IMPLICIT(1),
    EXPLICIT(2),
    CANCELED(3),
    EXECUTED(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f90423g;

    private C33891b(int i) {
        this.f90423g = i;
    }

    /* renamed from: a */
    public static C33891b m62546a(int i) {
        if (i == 0) {
            return INVOCATION_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return IMPLICIT;
        }
        if (i == 2) {
            return EXPLICIT;
        }
        if (i == 3) {
            return CANCELED;
        }
        if (i != 4) {
            return null;
        }
        return EXECUTED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f90423g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
