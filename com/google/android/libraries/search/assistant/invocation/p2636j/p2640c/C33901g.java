package com.google.android.libraries.search.assistant.invocation.p2636j.p2640c;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.j.c.g */
/* compiled from: PG */
public enum C33901g implements C62957cd {
    UNKNOWN(0),
    INVALID_INVOCATION_TOKEN(1),
    INVALID_STATE_TRANSITION(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f90441e;

    private C33901g(int i) {
        this.f90441e = i;
    }

    /* renamed from: a */
    public static C33901g m62558a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return INVALID_INVOCATION_TOKEN;
        }
        if (i != 2) {
            return null;
        }
        return INVALID_STATE_TRANSITION;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f90441e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
